package com.musicweb.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.musicweb.constant.UserConstant;
import com.musicweb.domain.Song;
import com.musicweb.service.SongService;

/**
 * 歌曲下载模块控制器类
 * 
 * @author brian
 *
 */
@Controller
@RequestMapping("/download")
public class DownloadController {
	
	@Resource
	private SongService songService; 
	
	/**
	 * 用来拼接绝对路径
	 */
	private String classPath = this.getClass().getClassLoader().getResource("").getPath();
	private String WebInfoPath = classPath.substring(0, classPath.indexOf("/classes"));
	
	/**
	 * 下载歌曲音频文件
	 * 
	 * @param request http request，用于获取浏览器类型
	 * @param response http response，用户返回文件输出流
	 * @param id 所要下载的歌曲id
	 * @return 不需要返回值
	 */
	@RequestMapping(value = "/downloadSong", method = RequestMethod.GET)
	public void download(HttpServletRequest request, HttpServletResponse response, int id) {
		HttpSession session = request.getSession();
		String userId = (String) session.getAttribute(UserConstant.USER_ID);
		
		//test
		//String testUserId = "public@qq.com";
		//userId = testUserId;
		
		if(userId != null) {
			Song song = songService.getInfo(id);
			if(song != null) {
				String path = song.getFilePath();
				File file = new File(WebInfoPath + path);
				if(file.exists()) {
					try (OutputStream os = new BufferedOutputStream(response.getOutputStream())) {
		                response.setContentType("application/octet-stream");
		                String fileName = path.substring(path.lastIndexOf('/')+1);//指定文件下载之后的名字
		                if (request.getHeader("User-Agent").toUpperCase().indexOf("MSIE") > 0) {   //IE浏览器
		                    fileName = URLEncoder.encode(fileName, "UTF-8");
		                } else {
		                    fileName = URLDecoder.decode(fileName, "UTF-8");//其他浏览器
		                }
		                response.setHeader("Content-disposition", "attachment; filename="
		                        + new String(fileName.getBytes("utf-8"), "ISO8859-1")); // 指定下载的文件名
		                os.write(FileUtils.readFileToByteArray(file));
		                os.flush();
		            } catch (IOException e) {
		                e.printStackTrace();
		            }
				}
			}
		}
	}//测试成功，返回boolean的话后台会报错，但浏览器能正常获取文件只是无法获取布尔值
	
}

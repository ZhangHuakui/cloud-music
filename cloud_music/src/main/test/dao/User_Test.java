package dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import base.BaseTest;

import com.musicweb.dao.UserDao;
import com.musicweb.domain.Album;
import com.musicweb.domain.Song;
import com.musicweb.domain.User;

public class User_Test extends BaseTest {
	@Autowired
	UserDao usermapper;

//	 @Test
	public void test_insert() {
		try {
			User user = new User("2863435252@qq.com", "颜常霖", "2018HiFive", null, 1, 1, "rien", 0);
			usermapper.insert(user);
			System.out.println("test_insert succeed");
		} finally {
		}
	}

//	@Test
	public void test_insertLikeSong() {
		try {
			usermapper.insertLikeSong("2863435252@qq.com", 1);
			System.out.println("test_insertLikeSong succeed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	 @Test
	public void test_insertLikeAlbum() {
		try {
			usermapper.insertLikeAlbum("2863435252@qq.com", 1);
			System.out.println("test_insertLikeAlbum succeed");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

//	 @Test
	public void test_deleteLikeSong() {
		try {
			usermapper.deleteLikeSong("2863435252@qq.com", 1);
			System.out.println("test_deleteLikeSong succeed");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

//	 @Test
	public void test_deleteLikeAlbum() {
		try {
			usermapper.deleteLikeAlbum("2863435252@qq.com", 1);
			System.out.println("test_deleteLikeAlbum succeed");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//	 @Test
	public void test_deleteLikeSongInAll() {
		try {
			usermapper.deleteLikeSongInAll(1);
			System.out.println("test_deleteLikeSongInAll succeed");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
//	 @Test
	public void test_deleteLikeAlbumInAll() {
		try {
			usermapper.deleteLikeAlbumInAll(1);
			System.out.println("test_deleteLikeAlbumInAll succeed");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

//	 @Test
	public void test_update() {
		try {
			User user = new User("2863435252@qq.com", "庄仁鑫", "2018HiFive", null, 1, 1, "rien", 1);
			usermapper.update(user);
			System.out.println("test_update succeed");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}	

//	 @Test
	public void test_updateImage() {
		try {
			usermapper.updateImage("2863435252@qq.com", "ftp://zhizhang.jpg");
			System.out.println("test_updateImage succeed");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

//	 @Test
	public void test_updatePassword() {
		try {
			usermapper.updatePassword("2863435252@qq.com", "HifiveForever");
			System.out.println("test_updatePassword succeed");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

//	 @Test
	public void test_select() {
		try {
			User u = usermapper.select("guoyun111zhe@gmail.com");
			System.out.println(u == null);
			System.out.println("test_select succeed");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

//	 @Test
	public void test_selectPassword() {
		try {
			usermapper.selectPassword("guozyunzhe.se@gmail.com");
			System.out.println("test_selectPassword succeed");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

//	 @Test
	public void test_selectLikeSongs() {
		try {
			List<Song> S=usermapper.selectLikeSongs("guozyunzhe.se@gmail.com");
			System.out.println("test_selectLikeSongs succeed");
			for(Song s : S) {
				System.out.println(s.getName());
				System.out.println(s.getArtistName());
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

//	 @Test
	public void test_selectLikeAlbums() {
		try {
			List<Album> A= usermapper.selectLikeAlbums("guozyunzhe.se@gmail.com");
			System.out.println("test_selectLikeAlbums succeed");
			for(Album a : A) {
				System.out.println(a.getName());
				System.out.println(a.getArtistName());
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

//	@Test
	public void test_selectQuestion() {
		try {
			usermapper.selectQuestion("guozyunzhe.se@gmail.com");
			System.out.println("test_selectQuestion succeed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	 @Test
	public void test_selectAnswer() {
		try {
			usermapper.selectAnswer("guozyunzhe.se@gmail.com");
			System.out.println("test_selectAnswer succeed");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

//	 @Test
	public void test_selectPlaylists() {
		try {
			usermapper.selectPlaylists("guozyunzhe.se@gmail.com");
			System.out.println("test_selectPlaylists succeed");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	 
}

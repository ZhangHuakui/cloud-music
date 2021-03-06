package com.musicweb.domain;

import java.util.Date;

public class Song {
	private int id;
	private String name;
	private int albumId;
	private String albumName;
	private int artistId;
	private String artistName;
	private int playCount;
	private String lyricsPath;
	private String image;
	private String language;
	private int style;
	private Date releaseDate;
	private String filePath;
	private String duration;
	private int region;

	
	//FOR DATABASE INSERT
	public Song(String name, int albumId, int artistId, int playCount, String lyricsPath, String image, String language,
			int style, Date releaseDate, String filePath, int region) {
		super();
		this.name = name;
		this.albumId = albumId;
		this.artistId = artistId;
		this.playCount = playCount;
		this.lyricsPath = lyricsPath;
		this.image = image;
		this.language = language;
		this.style = style;
		this.releaseDate = releaseDate;
		this.filePath = filePath;
		this.region = region;
	}
	//FOR DATABASE UPDATE
	public Song(int id, String name, int albumId, int artistId, int playCount, String lyricsPath, String image,
			String language, int style, Date releaseDate, String filePath, int region) {
		super();
		this.id = id;
		this.name = name;
		this.albumId = albumId;
		this.artistId = artistId;
		this.playCount = playCount;
		this.lyricsPath = lyricsPath;
		this.image = image;
		this.language = language;
		this.style = style;
		this.releaseDate = releaseDate;
		this.filePath = filePath;
		this.region = region;
	}

	public Song(int id, String name, int albumId, String albumName, int artistId, String artistName, int playCount,
			String lyricsPath, String image, String language, int style, Date releaseDate, String filePath,
			String duration, int region) {
		super();
		this.id = id;
		this.name = name;
		this.albumId = albumId;
		this.albumName = albumName;
		this.artistId = artistId;
		this.artistName = artistName;
		this.playCount = playCount;
		this.lyricsPath = lyricsPath;
		this.image = image;
		this.language = language;
		this.style = style;
		this.releaseDate = releaseDate;
		this.filePath = filePath;
		this.duration = duration;
		this.region = region;
	}

	public Song() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAlbumId() {
		return albumId;
	}

	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}

	public int getArtistId() {
		return artistId;
	}

	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getLyricsPath() {
		return lyricsPath;
	}

	public void setLyricsPath(String lyricsPath) {
		this.lyricsPath = lyricsPath;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public int getPlayCount() {
		return playCount;
	}

	public void setPlayCount(int playCount) {
		this.playCount = playCount;
	}

	public int getStyle() {
		return style;
	}

	public void setStyle(int style) {
		this.style = style;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	public int getRegion() {
		return region;
	}
	
	public void setRegion(int region) {
		this.region=region;
	}
	
	@Override
	public String toString() {
		return "Song [id=" + id + ", name=" + name + ", albumId=" + albumId + ", albumName=" + albumName + ", artistId="
				+ artistId + ", artistName=" + artistName + ", playCount=" + playCount + ", lyricsPath=" + lyricsPath
				+ ", image=" + image + ", language=" + language + ", style=" + style + ", releaseDate=" + releaseDate
				+ ", filePath=" + filePath + ", duration=" + duration + ", region=" + region + "]";
	}
	
}

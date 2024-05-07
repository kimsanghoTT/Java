package com.kh.practice.list.music.model.vo;

public class Music implements Comparable<Music>{

	private String title;
	private String singer;
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}
	public Music() {
		// TODO Auto-generated constructor stub
	}

	public Music(String title, String singer) {
		
		this.title = title;
		this.singer = singer;
	}
	@Override
	public String toString() {
		return "곡 제목 : " + title + ", 가수 : " + singer;
	}
	
	//sort compareTo 비교의 기준 만들기
	@Override
	public int compareTo(Music music) {
		return this.title.compareTo(music.title);
	}

}

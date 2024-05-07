package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {

	private List<Music> list = new ArrayList<>();
	
	public int addList(String title, String singer) {
		return list.add(new Music(title, singer)) ? 1 : 0;
		//만약에 추가가 성공 됐다면 1, 아니면 0 반환
	}
	
	public int addAtZero(Music music) {
		list.add(0, music);
		//맨 앞에 다시 자리값을 만들고, 내가 추가하는 값이 무조건 0자리가 될 수 있도록 해줌
		return 1;
	}
	
	public List<Music> printAll() {
		return list;
	}
	
	public Music searchMusic(String title) {
		for(Music music : list) {
			if(music.getTitle().equals(title)) {
				return music;
			}
		}
		return null;
	}
	
    public Music removeMusic(String title) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTitle().equals(title)) {
                return list.remove(i);
            }
        }
        return null;
    }
    //음악에서 가수만 수정
	public Music setMusic(String title, String singer) {
		for(Music music : list) {
			if(music.getTitle().equals(title)) {
				//music.setTitle(title);
				music.setSinger(singer);
				return music;
			}
		}
		return null;
	}
	
	public void ascTitle() {
		Collections.sort(list);
		
	}
	
	public void descSinger() {
		Collections.sort(list, new AscTitle());
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	
}

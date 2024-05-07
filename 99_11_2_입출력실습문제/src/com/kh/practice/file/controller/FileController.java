package com.kh.practice.file.controller;

import com.kh.practice.file.model.dao.FileDAO;

public class FileController {

	private FileDAO fd = new FileDAO();
	
	//이름이 존재하는지 확인
	public boolean checkName(String file) {
		return fd.checkName(file);
	}
	//파일 저장로직
	public void fileSave(String file, StringBuilder sb) {
		fd.fileSave(file, sb.toString());
		
	}
	//파일 열기
	public StringBuilder fileOpen(String file) {
		return fd.fileOpen(file);
	}
	
	public void fileEdit(String file, StringBuilder sb) {
		fd.fileEdit(file, sb.toString());
	}
}

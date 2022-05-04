package com.springbd.service;

import java.util.List;

import com.springbd.domain.BoardVO;

public interface BoardService {
	
	public void enroll(BoardVO board);
	
	public List<BoardVO> getList();
	
	public BoardVO getPage(int bno);
}

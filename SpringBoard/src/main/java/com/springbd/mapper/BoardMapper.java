package com.springbd.mapper;

import java.util.List;

import com.springbd.domain.BoardVO;

public interface BoardMapper {
	
	public void enroll(BoardVO board);
	
	public List<BoardVO> getList();
	
	public BoardVO getPage(int bno);
}

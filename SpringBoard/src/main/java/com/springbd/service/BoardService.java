package com.springbd.service;

import java.util.List;

import com.springbd.domain.BoardVO;
import com.springbd.domain.Criteria;

public interface BoardService {
	
	public void enroll(BoardVO board);
	
	public List<BoardVO> getList();
	
	public BoardVO getPage(int bno);
	
	public int modify(BoardVO vo);
	
	public int delete(int bno);
	
	public List<BoardVO> getListPaging(Criteria cri);
}

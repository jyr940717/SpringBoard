package com.springbd.mapper;

import java.util.List;

import com.springbd.domain.BoardVO;
import com.springbd.domain.Criteria;

public interface BoardMapper {
	
	public void enroll(BoardVO board);
	
	public List<BoardVO> getList();
	
	public BoardVO getPage(int bno);
	
	public int modify(BoardVO board);
	
	public int delete(int bno);

	public List<BoardVO> getListPaging(Criteria cri);
	
	public int getTotal();
}

package com.springbd.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.springbd.domain.BoardVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTests {
	
	@Autowired
	private BoardService service;
	
//	@Test
//	public void enroll() {
//		BoardVO vo = new BoardVO();
//		
//		vo.setContent("Service Contents");
//		vo.setTitle("Service Title");
//		vo.setWriter("Service Writer");
//		
//		service.enroll(vo);
//		
//	}	
	
//	@Test
//	public void testGetList() {
//		
//		service.getList().forEach(board -> log.info("" + board));
//		
//	}
	
	@Test
	public void testGetPage() {
		
		int bno = 3;
		log.info("" + service.getPage(bno));
	}
}		

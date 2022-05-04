package com.springbd.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.springbd.domain.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardServiceTests {
	
	@Autowired
	private BoardService service;
	
	@Test
	public void enroll() {
		BoardVO vo = new BoardVO();
		
		vo.setContent("Service Contents");
		vo.setTitle("Service Title");
		vo.setWriter("Service Writer");
		
		service.enroll(vo);
		
	}	
}		

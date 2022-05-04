package com.springbd.mapper;
		
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.springbd.domain.BoardVO;
import com.springbd.mapper.BoardMapper;

import jdk.internal.org.jline.utils.Log;
import lombok.extern.log4j.Log4j;
		
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTest {
		
	@Autowired
	private BoardMapper mapper;
//		
//	@Test
//	public void TestEnroll() {
//		BoardVO vo = new BoardVO();
//		
//		vo.setTitle("mapper test");
//		vo.setContent("mapper test");
//		vo.setWriter("mapper test");
//		
//		mapper.enroll(vo);
//	}	
	
//	@Test
//	public void testGetList() {
//		
//		List list = mapper.getList();
//		for(int i=0; i<list.size();i++) {
//			log.info("" + list.get(i));
//		}
//	
//		for(Object a : list) {
//			log.info("" + a);
//		}
//		
//		list.forEach(board -> log.info("" + board));
//		
//	}
	
	@Test
	public void testGetPage() {
		int bno = 2;
		
		log.info(""+ mapper.getPage(bno));
	}
}
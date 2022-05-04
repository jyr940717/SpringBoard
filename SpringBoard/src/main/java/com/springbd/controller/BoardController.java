package com.springbd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springbd.domain.BoardVO;
import com.springbd.service.BoardService;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/board/*")
@Log4j
public class BoardController {
	
	@Autowired
	private BoardService bservice;
	
	@GetMapping("/get")
	public void boardGetPageGET(int bno, Model model) {
		
		log.info(bno+"번 게시물");
		
		model.addAttribute("pageInfo", bservice.getPage(bno));
	}
	
	@GetMapping("/list")
	public void boardListGet(Model model) {
		log.info("게시판 목록 페이지");
		
		model.addAttribute("list",bservice.getList());
	}
	
	@GetMapping("/enroll")
	public void boardEnrollGet() {
		log.info("게시판 등록 페이지");
	}
	
	@PostMapping("/enroll")
	public String boardEnrollPost(BoardVO board, RedirectAttributes rttr) {
		
		log.info("BoardVO : " + board);
		
		bservice.enroll(board);
		
		rttr.addFlashAttribute("result", "enroll success");
		
		return "redirect:/board/list";
		
	}
}

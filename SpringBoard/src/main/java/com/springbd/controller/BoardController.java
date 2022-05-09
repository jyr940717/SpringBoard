package com.springbd.controller;

import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springbd.domain.BoardVO;
import com.springbd.domain.Criteria;
import com.springbd.domain.PageMakerDTO;
import com.springbd.service.BoardService;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/board/*")
@Log4j
public class BoardController {
	
	@Autowired
	private BoardService bservice;
	
	@GetMapping("/get")
	public void boardGetPageGET(int bno, Model model,Criteria cri) {
		
		log.info(bno+"번 게시물");
		
		model.addAttribute("pageInfo", bservice.getPage(bno));
		
		model.addAttribute("cri", cri);
		
	}
	
//	@GetMapping("/list")
//	public void boardListGet(Model model) {
//		log.info("게시판 목록 페이지");
//		
//		model.addAttribute("list",bservice.getList());
//	}
	
	@GetMapping("/list")
	public void boardListGET(Model model,Criteria cri) {
		
		log.info("boardListGET");
		
		model.addAttribute("list",bservice.getListPaging(cri));
		
		int total = bservice.getTotal();
		
		PageMakerDTO pageMake = new PageMakerDTO(cri, total);
		
		model.addAttribute("pageMaker", pageMake);
		
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
	@GetMapping("/modify")
	public void boardModifyGet(int bno,Model model,Criteria cri) {
		
		model.addAttribute("pageInfo",bservice.getPage(bno));
		
		model.addAttribute("cri", cri);
		
	}
	
	@PostMapping("/modify")
	public String boardModifyPost(BoardVO board, RedirectAttributes rttr,Criteria cri) {
		
		
		bservice.modify(board);
		
		rttr.addFlashAttribute("result","modify success");
		rttr.addAttribute("bno", board.getBno());
		rttr.addAttribute("pageNum",cri.getPageNum());
		rttr.addAttribute("amount",cri.getAmount());
		
		return "redirect:/board/get";
	}
	
	@PostMapping("/delete")
	public String boardDeletePOST(int bno, RedirectAttributes rttr) {
		
		bservice.delete(bno);
		
		rttr.addFlashAttribute("result", "delete success");
		
		return "redirect:/board/list";
	}
}

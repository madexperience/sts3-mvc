package cs.dit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cs.dit.domain.BoardVO;
import cs.dit.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/board/*") 
@RequiredArgsConstructor

public class BoardController {
	 private final BoardService service;
	 
	 @GetMapping("/list")
	  public void list(Model model) {
	    log.info("list");
	    model.addAttribute("list", service.getList());
	  }
	 
	 @PostMapping("/register")
	 public String  register(BoardVO board, RedirectAttributes rttr) {
		 log.info("register : " + board);
		 int count = service.register(board);
		 
		 if(count==1)
			 rttr.addFlashAttribute("result", "registered");
		 
		 return "redirect:/board/list";
	 }
	 
	 @GetMapping("/board/register")
	 public String registerForm() {
	     return "board/register";
	 }
	}
package com.poseidon.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Boardcontroller {
	//1. board리스트 보는 화면 = board.jsp 
	@Autowired
	private BoardService service;

	@GetMapping("/board")
	public String board(Model model) {

		model.addAttribute("name", "1234");
		// 데이터 붙으기하고자 합니다.

		// service에서 메소드를 불러오겠습니다.
		List<BoardDTO> list = service.boardList();

		if (!list.isEmpty()) {
			model.addAttribute("list", list);
			return "board";

		} else {

			return "redirect:/";// 리다이렉트 : 다시 컨트롤러 지나갑니다.

		}

	}
//2. detail 상세보기 화면 = detail.jsp
		
	@GetMapping("/detail")
	public String detail(HttpServletRequest request) {
		
		
		String bno = request.getParameter("bno");
//		System.out.println(request.getParameter("bno"));
//		  int no = Integer.parseInt(bno);
		 
		try {
			int no = Integer.parseInt(bno);
			System.out.println("숫자입니다.");
		}catch(Exception e) {
			
			System.out.println("숫자가 아닙니다.");
		}
		
		
		
		
		for (int i = 0; i < bno.length(); i++) {
			System.out.println(Character.isDigit(bno.charAt(i)));
			
			
			
		}
		
		
	
		
		
		if(true) {
			
		
			
		}else{
			
			
		}
		
		
	
		
		return "detail";
		
	}
		
		
		
	
		
		
		
		
		
		
		
		

	
}

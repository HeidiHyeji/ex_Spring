package com.example.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.sample.dto.BoardDTO;
import com.example.sample.service.BoardService;


@Controller 
public class BoardController {

	@Autowired
	BoardService boardService;
	
	//1. 글쓰기 화면 보기
	@RequestMapping(value = "/writeForm", method = RequestMethod.GET)
	public String writeForm() {
		return "writeForm"; // /WEB-InF/views/writeForm.jsp
	}
	//2. 글쓰기
	@RequestMapping(value="/write", method= RequestMethod.POST)
	public String write(BoardDTO dto) throws Exception{
		boardService.insertBoard(dto);
		return "redirect:list"; // /WEB-INF/views/writeForm.jsp
	}
	
	//3. 목록보기
	@RequestMapping(value="/list", method= RequestMethod.GET)// /WEB-INF/views/list.jsp
	@ModelAttribute("xxx") //list.jsp에서 List<BoardDTO>를 얻기 위한 key값
	public List<BoardDTO> list() throws Exception{
		List<BoardDTO> list = boardService.selectAllBoard();
		return list;
	}
	
	//4. 글자세히 보기
	@RequestMapping(value="/retrieve", method = RequestMethod.GET) 
	public ModelAndView retrieve(@RequestParam("num") int num) throws Exception {
		BoardDTO dto= boardService.selectBoardByNum(num);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("retrieve");  // /WEB-INF/views/retrieve.jsp
		mav.addObject("retrieve", dto);
		return mav;  
	}
	
	//5. 글 삭제
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(@RequestParam("num") int num) throws Exception {
		int delCount = boardService.deleteBoard(num);
		return "redirect:list"; // /WEB-InF/views/writeForm.jsp
	}

}

package com.mis.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mis.domain.BoardVO;
import com.mis.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Inject
	private BoardService service;
	
	/**
	 * 게시물을 등록하는 register.jsp로 이동
	 * 
	 * @param board	: boardVO 객체
	 * @param model : Model 객체
	 * @throws Exception
	 */
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registerGET(BoardVO board, Model model) throws Exception {
		
		logger.info("regist get.......................");
		
	}
	
	/**
	 * 게시물을 등록해주는 controller
	 * @param board  : 등록할 BoardVO 객체
	 * @param rttr
	 * @return		 : 등록 후 이동할 전체 조회 페이지 Path
	 * @throws Exception
	 */
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerPOST(BoardVO board, RedirectAttributes rttr) throws Exception {
		
		logger.info("regist post.......................");
		logger.info(board.toString());

		service.register(board);
		rttr.addFlashAttribute("msg", "SUCCESS");

//		return "/board/success";
		return "redirect:/board/listAll";

	}
	
	/**
	 * tbl_board 의 데이터를 전체 조회해 주는 Controller
	 * @param board
	 * @param model
	 * @throws Exception
	 */
	@RequestMapping(value = "/listAll", method = RequestMethod.GET)
	public void listAll(BoardVO board, Model model) throws Exception {
		
		logger.info("show all list..........");
		model.addAttribute("list", service.listAll());
		
	}
	
	/**
	 * tbl_board 의 데이터 1건을 조회해 주는 Controller
	 * @param bno
	 * @param model
	 * @throws Exception
	 */
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(@RequestParam("bno") int bno, Model model) throws Exception {
		
		logger.info("show detail list..........");
		model.addAttribute(service.read(bno));
		service.viewCntModify(bno);
		
	}
	
	/**
	 * 게시물을 삭제해주는 Controller
	 * @param bno	: 삭제할 게시물번호 (int bno)
	 * @param rttr
	 * @return		: listAll 쿼리를 실행할 controller로 리턴
	 * @throws Exception
	 */
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String remove(@RequestParam("bno") int bno, RedirectAttributes rttr) throws Exception {
		
		logger.info("remove post.......................");

		service.remove(bno);
		rttr.addFlashAttribute("msg", "SUCCESS");

//		return "/board/success";
		return "redirect:/board/listAll";

	}
	
	/**
	 * 게시물을 수정할 페이지로 이동
	 * 
	 * @param bno	: 수정할 게시물 번호(int bno)
	 * @param model : Model 객체
	 * @throws Exception
	 */
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public void modifyGET(int bno, Model model) throws Exception {
		
		logger.info("modify get.......................");
		model.addAttribute(service.read(bno));
	}
	
	/**
	 * 게시물을 수정해주는 Controller
	 * 
	 * @param board   : BoardVO 객체
	 * @param rttr
	 * @return		  : listAll 해주는 Controller로 이동
	 * @throws Exception
	 */
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modifyPOST(BoardVO board, RedirectAttributes rttr) throws Exception {
		
		logger.info("modify post.......................");

		service.modify(board);
		rttr.addFlashAttribute("msg", "SUCCESS");

//		return "/board/success";
		return "redirect:/board/listAll";

	}

}
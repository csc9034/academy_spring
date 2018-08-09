package com.mis.controller;


import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mis.domain.UserVO;
import com.mis.dto.LoginDTO;
import com.mis.service.UserService;

@Controller
@RequestMapping("/user/*")
public class UserController {
	
	@Inject
	private UserService service;
	private static final Logger LOGGER = LoggerFactory.getLogger(SearchBoardController.class);
	
//	@RequestMapping(value ="/login", method = RequestMethod.GET)
//	public void loginGET(@ModelAttribute("dto") LoginDTO dto) {
//		LOGGER.info("login ...");
//	}
//
//	@RequestMapping(value ="/login", method = RequestMethod.POST)
//	public void loginPOST(@ModelAttribute("dto") LoginDTO dto, HttpSession session, Model model) throws Exception {
//		
//		LOGGER.info("login success...");
//		
//		UserVO vo = service.login(dto);
//		
//		if (vo == null) {
//			return;
//		}
//		
//		model.addAttribute("userVO", vo);
//	}
	
	   @RequestMapping(value = "/login", method = RequestMethod.GET)
	   public void loginGET(@ModelAttribute("dto") LoginDTO dto) {
	      
	   }
	   
	   @RequestMapping(value = "/loginPost", method = RequestMethod.POST)
	   public void loginPOST(LoginDTO dto, HttpSession session, Model model) throws Exception {
	      
	      UserVO vo = service.login(dto);
	      
	      if (vo == null) {
	         return;
	      }
	      
	      model.addAttribute("userVO", vo);
	      
	   }

}

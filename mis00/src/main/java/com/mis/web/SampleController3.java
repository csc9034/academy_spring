package com.mis.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mis.domain.ProductVO;

@Controller
public class SampleController3 {

	private static final Logger LOGGER = LoggerFactory.getLogger(SampleController3.class);

	@RequestMapping("/doD")
	public String doD(Model model) {
		
		//make sample data
		ProductVO product = new ProductVO("Sample Product", 10000);
		
		LOGGER.info("doD");
		
		// 이름을 붙일 경우
		model.addAttribute("product", product);
		// 이름을 붙이지 않을 경우(jsp 페이지에서 productVO 이라는 이름으로 속성 추가)
		model.addAttribute(product);
		
		return "productDetail";
	}
}

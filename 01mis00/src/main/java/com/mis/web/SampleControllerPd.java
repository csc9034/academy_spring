package com.mis.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mis.domain.ProductVO;

@Controller
public class SampleControllerPd {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SampleControllerPd.class);

	@RequestMapping("/doP")

	public String doP(Model model) {
		
		LOGGER.info("doP");
		
		// ��ü ����
		ProductVO product = new ProductVO("û����", 10000, 100, 20);
		
		model.addAttribute("product", product);
		
		return "productDetail2";
		
	}


}

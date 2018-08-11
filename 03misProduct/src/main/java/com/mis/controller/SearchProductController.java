package com.mis.controller;

import javax.inject.Inject;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mis.domain.PageMaker;
import com.mis.domain.ProductVO;
import com.mis.domain.SearchCriteria;
import com.mis.service.ProductService;

@Controller
@RequestMapping("/shop/*")
public class SearchProductController {
   
   private static final Logger logger = LoggerFactory.getLogger(SearchProductController.class);
   
   @Inject
   private ProductService service;
   
   @RequestMapping(value = "/list", method = RequestMethod.GET)
   public void listPage(@ModelAttribute("cri") SearchCriteria cri, Model model) throws Exception {
      
      logger.info(cri.toString());
      
      model.addAttribute("list", service.listSearchCriteria(cri));
      
      PageMaker pageMaker = new PageMaker();
      pageMaker.setCri(cri);
      
      pageMaker.setTotalCount(service.listSearchCount(cri));
      
      logger.info(pageMaker.getTotalCount() + "페이지개수");
      
      model.addAttribute("pageMaker", pageMaker);
      
   }
   
   @RequestMapping(value = "/readPage", method = RequestMethod.GET)
   public void read(@RequestParam("prodcod") int prodcod
               , @ModelAttribute("cri") SearchCriteria cri, Model model) throws Exception {
      
      model.addAttribute(service.read(prodcod));
   }
   
   @RequestMapping(value = "/removePage", method = RequestMethod.POST)
   public String remove(@RequestParam("prodcod") int prodcod, SearchCriteria cri, RedirectAttributes rttr) throws Exception {
      
      service.remove(prodcod);
      
      rttr.addAttribute("page", cri.getPage());
      rttr.addAttribute("perPageNum", cri.getPerPageNum());
      rttr.addAttribute("searchType", cri.getSearchType());
      rttr.addAttribute("keyword", cri.getKeyword());
      
      rttr.addFlashAttribute("msg", "SUCCESS");
      
      return "redirect:/shop/list";
   }
   
   @RequestMapping(value = "/modifyPage", method = RequestMethod.GET)
   public void modifyPageingGET(@RequestParam("prodcod") int prodcod,  @ModelAttribute("cri") SearchCriteria cri
                         , Model model) throws Exception {
      
      model.addAttribute(service.read(prodcod));
      
   }
   @RequestMapping(value = "/modifyPage", method = RequestMethod.POST)
      public String modifyPage(ProductVO product, @ModelAttribute("cri") SearchCriteria cri
                          , RedirectAttributes rttr) throws Exception {
      
         logger.info("mod Post.............");
         logger.info("제발====================================>" + cri.getPage());
         logger.info("mod Post.............");
         
         service.modify(product);
         rttr.addAttribute("page", cri.getPage());
         rttr.addAttribute("perPageNum", cri.getPerPageNum());
         rttr.addAttribute("searchType", cri.getSearchType());
         rttr.addAttribute("keyword", cri.getKeyword());
         rttr.addFlashAttribute("msg", "SUCCESS");
         
         return "redirect:/shop/list";
      
      }
   

   @RequestMapping(value = "/register", method = RequestMethod.GET)
   public void registerGET(ProductVO product, Model model) throws Exception {
      
      logger.info("regist get.......................");
      
   }
   

   @RequestMapping(value = "/register", method = RequestMethod.POST)
   public String registerPOST(ProductVO product, RedirectAttributes rttr) throws Exception {
      
      logger.info("regist post.......................");
      logger.info(product.toString());

      service.register(product);
      rttr.addFlashAttribute("msg", "SUCCESS");

//      return "/board/success";
      return "redirect:/shop/list";

   }
   
}
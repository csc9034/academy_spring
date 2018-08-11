package com.mis.service;

import java.util.List;

import com.mis.domain.ProductVO;
import com.mis.domain.Criteria;
import com.mis.domain.SearchCriteria;

public interface ProductService {
   
public void register(ProductVO vo) throws Exception;
   
   public ProductVO read(Integer bno) throws Exception;
   
   public void modify(ProductVO vo) throws Exception;
   
   public void remove(Integer bno) throws Exception;
   
//   public List<ProductVO> listAll() throws Exception;
//   
//   public List<ProductVO> listCriteria(Criteria cri) throws Exception;
   
   public int listCountCriteria(Criteria cri) throws Exception;
   
   public List<ProductVO> listSearchCriteria(SearchCriteria cri) throws Exception;
   
   public int listSearchCount(SearchCriteria cri) throws Exception;

}
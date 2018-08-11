package com.mis.persistence;

import java.util.List;

import com.mis.domain.Criteria;
import com.mis.domain.ProductVO;
import com.mis.domain.SearchCriteria;

public interface ProductDAO {

   public void create(ProductVO vo) throws Exception;

   public ProductVO read(int bno) throws Exception;

   public void update(ProductVO vo) throws Exception;

   public void delete(int bno) throws Exception;

//   public List<ProductVO> listAll() throws Exception;
//
//   public List<ProductVO> listPage(int page) throws Exception;
//
//   public List<ProductVO> listCriteria(Criteria cri) throws Exception;

   public int countPaging(Criteria cri) throws Exception;

   public List<ProductVO> listSearch(SearchCriteria cri) throws Exception;

   public int listSearchCount(SearchCriteria cri) throws Exception;

}
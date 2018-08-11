package com.mis.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mis.domain.Criteria;
import com.mis.domain.ProductVO;
import com.mis.domain.SearchCriteria;
import com.mis.persistence.ProductDAO;

@Service
public class ProductServiceImpl implements ProductService{
   
   @Inject
   private ProductDAO dao;

   @Override
   public void register(ProductVO vo) throws Exception {
      dao.create(vo);
   }

   @Override
   public ProductVO read(Integer bno) throws Exception {
      return dao.read(bno);
   }

   @Override
   public void modify(ProductVO vo) throws Exception {
      dao.update(vo);
   }

   @Override
   public void remove(Integer bno) throws Exception {
      dao.delete(bno);
   }

//   @Override
//   public List<ProductVO> listAll() throws Exception {
//      return dao.listAll();
//   }
//
//   @Override
//   public List<ProductVO> listCriteria(Criteria cri) throws Exception {
//      return dao.listCriteria(cri);
//   }

   @Override
   public int listCountCriteria(Criteria cri) throws Exception {
      return dao.countPaging(cri);

   }

   @Override
   public List<ProductVO> listSearchCriteria(SearchCriteria cri) throws Exception {
      return dao.listSearch(cri);

   }

   @Override
   public int listSearchCount(SearchCriteria cri) throws Exception {
      return dao.listSearchCount(cri);

   }
}
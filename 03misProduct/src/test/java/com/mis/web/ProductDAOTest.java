package com.mis.web;



import java.util.List;


import javax.inject.Inject;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mis.domain.Criteria;
import com.mis.domain.ProductVO;
import com.mis.persistence.ProductDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class ProductDAOTest {
	
	
	@Inject
	private ProductDAO dao;
	
	private static Logger logger = LoggerFactory.getLogger(ProductDAOTest.class);
	
	
	
	@Test
	public void testCreate() throws Exception {
		ProductVO vo = new ProductVO();
		vo.setProdname("조성철");
		vo.setPrice(1000000);
		vo.setQuantity(1);
		dao.create(vo);
		logger.info("등록 확인" + vo);
	}
	

//	@Test
//	public void testlistAll() throws Exception {
//		dao.listAll();
//		logger.info("전체 조회 확인");
//	}
	
	
	@Test
	public void testUpdate() throws Exception {
		ProductVO vo = new ProductVO();
		vo.setProdcod(6);
		vo.setProdname("조성철3");
		vo.setPrice(1000000);
		vo.setQuantity(6);
		dao.update(vo);
		logger.info("수정 확인" + vo);

	}

	@Test
	public void testRead() throws Exception {
		dao.read(1);
		logger.info("조회 성공");
	}
	
	@Test
	public void testDelete() throws Exception {
		dao.delete(1);
		logger.info("삭제 확인");
	}
	
}

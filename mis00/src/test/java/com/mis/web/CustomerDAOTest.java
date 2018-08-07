package com.mis.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mis.domain.CustomerVO;
import com.mis.persistence.CustomerDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class CustomerDAOTest {
	
	@Inject
	private CustomerDAO dao;
	
	@Test
	/**
	 * customer 테이블에서 데이터 삽입하는 테스트 메소드
	 */
	public void testInsertCustomer() {
		// 객체 선언 및 생성
		CustomerVO vo = new CustomerVO();
		
		// customerVO 객체에 set값 세팅
		vo.setUserid("csc9034");
		vo.setName("조성철");
		vo.setBirthyear(1994);
		vo.setAddress("광주광역시 서구 화정동");
		vo.setPhone("01090609034");
		vo.setGrade("VIP");
		
		// dao 객체에서 insert 쿼리 실행
		dao.insertCustomer(vo);
	}
	
	@Test
	/**
	 * customer 테이블에서 1건의 데이터를 수정하는 테스트 메소드
	 */
	public void testupdateCustomer() {
		// 객체 선언 및 생성
		CustomerVO vo = new CustomerVO();
		
		vo.setUserid("csc9034");
		vo.setName("조성철");
		vo.setBirthyear(1994);
		vo.setAddress("서울특별시 청와대");
		vo.setPhone("01090609034");
		vo.setGrade("VIP");
		
		// dao 객체에서 insert 쿼리 실행
		dao.updateCustomer(vo);
	}
	
	@Test
	/**
	 * customer 테이블에서 1건의 데이터를 삭제하는 테스트 메소드
	 */
	public void testDeleteCustomer() {
		
		dao.deleteCustomer("csc9034");
	}
	
	@Test
	/**
	 * customer 테이블에서 1건의 데이터를 조회하는 테스트 메소드
	 * @throws Exception 
	 * 
	 */
	public void testReadCustomer() throws Exception {
		dao.readCustomer("csc9034");
	}

}

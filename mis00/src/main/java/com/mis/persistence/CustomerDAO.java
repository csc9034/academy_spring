package com.mis.persistence;

import com.mis.domain.CustomerVO;

public interface CustomerDAO {
	
	/**
	 * customer 테이블에 데이터를 삽입하는 메소드
	 * 
	 * @param vo : CustomerVO 객체
	 */
	public void insertCustomer(CustomerVO vo);
	
	/**
	 * customer 테이블에서 해당 userid의 데이터를 조회하는 메소드
	 * 
	 * @param userid     : customer 테이블의 userid
	 * @return			 : CustomerVO 객체
	 * @throws Exception
	 */
	public CustomerVO readCustomer(String userid) throws Exception;
	
	/**
	 * customer 테이블에서 데이터를 수정하는 메소드
	 * 
	 * @param vo : CustomerVO 객체
	 */
	public void updateCustomer(CustomerVO vo);
	
	/**
	 * customer 테이블에서 데이터를 삭제하는 메소드
	 * 
	 * @param userid : : customer 테이블의 삭제 할 userid
	 */
	public void deleteCustomer(String userid);
}

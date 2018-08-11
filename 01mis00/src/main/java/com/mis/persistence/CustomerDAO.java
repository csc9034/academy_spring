package com.mis.persistence;

import com.mis.domain.CustomerVO;

public interface CustomerDAO {
	
	/**
	 * customer ���̺� �����͸� �����ϴ� �޼ҵ�
	 * 
	 * @param vo : CustomerVO ��ü
	 */
	public void insertCustomer(CustomerVO vo);
	
	/**
	 * customer ���̺��� �ش� userid�� �����͸� ��ȸ�ϴ� �޼ҵ�
	 * 
	 * @param userid     : customer ���̺��� userid
	 * @return			 : CustomerVO ��ü
	 * @throws Exception
	 */
	public CustomerVO readCustomer(String userid) throws Exception;
	
	/**
	 * customer ���̺��� �����͸� �����ϴ� �޼ҵ�
	 * 
	 * @param vo : CustomerVO ��ü
	 */
	public void updateCustomer(CustomerVO vo);
	
	/**
	 * customer ���̺��� �����͸� �����ϴ� �޼ҵ�
	 * 
	 * @param userid : : customer ���̺��� ���� �� userid
	 */
	public void deleteCustomer(String userid);
}

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
	 * customer ���̺��� ������ �����ϴ� �׽�Ʈ �޼ҵ�
	 */
	public void testInsertCustomer() {
		// ��ü ���� �� ����
		CustomerVO vo = new CustomerVO();
		
		// customerVO ��ü�� set�� ����
		vo.setUserid("csc9034");
		vo.setName("����ö");
		vo.setBirthyear(1994);
		vo.setAddress("���ֱ����� ���� ȭ����");
		vo.setPhone("01090609034");
		vo.setGrade("VIP");
		
		// dao ��ü���� insert ���� ����
		dao.insertCustomer(vo);
	}
	
	@Test
	/**
	 * customer ���̺��� 1���� �����͸� �����ϴ� �׽�Ʈ �޼ҵ�
	 */
	public void testupdateCustomer() {
		// ��ü ���� �� ����
		CustomerVO vo = new CustomerVO();
		
		vo.setUserid("csc9034");
		vo.setName("����ö");
		vo.setBirthyear(1994);
		vo.setAddress("����Ư���� û�ʹ�");
		vo.setPhone("01090609034");
		vo.setGrade("VIP");
		
		// dao ��ü���� insert ���� ����
		dao.updateCustomer(vo);
	}
	
	@Test
	/**
	 * customer ���̺��� 1���� �����͸� �����ϴ� �׽�Ʈ �޼ҵ�
	 */
	public void testDeleteCustomer() {
		
		dao.deleteCustomer("csc9034");
	}
	
	@Test
	/**
	 * customer ���̺��� 1���� �����͸� ��ȸ�ϴ� �׽�Ʈ �޼ҵ�
	 * @throws Exception 
	 * 
	 */
	public void testReadCustomer() throws Exception {
		dao.readCustomer("csc9034");
	}

}

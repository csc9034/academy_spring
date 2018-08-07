package com.mis.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mis.domain.MemberVO;
import com.mis.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MemberDAOTest {
	
	@Inject
	private MemberDAO dao;

//	@Test
//	public void testInsertMember() throws Exception {
//		
//		MemberVO vo = new MemberVO();
//		vo.setUserid("user00");
//		vo.setUserpw("user00");
//		vo.setUsername("user");
//		vo.setEmail("user83@naver.com");
//		
//		dao.insertMember(vo);
//		
//		System.out.println(vo);
//	}
	
//	@Test
//	public void testTime() throws Exception {
//		System.out.println(dao.getTime());
//	}
	
//	@Test
//	public void testSelectPW() throws Exception {
//		
//		System.out.println(dao.readWithPW("csc9034", "129cho"));
//	
//	}
//
	
	@Test
	public void testUpdateMember() throws Exception {
		MemberVO vo = new MemberVO();
		vo.setUserid("csc9034");
		vo.setUserpw("cho");
		vo.setUsername("Á¶¼ºÃ¶");
		vo.setEmail("police9034@naver.com");
		
		dao.updateMember(vo);
	}
	
	@Test
	public void testDeleteMember() throws Exception {
		dao.deleteMember("user00", "user00");
	}
	
	@Test
	public void testSelectUser() throws Exception {
		
		System.out.println(dao.readMember("user00"));
		
	}

}

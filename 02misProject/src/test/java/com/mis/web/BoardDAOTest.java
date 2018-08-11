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

import com.mis.domain.BoardVO;
import com.mis.domain.Criteria;
import com.mis.persistence.BoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class BoardDAOTest {
	
	
	@Inject
	private BoardDAO dao;
	
	private static Logger logger = LoggerFactory.getLogger(BoardDAOTest.class);
	
	
	
	@Test
	public void testCreate() throws Exception {
		BoardVO vo = new BoardVO("���ο� ���� �ֽ��ϴ�.", "�׽�Ʈ �ϰ� �ֽ��ϴ�^^", "user00");
		dao.create(vo);
		logger.info("��� Ȯ��" + vo);
	}
	
	@Test
	public void testCreate2() throws Exception {
		BoardVO vo = new BoardVO("�ι�° ���� �ֽ��ϴ�.", "�ι�° �׽�Ʈ �ϰ� �ֽ��ϴ�^^", "user01");
		dao.create(vo);
		logger.info("��� Ȯ��" + vo);
	}

	@Test
	public void testlistAll() throws Exception {
		dao.listAll();
		logger.info("��ü ��ȸ Ȯ��");
	}
	
	
	@Test
	public void testUpdate() throws Exception {
		BoardVO vo = new BoardVO(1, "������ ���Դϴ�.", "���� �׽�Ʈ");
		dao.update(vo);
		logger.info("���� Ȯ��" + vo);

	}

	@Test
	public void testRead() throws Exception {
		dao.read(1);
		logger.info("��ȸ ����");
	}
	
	@Test
	public void testDelete() throws Exception {
		dao.delete(1);
		logger.info("���� Ȯ��");
	}
	
	@Test
	public void testCriteria() throws Exception {
		Criteria cri = new Criteria();
		cri.setPage(2);
		
		List<BoardVO> list = dao.listCriteria(cri);
		
		for(BoardVO board : list) {
			logger.info(board.getBno() + ":" + board.getTitle());
		}
	}
}

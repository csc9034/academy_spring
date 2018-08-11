package com.mis.persistence;

import java.util.List;

import com.mis.domain.BoardVO;
import com.mis.domain.Criteria;
import com.mis.domain.SearchCriteria;

/**
 * tbl_board ���̺��� �⺻���� DB ���� CRUD�� ������ �������̽�
 * 
 * @author CHO
 *
 */
public interface BoardDAO {
	
	/**
	 * tbl_board ���̺��� ����ϴ� �޼ҵ�
	 * 
	 * @param vo : BoardVO ��ü
	 * @throws Exception
	 */
	public void create(BoardVO vo) throws Exception;
	
	/**
	 * tbl_board ���̺��� 1���� �����͸� ��ȸ�ϴ� �޼ҵ�
	 * 
	 * @param bno	: ��ȸ�� �Խ��� ��ȣ(int bno)
	 * @return		: BoardVO ��ü
	 * @throws Exception
	 */
	public BoardVO read(int bno) throws Exception;
	
	/**
	 * tbl_board ���̺��� 1���� �����͸� �����ϴ� �޼ҵ�
	 * 
	 * @param vo	: BoardVO ��ü
	 * @throws Exception
	 */
	public void update(BoardVO vo) throws Exception;
	
	/**
	 * tbl_board ���̺��� 1���� �����͸� �����ϴ� �޼ҵ�
	 * 
	 * @param bno	: ��ȸ�� �Խ��� ��ȣ(int bno)
	 * @throws Exception
	 */
	public void delete(int bno) throws Exception;
	
	/**
	 * tbl_board �� �����͸� ��ü ��ȸ�ϴ� �޼ҵ�
	 * 
	 * @return	: BoardVO List
	 * @throws Exception
	 */
	public List<BoardVO> listAll() throws Exception;
	
	/**
	 * �Խù� ��ȸ�� ��ȸ���� update ���ִ� �޼ҵ�
	 * 
	 * @param bno  : ��ȸ��, ��ȸ���� �ø� �Խ��� ��ȣ(int bno)
	 * @throws Exception
	 */
	public void updateView(int bno) throws Exception;
	
	public List<BoardVO> listPage(int page) throws Exception;
	
	public List<BoardVO> listCriteria(Criteria cri) throws Exception;
	
	public int countPaging(Criteria cri) throws Exception;
	
	public List<BoardVO> listSearch(SearchCriteria cri) throws Exception;
	
	public int listSearchCount(SearchCriteria cri) throws Exception;

}

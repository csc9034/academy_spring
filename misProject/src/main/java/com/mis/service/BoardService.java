package com.mis.service;

import java.util.List;

import com.mis.domain.BoardVO;

/**
 * ����� �䱸�� �����ϴ� DAO�� �����Ͽ�
 * ������ �������̽�
 * 
 * @author CHO
 *
 */
public interface BoardService {
	
	public void register(BoardVO vo) throws Exception;
	
	public BoardVO read(Integer bno) throws Exception;
	
	public void modify(BoardVO vo) throws Exception;
	
	public void remove(Integer bno) throws Exception;
	
	public List<BoardVO> listAll() throws Exception;
	
	public void viewCntModify(Integer bno) throws Exception;


}

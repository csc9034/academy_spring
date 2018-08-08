package com.mis.service;

import java.util.List;

import com.mis.domain.BoardVO;

/**
 * 사용자 요구에 충족하는 DAO를 조합하여
 * 정의한 인터페이스
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

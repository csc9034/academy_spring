package com.mis.persistence;

import java.util.List;

import com.mis.domain.BoardVO;
import com.mis.domain.Criteria;
import com.mis.domain.SearchCriteria;

/**
 * tbl_board 테이블의 기본적인 DB 쿼리 CRUD를 정의한 인터페이스
 * 
 * @author CHO
 *
 */
public interface BoardDAO {
	
	/**
	 * tbl_board 테이블에서 등록하는 메소드
	 * 
	 * @param vo : BoardVO 객체
	 * @throws Exception
	 */
	public void create(BoardVO vo) throws Exception;
	
	/**
	 * tbl_board 테이블에서 1건의 데이터를 조회하는 메소드
	 * 
	 * @param bno	: 조회할 게시판 번호(int bno)
	 * @return		: BoardVO 객체
	 * @throws Exception
	 */
	public BoardVO read(int bno) throws Exception;
	
	/**
	 * tbl_board 테이블에서 1건의 데이터를 수정하는 메소드
	 * 
	 * @param vo	: BoardVO 객체
	 * @throws Exception
	 */
	public void update(BoardVO vo) throws Exception;
	
	/**
	 * tbl_board 테이블에서 1건의 데이터를 삭제하는 메소드
	 * 
	 * @param bno	: 조회할 게시판 번호(int bno)
	 * @throws Exception
	 */
	public void delete(int bno) throws Exception;
	
	/**
	 * tbl_board 의 데이터를 전체 조회하는 메소드
	 * 
	 * @return	: BoardVO List
	 * @throws Exception
	 */
	public List<BoardVO> listAll() throws Exception;
	
	/**
	 * 게시물 조회시 조회수를 update 해주는 메소드
	 * 
	 * @param bno  : 조회한, 조회수를 올릴 게시판 번호(int bno)
	 * @throws Exception
	 */
	public void updateView(int bno) throws Exception;
	
	public List<BoardVO> listPage(int page) throws Exception;
	
	public List<BoardVO> listCriteria(Criteria cri) throws Exception;
	
	public int countPaging(Criteria cri) throws Exception;
	
	public List<BoardVO> listSearch(SearchCriteria cri) throws Exception;
	
	public int listSearchCount(SearchCriteria cri) throws Exception;

}

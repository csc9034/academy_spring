package com.mis.persistence;

import com.mis.domain.MemberVO;

public interface MemberDAO {
	
	/**
	 * 현재 시간을 구하는 메소드
	 * 
	 * @return : 현재 시간(String 타입)
	 */
	public String getTime();
	
	/**
	 * Member 테이블에 데이터를 삽입하는 메소드
	 * 
	 * @param vo : MemberVO 객체
	 */
	public void insertMember(MemberVO vo);
	
	/**
	 * parameter의 값인 userid의 데이터를 조회하는 메소드
	 * 
	 * @param userid : Member 테이블의 userid
	 * @return       : MemberVO 객체
	 * @throws Exception
	 */
	public MemberVO readMember (String userid) throws Exception;
	
	/**
	 * parameter의 값은 userid와 userpw의 데이터를 조회하는 메소드
	 * @param userid : Member 테이블의 userid
	 * @param userpw : Member 테이블의 userpw
	 * @return		 : MemberVO 객체
	 * @throws Exception
	 */
	public MemberVO readWithPW (String userid, String userpw) throws Exception;
	
	/**
	 * Member 테이블의 데이터를 수정하는 메소드
	 * @param vo         : MemberVO 객체
	 * @throws Exception
	 */
	public void updateMember (MemberVO vo) throws Exception;
	
	/**
	 * Member 테이블의 데이터를 삭제하는 메소드
	 * @param userid : Member 테이블의 userid
	 * @param userpw : Member 테이블의 userpw
	 * @throws Exception
	 */
	public void deleteMember (String userid, String userpw) throws Exception;
}

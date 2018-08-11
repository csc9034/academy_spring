package com.mis.persistence;

import com.mis.domain.MemberVO;

public interface MemberDAO {
	
	/**
	 * ���� �ð��� ���ϴ� �޼ҵ�
	 * 
	 * @return : ���� �ð�(String Ÿ��)
	 */
	public String getTime();
	
	/**
	 * Member ���̺� �����͸� �����ϴ� �޼ҵ�
	 * 
	 * @param vo : MemberVO ��ü
	 */
	public void insertMember(MemberVO vo);
	
	/**
	 * parameter�� ���� userid�� �����͸� ��ȸ�ϴ� �޼ҵ�
	 * 
	 * @param userid : Member ���̺��� userid
	 * @return       : MemberVO ��ü
	 * @throws Exception
	 */
	public MemberVO readMember (String userid) throws Exception;
	
	/**
	 * parameter�� ���� userid�� userpw�� �����͸� ��ȸ�ϴ� �޼ҵ�
	 * @param userid : Member ���̺��� userid
	 * @param userpw : Member ���̺��� userpw
	 * @return		 : MemberVO ��ü
	 * @throws Exception
	 */
	public MemberVO readWithPW (String userid, String userpw) throws Exception;
	
	/**
	 * Member ���̺��� �����͸� �����ϴ� �޼ҵ�
	 * @param vo         : MemberVO ��ü
	 * @throws Exception
	 */
	public void updateMember (MemberVO vo) throws Exception;
	
	/**
	 * Member ���̺��� �����͸� �����ϴ� �޼ҵ�
	 * @param userid : Member ���̺��� userid
	 * @param userpw : Member ���̺��� userpw
	 * @throws Exception
	 */
	public void deleteMember (String userid, String userpw) throws Exception;
}

package com.mis.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mis.domain.CustomerVO;

@Repository
public class CustomerDAOImpl implements CustomerDAO{
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace="com.mis.mapper.CustomerMapper";
	
	@Override
	public void insertCustomer(CustomerVO vo) {
		sqlSession.insert(namespace + ".insertCustomer", vo);
	}

	@Override
	public CustomerVO readCustomer(String userid) throws Exception {
		return sqlSession.selectOne(namespace + ".readCustomer", userid);
	}

	@Override
	public void updateCustomer(CustomerVO vo) {
		sqlSession.update(namespace + ".updateCustomer", vo);
		
	}

	@Override
	public void deleteCustomer(String userid) {
		sqlSession.delete(namespace + ".deleteCustomer", userid);
	}

}

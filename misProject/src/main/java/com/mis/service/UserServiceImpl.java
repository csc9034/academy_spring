package com.mis.service;

import javax.inject.Inject;
import org.springframework.stereotype.Repository;

import com.mis.domain.UserVO;
import com.mis.dto.LoginDTO;
import com.mis.persistence.UserDAO;

@Repository
public class UserServiceImpl implements UserService{
	

	@Inject
	private UserDAO dao;

	@Override
	public UserVO login(LoginDTO dto) throws Exception {
		return dao.login(dto);
	}
	
	

}

package kr.co.portfolio.user.service;

import org.springframework.stereotype.Service;

import kr.co.portfolio.vo.UserVO;

@Service(value="UserService")
public class UserServiceImpl implements UserService{

	@Override
	public boolean signup(UserVO user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserVO profile(UserVO user) {
		// TODO Auto-generated method stub
		return null;
	}

}

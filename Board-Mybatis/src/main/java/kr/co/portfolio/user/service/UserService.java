package kr.co.portfolio.user.service;

import kr.co.portfolio.vo.UserVO;

public interface UserService {

	/** signup User */
	public boolean signup(UserVO user);
	/** profile User */
	public UserVO profile(UserVO user);
	
}

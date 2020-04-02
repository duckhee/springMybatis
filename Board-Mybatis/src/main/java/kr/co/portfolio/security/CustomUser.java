package kr.co.portfolio.security;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import kr.co.portfolio.vo.UserVO;
import lombok.Getter;

@Getter
public class CustomUser extends User{
	
	private static final long serialVersionUID = 1L;
	
	private UserVO user;
	/** Security User */
	public CustomUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		// TODO Auto-generated constructor stub
		super(username, password, authorities);
	}
	
	public CustomUser(UserVO user) {
		super(user.getEmail(), user.getPassword(), user.getRoles().stream().map(role->new SimpleGrantedAuthority(role.getRole())).collect(Collectors.toList()));
	}

}

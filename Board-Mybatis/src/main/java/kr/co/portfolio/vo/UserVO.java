package kr.co.portfolio.vo;

import java.sql.Date;
import java.util.List;

import lombok.Data;

@Data
public class UserVO {

	private Long id;
	private String name;
	private String email;
	private String password;
	private Date createdAt;
	private Date updatedAt;
	
	private List<UserRoleVO> roles;
}

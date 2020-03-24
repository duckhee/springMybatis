package kr.co.portfolio.vo;

import java.sql.Date;
import java.util.List;

import lombok.Data;

@Data
public class UserVO {
	
	//private Long id;
	private int Idx;
	//private String name;
	private String UserEmail;
	//private String email;
	private String UserName;
	//private String password;
	private String UserPassword;
	private Date createdAt;
	private Date updatedAt;
	
	//private List<UserRoleVO> roles;
}

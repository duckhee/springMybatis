package kr.co.portfolio.vo;


import java.sql.Date;

import lombok.Data;

@Data
public class UserRoleVO {

	private Long id;
	private String role;
	
	private Date createdAt;
	private Date udpatedAt;
	
	
}

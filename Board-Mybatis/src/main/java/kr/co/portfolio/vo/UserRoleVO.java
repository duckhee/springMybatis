package kr.co.portfolio.vo;


import java.sql.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserRoleVO {

	private Long id;
	private String role;
	
	private Date createdAt;
	private Date udpatedAt;
	
	
}

package kr.co.portfolio.vo;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * 
 * @author duckheewon
 *
 *
 CREATE TABLE IF NOT EXISTS `mybatis_ex`.`user_table` (
  `idx` BIGINT(25) NOT NULL AUTO_INCREMENT,
  `email` VARCHAR(255) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  `name` VARCHAR(255) NOT NULL,
  `createdAt` DATETIME NOT NULL DEFAULT NOW(),
  `updatedAt` DATETIME NOT NULL DEFAULT NOW(),
  PRIMARY KEY (`idx`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE)
ENGINE = InnoDB;
 */
@Getter
@Setter
@ToString(exclude="roles")
public class UserVO {
	/*
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
	 */
	/** Join User Roles */
	//private List<UserRoleVO> roles;
	
	private Long idx;
	private String email;
	private String password;
	private String name;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	
	/** Join User Role */
	private List<UserRoleVO> roles;
	
}

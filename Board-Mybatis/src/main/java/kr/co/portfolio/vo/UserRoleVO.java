package kr.co.portfolio.vo;


import java.sql.Date;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * 
 * @author duckheewon
 *
 *
 CREATE TABLE IF NOT EXISTS `mybatis_ex`.`user_role_table` (
  `idx` BIGINT(25) NOT NULL AUTO_INCREMENT,
  `role` VARCHAR(255) NOT NULL DEFAULT 'BASIC',
  `createdAt` DATETIME NOT NULL DEFAULT NOW(),
  `updatedAt` DATETIME NOT NULL DEFAULT NOW(),
  `user_table_idx` BIGINT(25) NOT NULL,
  PRIMARY KEY (`idx`),
  INDEX `fk_user_role_table_user_table_idx` (`user_table_idx` ASC) VISIBLE,
  CONSTRAINT `fk_user_role_table_user_table`
    FOREIGN KEY (`user_table_idx`)
    REFERENCES `mybatis_ex`.`user_table` (`idx`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
 */
@Getter
@Setter
@ToString
public class UserRoleVO {

	private Long idx;
	private String role;
	private Date createdAt;
	private Date udpatedAt;
	
	/** User Idx */
	private Long user_table_idx;
}

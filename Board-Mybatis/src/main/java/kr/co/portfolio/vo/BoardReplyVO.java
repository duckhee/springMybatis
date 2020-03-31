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
 CREATE TABLE IF NOT EXISTS `mybatis_ex`.`board_reply_table` (
  `idx` BIGINT(25) NOT NULL AUTO_INCREMENT,
  `reply` VARCHAR(2555) NOT NULL,
  `replyer` VARCHAR(255) NOT NULL,
  `bno` BIGINT(25) NOT NULL,
  `createdAt` DATETIME NOT NULL DEFAULT NOW(),
  `updatedAt` DATETIME NOT NULL DEFAULT NOW(),
  PRIMARY KEY (`idx`),
  INDEX `fk_board_reply_table_board_table_idx` (`bno` ASC) VISIBLE,
  UNIQUE INDEX `replyer_UNIQUE` (`replyer` ASC) VISIBLE,
  CONSTRAINT `fk_board_reply_table_board_table`
    FOREIGN KEY (`bno`)
    REFERENCES `mybatis_ex`.`board_table` (`idx`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
 */
@Getter
@Setter
@ToString
public class BoardReplyVO {

	private Long Idx;
	private String rewriter;
	private String recontent;
	private Date createdAt;
	private Date updatedAt;
}

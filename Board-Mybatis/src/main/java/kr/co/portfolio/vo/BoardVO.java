package kr.co.portfolio.vo;

import java.sql.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * 
 * @author duckheewon
 *
 *
 CREATE TABLE IF NOT EXISTS `mybatis_ex`.`board_table` (
  `idx` BIGINT(25) NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(45) NOT NULL,
  `content` MEDIUMTEXT NULL,
  `writer` VARCHAR(255) NOT NULL,
  `createdAt` DATETIME NOT NULL DEFAULT NOW(),
  `updatedAt` DATETIME NOT NULL DEFAULT NOW(),
  PRIMARY KEY (`idx`),
  INDEX `fk_board_table_user_table1_idx` (`writer` ASC) VISIBLE,
  CONSTRAINT `fk_board_table_user_table`
    FOREIGN KEY (`writer`)
    REFERENCES `mybatis_ex`.`user_table` (`email`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
 */
@Getter
@Setter
@ToString(exclude="replies")
public class BoardVO {

	private Long Idx;
	private String title;
	private String content;
	private String writer;
	private Date createdAt;
	private Date updatedAt;
	/** Join Data */
	private List<BoardReplyVO> replies;
}

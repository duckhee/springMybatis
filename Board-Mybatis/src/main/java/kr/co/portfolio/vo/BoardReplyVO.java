package kr.co.portfolio.vo;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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

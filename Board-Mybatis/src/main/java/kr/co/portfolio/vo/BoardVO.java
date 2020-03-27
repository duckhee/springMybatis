package kr.co.portfolio.vo;

import java.sql.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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

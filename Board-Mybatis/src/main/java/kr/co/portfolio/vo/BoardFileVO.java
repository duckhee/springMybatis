package kr.co.portfolio.vo;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardFileVO {

	private long idx;
	private String name;
	private double size;
	private Timestamp createdAt;
	private Timestamp updatedAt;
}

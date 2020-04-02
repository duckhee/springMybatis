package kr.co.portfolio.vo;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class SiteVO {

	private Long id;
	private String name;
	private String owner;
	private Timestamp createdAt;
	private Timestamp updatedAt;
}

package kr.co.portfolio.vo;


import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PlotVO {
	
	private Long idx;
	private String name;
	private Timestamp createAt;
	private Timestamp updatedAt;

}

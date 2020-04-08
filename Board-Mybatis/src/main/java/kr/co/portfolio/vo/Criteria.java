package kr.co.portfolio.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Criteria {
	
	/** this is page input number */
	private int pageNum;
	/** this is show table amount */
	private int amount;
	private int offset;
	/** Search type */
	private String type;
	/** Search keyword */
	private String keyword;
	
	/** Default page = 1, amount = 10 */
	public Criteria() {
		this(1, 10);
	}
	
	/** Default amount = 1 */
	public Criteria(int pageNum) {
		this(pageNum, 10);
	}
	
	/** Default amount, page  */
	public Criteria(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
		this.offset = (pageNum - 1) * amount;
	}
	
	/** Paging Offset Set up */
	public void setOffset() {
		this.offset = (this.pageNum - 1) * this.amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
		/** Set Offset */
		setOffset();
	}
	
}

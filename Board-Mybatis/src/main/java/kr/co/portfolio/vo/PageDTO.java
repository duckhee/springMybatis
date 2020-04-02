package kr.co.portfolio.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PageDTO {
	/** Pagination Start Page */
	private int startPage;
	/** Pagination End Page */
	private int endPage;
	/** Pagination All Value */
	private int total;
	/** Check Prev Button */
	private boolean prev;
	/** Check Next Button */
	private boolean next;
	/** Page Info */
	private Criteria cri;
	
	/** Paging VO */
	public PageDTO(Criteria cri, int total) {
		this.cri = cri;
		this.total = total;
		/** Get End Page */
		this.endPage = (int)(Math.ceil((cri.getPageNum()) / 10.0)) * 10;
		/** Get Start Page */
		this.startPage = this.endPage - 9;
		/** Get Real End Page */
		int realEnd = (int)(Math.ceil((total * 1.0)/cri.getAmount()));
		
		if(realEnd <= this.endPage) {
			this.endPage = realEnd;
		}
		/** */
		this.prev = this.startPage > 1;
		/** */
		this.next = this.endPage < realEnd;
	}
}

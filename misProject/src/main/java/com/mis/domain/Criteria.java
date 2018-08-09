package com.mis.domain;

/**
 * 페이징 처리를 변수 정의 클래스
 * 
 * @author CHO
 *
 */
public class Criteria {
	// 1. 멤버변수 선언
	private int page;
	private int perPageNum;
	private int startPage;

	// 2. 생성자 선언
	// (1) 기본생성자 선언
	public Criteria() {
		this.page = 1;
		this.perPageNum = 10;
	}

	// 3. setter, getter 선언
	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		if (page <= 0) {
			this.page = 1;
			return;
		}

		this.page = page;
	}

	public int getPerPageNum() {
		return perPageNum;
	}

	public void setPerPageNum(int perPageNum) {
		this.perPageNum = perPageNum;
	}

	public int getStartPage() {

		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getPageStart() {
		this.startPage = (this.page * perPageNum) - 9;

		return this.startPage;
	}

	public int getPageEnd() {
		return this.startPage + 9;
	}

	@Override
	public String toString() {
		return "Criteria [page=" + page + ", perPageNum=" + perPageNum + ", startPage=" + startPage + "]";
	}

}

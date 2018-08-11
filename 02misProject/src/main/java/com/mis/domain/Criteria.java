package com.mis.domain;

/**
 * ����¡ ó���� ���� ���� Ŭ����
 * 
 * @author CHO
 *
 */
public class Criteria {
	// 1. ������� ����
	private int page;
	private int perPageNum;
	private int startPage;

	// 2. ������ ����
	// (1) �⺻������ ����
	public Criteria() {
		this.page = 1;
		this.perPageNum = 10;
	}

	// 3. setter, getter ����
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

package com.mis.domain;


import java.util.Date;

/**
 * tbl_boarde ���̺� �ִ� �÷���
 * �����ϴ� VO Ŭ����
 * 
 * @author CHO
 *
 */
public class BoardVO {
	
	// 1. ��� ���� �����
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private int viewcnt;
	
	// 2. ������ �����
	// (1) �⺻ ������
	public BoardVO() {
		super();
	}
	// (2) �Ķ���͸� ������ ������ ����(�ʿ信 ���� ����)
	public BoardVO(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	public BoardVO(String title, String content, String writer, Date regdate) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regdate = regdate;
	}
	
	public BoardVO(int bno, String title, String content) {
		this.bno = bno;
		this.title = title;
		this.content = content;
	}

	public BoardVO(int bno, String title, String content, String writer, Date regdate, int viewcnt) {
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regdate = regdate;
		this.viewcnt = viewcnt;
	}
	
	// 3. setter, getter ����
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getViewcnt() {
		return viewcnt;
	}
	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}
	
	// 4. toString() �������̵�
	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer + ", regdate="
				+ regdate + ", viewcnt=" + viewcnt + "]";
	}
	
	

}

package com.example.sample.dto;

public class BoardDTO {

	int num;
	String title;
	String author;
	String content;
	String write_day;
	int readcnt;
	
	public BoardDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public BoardDTO(int num, String title, String author, String content, String write_day, int readcnt) {
		this.num = num;
		this.title = title;
		this.author = author;
		this.content = content;
		this.write_day = write_day;
		this.readcnt = readcnt;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWrite_day() {
		return write_day;
	}
	public void setWrite_day(String write_day) {
		this.write_day = write_day;
	}
	public int getReadcnt() {
		return readcnt;
	}
	public void setRead_cnt(int readcnt) {
		this.readcnt = readcnt;
	}

	
}

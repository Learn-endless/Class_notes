package com.j2se.bookshop.entity;
/**
 * 图书实体类
 * @author 19833
 *
 */
public class BookEntity {
	//编号
	private int bookId;
	//书名
	private String name;
	//作者
	private String author;
	//价格
	private double price;
	
	public BookEntity() {
		
	}

	public BookEntity(int bookId, String name, String author, double price) {
		this.bookId = bookId;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() {
		return "图书:  编号 " + bookId + "\t书名 " + name + "\t作者 " + author + "\t价格 " + price;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}


	
}

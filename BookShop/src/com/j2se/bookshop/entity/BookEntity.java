package com.j2se.bookshop.entity;
/**
 * ͼ��ʵ����
 * @author 19833
 *
 */
public class BookEntity {
	//���
	private int bookId;
	//����
	private String name;
	//����
	private String author;
	//�۸�
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
		return "ͼ��:  ��� " + bookId + "\t���� " + name + "\t���� " + author + "\t�۸� " + price;
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

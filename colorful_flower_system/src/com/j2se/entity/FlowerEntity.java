package com.j2se.entity;
/**
 * 鲜花实体类
 * @author Administrator
 *
 */
public class FlowerEntity {
	private int id;        //编号
	private String name;   //名称
	private int total;     //数量
	private double price;  //价格
	private String date;   //出售日期
	private String people; //销售人员
	private String remarks;//备注
	
	public FlowerEntity(int id, String name, int total, double price, String date, String people, String remarks) {
		this.id = id;
		this.name = name;
		this.total = total;
		this.price = price;
		this.date = date;
		this.people = people;
		this.remarks = remarks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPeople() {
		return people;
	}

	public void setPeople(String people) {
		this.people = people;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return  id + "\t" + name + "\t" + total + "\t" + price + "\t" + date
				+ "\t" + people + "\t" + remarks;
	}
	
	
}

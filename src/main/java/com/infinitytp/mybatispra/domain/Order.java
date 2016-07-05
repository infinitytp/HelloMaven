package com.infinitytp.mybatispra.domain;

public class Order {
	private int id;
	private String orderNo;
	private float price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Order [id=" + id + ", orderNo=" + orderNo + ", price=" + price+ "]";
	}
	
	
}

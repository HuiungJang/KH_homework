package com.kh.example.practice2.model.vo;

public class Product {
	private String pName;
	private int price;
	private String brand;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public void setPname(String pName) {
		this.pName = pName;
	}
	public String getPname() {
		return pName;
	}
	
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	
	
	public void information() {
		System.out.println(pName+price+brand);
	}
	
	
}

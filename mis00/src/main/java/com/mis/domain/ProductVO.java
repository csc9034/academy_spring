package com.mis.domain;

public class ProductVO {
	
	private String name;
	private double price;
	private int count;
	private int size;
	
	public ProductVO(String name, double price) {
		super();
		this.name = name;
		this.price = price;

	}
	public ProductVO(String name, double price, int count, int size) {
		this(name, price);
		this.count = count;
		this.size = size;
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public int getCount() {
		return count;
	}



	public void setCount(int count) {
		this.count = count;
	}



	public int getSize() {
		return size;
	}



	public void setSize(int size) {
		this.size = size;
	}



	@Override
	public String toString() {
		return "ProductVO [name=" + name + ", price=" + price + ", count=" + count + ", size=" + size + "]";
	}

}

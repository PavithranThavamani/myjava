package com.onebill.hibermapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Item {

	@Id
	private int id;
	private String productName;
	private double productPrice;
	@ManyToOne
	private Cart cart; 
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int id, String productName, double productPrice) {
		super();
		this.id = id;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	
}

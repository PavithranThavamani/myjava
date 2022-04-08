package com.onebill.hibernatemapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Item {

	@Id
	private int id;
	private String category;
	private String productName;
	private double productPrice;
	private int quantity;
	private int productRating;
	@ManyToOne
	private Cart cart;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int id, String category, String productName, double productPrice, int quantity, int productRating) {
		super();
		this.id = id;
		this.category = category;
		this.productName = productName;
		this.productPrice = productPrice;
		this.quantity = quantity;
		this.productRating = productRating;
	}
	
	
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getProductRating() {
		return productRating;
	}
	public void setProductRating(int productRating) {
		this.productRating = productRating;
	}
	
	
}

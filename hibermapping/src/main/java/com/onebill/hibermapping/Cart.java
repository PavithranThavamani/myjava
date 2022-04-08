package com.onebill.hibermapping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@OneToMany(cascade = CascadeType.PERSIST)
	private List<Item> item;
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(int id, List<Item> item) {
		super();
		this.id = id;
		this.item = item;
	}
	
	
	public List<Item> getItem() {
		return item;
	}
	public void setItem(List<Item> item) {
		this.item = item;
	}
	
	
}

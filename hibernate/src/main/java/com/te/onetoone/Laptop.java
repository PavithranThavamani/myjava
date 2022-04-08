package com.te.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop {

	@Id
	private int id;
	private String brand;
	private String battery;
	private String rom;
	@OneToOne( cascade = CascadeType.ALL)
	private Trainee trainee;

	public Laptop(int id, String brand, String battery, String rom) {
		super();
		this.id = id;
		this.brand = brand;
		this.battery = battery;
		this.rom = rom;
	}
	
	

	public Trainee getTrainee() {
		return trainee;
	}



	public void setTrainee(Trainee trainee) {
		this.trainee = trainee;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	public String getRom() {
		return rom;
	}

	public void setRom(String rom) {
		this.rom = rom;
	}

}

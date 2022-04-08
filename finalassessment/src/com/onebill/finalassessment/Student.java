package com.onebill.finalassessment;

public class Student {

	private int id;
	private String name;
	double mark;
	private String course;
	public Student(int id, String name, double mark, String course) {
//		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
		this.course = course;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public String getCourse() {
		return course;
	}
	
	public double getMark() {
		return mark;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mark=" + mark + ", course=" + course + "]";
	}
	
	
	
//	public void add() {
//		System.out.println("added");
//	}
//	
//	public void edit() {
//		System.out.println("edited");
//	}
}

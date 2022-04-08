package com.onebill.finalassessment;

import java.util.*;

public class AddStudent {

	Scanner sc = new Scanner(System.in);

	public AddStudent(List<Student> list) {
		System.out.println("Enter the number of Students you want to Add");
		int num = sc.nextInt();
		for (int j = 1; j <= num; j++) {

			System.out.println("Enter the details:...");
			System.out.println("Enter id:");
			int id = sc.nextInt();
			System.out.println("Enter name:");
			String name = sc.next();
			System.out.println("Enter mark");
			double mark = sc.nextDouble();
			
			
			
			System.out.println("Enter course");
			String course = sc.next();

			list.add(new Student(id, name, mark, course));
			System.out.println("------------------------------");
			System.out.println();
			System.out.println("Student " + j + " Added Successfully");

		}
		System.out.println();
		System.out.println("------------------------------");
	}
}

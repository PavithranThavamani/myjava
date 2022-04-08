package com.onebill.finalassessment;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Display {

	Scanner sc = new Scanner(System.in);
	public Display(List<Student> list) {
		System.out.println("List of Students");
		Iterator<Student> iterator2 = list.iterator();
		while (iterator2.hasNext()) {
			Student next = iterator2.next();
			System.out.println(next);
		}
		System.out.println();
		System.out.println("------------------------------");
	}
	
}

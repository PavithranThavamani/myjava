package com.onebill.finalassessment;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class GetDetails {
	
	Scanner sc = new Scanner(System.in);

	public GetDetails(List<Student> list) {
		
		System.out.println("Enter Student Id");
		int getid = sc.nextInt();
		System.out.println("List of Students are:");
		Iterator<Student> iterator3 = list.iterator();
		while(iterator3.hasNext()) {
			Student next = iterator3.next();
			if(next.getId() == getid) {
				System.out.println(next);
			}
		}
		System.out.println();
		System.out.println("------------------------------");
	}
}

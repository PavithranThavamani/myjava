package com.onebill.finalassessment;

import java.util.List;
import java.util.Scanner;

public class SortStudents {
	Scanner sc = new Scanner(System.in);

	public SortStudents(List<Student> list) {
		System.out.println("Enter the choice");
		System.out.println("1. Sort by Name" + "\n2. Sort by Id" + "\n3. Sort by Mark");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			Sorting sorting = new Sorting();
			list.sort(sorting);
			for(Student s : list) {
				System.out.println(s);
			}
		case 2:
			SortById sortById = new SortById();
			list.sort(sortById);
			for(Student s : list) {
				System.out.println(s);
			}
		case 3:
			SortByMark sortByMark = new SortByMark();
			list.sort(sortByMark);
			for (Student s : list) {
				System.out.println(s);
			}
			System.out.println();
			System.out.println("------------------------------");
			break;
		default:
			break;
		}
	}
}

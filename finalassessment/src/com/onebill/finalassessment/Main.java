package com.onebill.finalassessment;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;

		List<Student> list = new ArrayList<Student>();
		do {

			System.out.println("------------------------------");
			System.out.println();
			System.out.println("1. Add Student" + "\n2. Edit Student" + "\n3. Delete Student" + "\n4. List of Students"
					+ "\n5. Get Student's details" + "\n6. Sort the list of Students" + "\n7. Exit"
					+ "\n\nEnter the choice:");
			System.out.println();
			System.out.println("------------------------------");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				new AddStudent(list);
				break;
			case 2:

				new EditStudent(list);

				break;
			case 3:
				new DeleteStudent(list);

				break;
			case 4:
				new Display(list);

				break;
			case 5:
				new GetDetails(list);

				break;
			case 6:
				new SortStudents(list);

				break;
			case 7:
				System.out.println("Welcome.....");
				break;
			default:
				System.out.println("Enter valid choice");
				break;
			}

		} while (choice != 7);

		sc.close();
	}

}

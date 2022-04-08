package com.onebill.finalassessment;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DeleteStudent {
	Scanner sc = new Scanner(System.in);
	public DeleteStudent(List<Student> list) {
		System.out.println("Enter the student Id to delete");
		int id1 = sc.nextInt();
		Iterator<Student> it = list.iterator();
		boolean flag = list.isEmpty();
		if(flag != true) {
			while (it.hasNext()) {
				Student s = it.next();
				if (s.getId() == id1) {
					it.remove();
					System.out.println("Deleted Successfully");
				}
					//System.out.println("Id not found..Enter valid Id");
				
			}
		}else {
			try {
				throw new EmptyListException("List is Empty");
			} catch (EmptyListException e) {
				e.printStackTrace();
				System.out.println(e.getMsg());
			}
		}

		System.out.println();
		System.out.println("------------------------------");

	}
}

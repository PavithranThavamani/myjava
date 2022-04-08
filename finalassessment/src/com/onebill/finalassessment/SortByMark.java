package com.onebill.finalassessment;

import java.util.Comparator;

public class SortByMark implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		
//
//		Student s1 = (Student) o1;
//		Student s2 = (Student) o2;
//		
//		if(o1.mark > o2.mark) {
//			return +1;
//		}
		
//		return o1.getMark()-o2.getMark();
		
		return (int)(o1.getMark()-o2.getMark());
		
	}

}

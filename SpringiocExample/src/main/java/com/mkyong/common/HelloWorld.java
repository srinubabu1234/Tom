package com.mkyong.common;

import java.util.Map;

/**
 * Hello world!
 *
 */
public class HelloWorld {
	private String name;
	private Map<String, String> studentsData;

	public void setName(String name) {
		this.name = name;
	}

	public void setStudentsData(Map<String, String> studentsData) {
		this.studentsData = studentsData;
	}

	public void printHello() {
		System.out.println("Hello ! " + name);
		if (studentsData != null) {
			System.out.println("Total Students are: " + studentsData.size());

			// for (String student : studentsData) {
			System.out.println(studentsData);

		}
	}
}

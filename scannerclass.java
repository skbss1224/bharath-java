package javaProject;

import java.util.Scanner;

public class scannerclass {

	public static void main(String[] args) {
//		Scanner barath=new Scanner(System.in);
//		System.out.println("enter the age:");
//		int age=barath.nextInt();
//		System.out.println("enter the weight:");
//		int weight=barath.nextInt();
//		if(age>=18) {
//			if(weight>50) {
//				System.out.println("the person is elligible to donate blood");
//			}
//			else {
//				System.out.println("the person is not elligible to donate blood");
//			}
//			
//		}
//		else {
//			System.out.println("age must be greater than 18");
//
//		}
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the dept:");
		String dept=sc.nextLine();
		int year;
		if(dept.equals("CSE")) {
			System.out.println("enter a year:");
			year=sc.nextInt();
			System.out.println("the student is in the computer science department");
			if(year==1) {
				System.out.println("the student is in 1st year");
			}
			else if(year==2) {
				System.out.println("the student is in 2nd year");
			}
			else if(year==3) {
				System.out.println("the student is in 3rd year");
			}
			else if(year==4) {
				System.out.println("the student is in 4th year");
			}
		}
		else if(dept.equals("EEE")) {
			System.out.println("enter a year:");
			year=sc.nextInt();
			System.out.println("the student is in the electrical and electronics department");
			if(year==1) {
				System.out.println("the student is in 1st year");
			}
			else if(year==2) {
				System.out.println("the student is in 2nd year");
			}
			else if(year==3) {
				System.out.println("the student is in 3rd year");
			}
			else if(year==4) {
				System.out.println("the student is in 4th year");
			}
		}
		else if(dept.equals("ME")) {
			System.out.println("enter a year:");
			year=sc.nextInt();
			System.out.println("the student is in the mechanical department");
			if(year==1) {
				System.out.println("the student is in 1st year");
			}
			else if(year==2) {
				System.out.println("the student is in 2nd year");
			}
			else if(year==3) {
				System.out.println("the student is in 3rd year");
			}
			else if(year==4) {
				System.out.println("the student is in 4th year");
			}
		}
		else {
			System.out.println("enter the valid department");
		}
	}
}

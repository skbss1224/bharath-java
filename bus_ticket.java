package bharath;

import java.util.Scanner;

public class bus_ticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner bus=new Scanner(System.in);
		System.out.println("enter your place:");
		String place=bus.nextLine();
		System.out.println("enter your range:");
		String range=bus.nextLine();
		System.out.println("enter your amount:");
		int amount=bus.nextInt();
		if(place.equals("chennai")) {
			System.out.println("you are selected chennai");
			if(range.equals("ordinary")) {
				System.out.println("you are selected ordinary bus");
				if(amount>=250) {
					System.out.println("your ticket is confirmed"+" "+range);
				
				}
				else {
					System.out.println("insuffiecient amount");
				}
			}
			else if(range.equals("delux")) {
				System.out.println("you are selected delux bus");
				if(amount>=350) {
					System.out.println("your ticket is confirmed"+""+range);
				}
				else {
					System.out.println("insuffiecient amount");
				}
			}
			else if(range.equals("superdelux")) {
				System.out.println("you are selected superdelux bus");
				if(amount>=450) {
					System.out.println("your ticket is confirmed"+""+range);
				}
				else {
					System.out.println("insuffiecient amount");
				}
			}
			else if(range.equals("sleeper")) {
				System.out.println("you are selected sleeper bus");
				if(amount>=550) {
					System.out.println("your ticket is confirmed"+""+range);
				}
				else {
					System.out.println("insuffiecient amount");
				}
			}
			else {
				System.out.println("ac bus not available");
			}
		}
		else if(place.equals("coimbatore")) {
			System.out.println("you are selected coimbatore");
			if(range.equals("ordinary")) {
				System.out.println("you are selected ordinary bus");
				if(amount>=250) {
					System.out.println("your ticket is confirmed"+" "+range);
				}
				else {
					System.out.println("insuffiecient amount");
				}
			}
			else if(range.equals("delux")) {
				System.out.println("you are selected delux bus");
				if(amount>=350) {
					System.out.println("your ticket is confirmed"+""+range);
				}
				else {
					System.out.println("insuffiecient amount");
				}
			}
			else if(range.equals("superdelux")) {
				System.out.println("you are selected superdelux bus");
				if(amount>=450) {
					System.out.println("your ticket is confirmed"+""+range);
				}
				else {
					System.out.println("insuffiecient amount");
				}
			}
			else if(range.equals("sleeper")) {
				System.out.println("you are selected sleeper bus");
				if(amount>=550) {
					System.out.println("your ticket is confirmed"+""+range);
				}
				else {
					System.out.println("insuffiecient amount");
				}
			}
			else {
				System.out.println("ac bus not available");
			}
		}
		else {
			System.out.println("place is not available in this bus");
		}
	}

}

package bharath;

import java.util.Scanner;

public class scannercontrol {

	public static void main(String[] args) {
		Scanner barath=new Scanner(System.in);
		System.out.println("enter the age:");
		int age=barath.nextInt();
		if(age>=18) {
			System.out.println("you are elligible in vote");
		}
		else {
			System.out.println("not elligible in vote");
		}

	}

}

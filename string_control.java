package bharath;

import java.util.Scanner;

public class string_control {

	public static void main(String[] args) {
		Scanner aadhar=new Scanner(System.in);
		System.out.println("enter your nationality");
		String national=aadhar.nextLine();
		if(national == "indian") {
			System.out.println("you are elligle aadhar card");
		}
		else if(national != "indian") {
			System.out.println("you are  not elligle aadhar card");
		}

	}

}

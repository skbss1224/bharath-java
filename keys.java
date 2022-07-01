package bharath;

import java.util.Scanner;

public class keys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amt=0;
		Scanner scan=new Scanner(System.in);
		for(int seats=1;seats<=20;) {
			if(seats%2==0||seats%3==0) {
				System.out.println("booked already");
				seats++;
				break;
				
			}
			else {
				System.out.println("enter the amount:");
				amt=scan.nextInt();
				if(amt>=530) {
					System.out.println(seats+"seat booked");
					seats++;
				}
				else {
					System.out.println("insuffiecient amount to book");
				}
			}
			}
		scan.close();
	}

}

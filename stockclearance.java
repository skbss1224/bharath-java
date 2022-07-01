package bharath;

import java.util.Scanner;

public class stockclearance {

	public static void main(String[] args) {
		int stock=0,required=0,pay=0,payable=0,invoice=0;float time=0.0F;
		Scanner scan=new Scanner(System.in);
		for(stock=75,time=12.01F;stock>0&&time<=12.59F;time+=0.01F)
		{
			System.out.println("tell us how many mobile you wish:");
			required=scan.nextInt();
			if(required<=stock)
				
			{
				payable=required*14999;
				System.out.println("enter the amount:");
				pay=scan.nextInt();
				if(pay>=payable) {
					System.out.println("order placed for"+required+"i phone 13 pro");
					stock-=required;
					invoice++;
					
				}
				else {
					System.out.println("order couldn't placed due to insuffient amount");
				}
			}
			else {
				System.out.println("we have only"+stock+"i phone available");
			}
		}
		System.out.println("total invoices are:"+invoice+"still in stock"+stock);
		scan.close();
	}

}

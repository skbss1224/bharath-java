package bharath;

import java.util.Scanner;

public class while_basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i=10;
//		while(i>1) {
//			System.out.println(i);
//			i--;
//		}
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the number:");
//		int n=sc.nextInt();
//		int i=1;
//		System.out.println("the multiplication table of"+ n +"is:");
//		while(i<=10)
//		{
//			System.out.println(n+"*"+i+"="+(n*i));
//			i++;
//		}
//		int i=1;
//		while(true)
//		{
//			System.out.println(i+"hello world!");
//			i++;
//		}
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number");
		int num=sc.nextInt();
		if(num>0)
			System.out.println("it is positive number");
		else if(num<0)
			System.out.println("it is negative number");
		else
			System.out.println("neither possitive or negative");
	}

}

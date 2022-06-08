package bharath;

public class bitwise_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//& and operater
		//| or operater
		//^ xor operater
		//<<right shift operater
		//>>lest shift operater
		// 0 1 1
		// 0 0 0
		// 1 1 0
		// 1 0 1
		int a=5;
		int b=6;
		int c;
		c=a&b;
		System.out.println("a&b"+c);
		c=a|b;
		System.out.println("a|b"+c);
		c=a^b;
		System.out.println("a^b"+c);
		int x=69;
		int y=2;
		int z;
		z=x<<y;
		System.out.println("x<<y"+z);
		z=x>>y;
		System.out.println("x<<y"+z);
		

	}

}

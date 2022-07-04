package bharath;
class Book{

	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("hello im book class method");
	}
	
}
class hello{

	public void bird() {
		// TODO Auto-generated method stub
		System.out.println("im a bird class");
	}
	
}

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book=new Book();
		hello hi=new hello();
		//book.insert();
		hi.bird();
		
		
	}

}

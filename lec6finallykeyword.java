package Exceptionhandling;

public class lec6finallykeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=100;
			//int b=2;
			int b=0;
			int c;
			c=a/b;
			System.out.println(c);
			
		} catch (ArithmeticException e) {
			System.out.println(e);
			
		}
finally {
	System.out.println("i am in finLLY BLOCK");
	
}
	}

}

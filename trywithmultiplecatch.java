package Exceptionhandling;

import java.io.IOException;

public class trywithmultiplecatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 0;
		int c = a / b;
		try {
			c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {

			System.out.print("bye");
		} 
		catch (Exception e) {
			System.out.print("hii");

		}
		

	}

}

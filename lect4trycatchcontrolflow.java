package Exceptionhandling;

import java.io.FileInputStream;

public class lect4trycatchcontrolflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//FileInputStream fir = new FileInputStream("d:/abc.txt");
//class.forName("com.mysql.jdbc.Driver");
//int a=100,b=0,c;
//c=a/b;
//System.out.println(c);
//Srting name=null;
//System.out.println(name.length());

		try {
			int a = 100, b = 0, c;
			 c = a / b;
			System.out.println(c);

		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("hello");

	}

}

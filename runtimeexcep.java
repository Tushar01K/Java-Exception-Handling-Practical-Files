package Exceptionhandling;
import java.io.FileInputStream;
public class runtimeexcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//checked exception
		try {
			FileInputStream fis = new FileInputStream("d:abc.txt");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		//unchecked exception
		int a=100,b=0,c;
		System.out.println(c);
	}

}

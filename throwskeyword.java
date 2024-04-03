package Exceptionhandling;

class ArithmeticExcep extends Exception {

	public ArithmeticExcep(String string) {

		super(string);
	}
}

class Operations {

	void division(int divident, int divisor) throws ArithmeticExcep {

		if (divisor == 0) {
			throw new ArithmeticExcep("/by zero");

		} else {

			System.out.println(divident / divisor);
		}

	}
}

public class throwskeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operations ob = new Operations();
		try {

			ob.division(45, 0);
		} catch (ArithmeticExcep e) {

			System.out.println("handel exception");
		}

	}

}

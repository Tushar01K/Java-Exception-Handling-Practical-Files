package Exceptionhandling;

class InvalidAgeException extends Exception {

	public InvalidAgeException(String message)

	{

		super(message);
	}
}

class UserRegisteration {

	void register(int age) {

		if (age < 10) {

			try {

				throw new InvalidAgeException("user is min");
			} catch (InvalidAgeException e) {

				e.printStackTrace();

			}

		} else {

			System.out.println("you have been registered");
			System.out.println("kindly proceed for further");
		}
	}
}

public class Userdefineexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

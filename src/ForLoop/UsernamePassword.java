package ForLoop;

public class UsernamePassword {

	String userId = "pivotAdmin";
	String password = "Admin123";
	int maxAttempts;

	void checkUserIdPassword() {
//for (int attempts = 0; attempts < maxAttempts; attempts++) {
			if ((userId.equals(userId)) && (password.equals(password))) 
			{

				System.out.println("You are logged in to the application");
			}

			else
				System.out.println("Incorrect User Id or password, try again!");

		}

	}
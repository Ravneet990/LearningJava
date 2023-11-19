package ForLoop;

//import java.util.Scanner;

public class UsernamePassword {

	String userId;
	String password;
	
//	Scanner sc = new Scanner(System.in);
	
	void checkUserIdPassword(){
			
		if (userId.equals("pivotAdmin") && password.equals("Admin123"))
		{
		
			System.out.println("You are logged in to the application");
		}
		
		else
		{
			System.out.println("Incorrect User Id or password, try again!");
	}
	}
	
	
}

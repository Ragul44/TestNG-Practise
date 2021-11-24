package Testng004.TestNG_Concept;



import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Test {
	@Parameters({"username" , "password"})
	@Test
	private void login(String username, String password) {
		System.out.println("Enter Login Details");
		System.out.println("Username :" + username);
		System.out.println("Password :" + password);

}
}

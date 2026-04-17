package day1;

public class Loginvalidation {

	public static void main(String[] args) {

		        String id = "admin";
		        int password = 1234;

		        // checking user id
		        if (id.equals("admin")) {
		            System.out.println("User ID is valid");

		            // checking password
		            if (password == 1234) {
		                System.out.println("Password is valid");
		                System.out.println("Login Successful");
		            } else {
		                System.out.println("Password is invalid");
		                System.out.println("Login Unsuccessful");
		            }

		        } else {
		            System.out.println("User ID is invalid");
		            System.out.println("Login Unsuccessful");
		        }
		    }
}

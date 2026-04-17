package day1;

public class MarksValidation {

	public static void main(String[] args) {

		        int m = 75;  // you can change marks here

		        System.out.println("Marks Validation");

		        if (m < 0 || m > 100) {
		            System.out.println("Invalid");
		        } 
		        else if (m >= 81) {
		            System.out.println("Distinction");
		        } 
		        else if (m >= 60) {
		            System.out.println("First Class");
		        } 
		        else if (m >= 35) {
		            System.out.println("Second Class");
		        } 
		        else {
		            System.out.println("Fail");
		        }
		    }
		}
		   




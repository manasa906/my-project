package day1;

public class Matrimony {

	public static void main(String[] args) {

		        char gender = 'M';
		        int age = 19;

		        if (gender == 'M') {
		            if (age >= 21) {
		                System.out.println("He can get marry");
		            } else {
		                System.out.println("Please wait, you are not yet 21");
		            }
		        } else if (gender == 'F') {
		            if (age >= 18) {
		                System.out.println("She can get marry");
		            } else {
		                System.out.println("Please wait, you are not yet 18");
		            }
		        } else {
		            System.out.println("Invalid Gender");
		        }
		    }
		}     

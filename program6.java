package day3;

public class program6 {

	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) {
		            for (int j = 0; j < 7; j++) {

		                if ((i == 0 && j == 3) ||
		                    (i == 1 && (j == 2 || j == 4)) ||
		                    (i == 3 && (j == 1 || j == 5)) ||
		                    (i == 5 && (j == 2 || j == 4)) ||
		                    (i == 6 && j == 3)) {

		                    System.out.print("*");
		                } else {
		                    System.out.print(" ");
		                }

		            }
		            System.out.println();
		        }
		    }
		}
		      		        

		
		   

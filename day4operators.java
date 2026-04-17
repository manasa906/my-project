package day1;

public class day4operators {

	public static void main(String[] args) {
		        
		        System.out.println("-------Logical operators---------");
		        int p = 1;
		        int q = 2;
		        boolean result = p < q && p == 1;
		        System.out.println(result); // True
		        System.out.println(p <= 4 || q == 10); // True
		        System.out.println(!true); // False
		        System.out.println(!false); // True

		        System.out.println("-----Unary operators ---------");
		        int n = 20;
		        int m = n++ + n-- + ++n + n++ + n-- + ++n - --n;
		        System.out.println(n);
		        System.out.println(m);

		        System.out.println("----Ternary operators----");
		        int number1 = 200;
		        int number2 = 300;

		        int max = number1 > number2 ? number1 : number2;

		        System.out.println("Maximum of " + number1 + " & " + number2 + " is " + max);
		    }
		}	


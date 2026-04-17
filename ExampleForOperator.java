package day1;

public class ExampleForOperator {

	public static void main(String[] args) {
		System.out.println("-------Assignment operators-------");

		int x = 10;
		x += 5; //x = x + 5
		System.out.println("Value of x : " + x);
		x -= 3; //x = x - 3
		System.out.println("Value of x : " + x);
		x /= 2; //x = x / 2
		System.out.println("Value of x : " + x);
		x *= 3; //x = x * 3
		System.out.println("Value of x : " + x);

		System.out.println("-------Comparison operators-------");

		int a = 10;
		int b = 20;

		System.out.println(a < b);   //True
		System.out.println(a <= 5);  //False
		System.out.println(b > a);   //True
		System.out.println(b >= 50); //False
		System.out.println(a == b);  //False
		System.out.println(a != b);  //True

	}

	
	
	
}

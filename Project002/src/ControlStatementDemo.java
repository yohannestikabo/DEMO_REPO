import java.util.Scanner;

public class ControlStatementDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the first Value");

		int readValue = scan.nextInt();
		System.out.println("Please Enter the Second Value");

		int readSecondValue = scan.nextInt();
		int sum = readValue+readSecondValue;
		System.out.println("Sum = "+ sum);

	}
	/*
	 * 1 - 0 2 - 1 3 - 3 4 - 3 5 - 4
	 * 
	 * 
	 */
	
	
	
	
}

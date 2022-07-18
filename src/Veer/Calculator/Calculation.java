package Veer.Calculator;

import java.util.Scanner;

public class Calculation {
	static void method(Calculate obj, int num1, int num2) {
		System.out.println(obj.calculate(num1, num2));
	}

	public static void main(String args[]) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter first number:");
			int num1 = scanner.nextInt();
			System.out.println("Enter Second number:");
			int num2 = scanner.nextInt();
			while (true) {
				System.out.println("Press 1 for Additions");
				System.out.println("Press 2 for Subtractions");
				System.out.println("Press 3 for Multiplications");
				System.out.println("Press 4 for Divisions");
				System.out.println("Press 5 for Modulus");
				System.out.println("Enter choice: ");
				int choice = scanner.nextInt();
				
				switch (choice) {
				case 1:
					method(new Additions(), num1, num2);
					break;
				case 2:
					method(new Subtractions(), num1, num2);
					break;
				case 3:
					method(new Multiplications(), num1, num2);
					break;
				case 4:
					method(new Divisions(), num1, num2);
					break;
				case 5:
					method(new Modulus(), num1, num2);
					break;
				default:
					System.out.println("You enter Invalid choice: ");
				}

			}
		}
	}
}

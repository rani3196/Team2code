package basics.programs;

import java.util.Scanner;

public class Assignment12 {

	public void addition()

	{
		Scanner obj = new Scanner(System.in);

		System.out.println(
				"please enter two numbers whatever you want to perform addition but number should be in decimals");
		int num1 = obj.nextInt();
		int num2 = obj.nextInt();

		int result = num1 + num2;

		System.out.println("Additon of your numbers is" + result);

	}

	public static void main(String[] args) {
		Assignment12 ref = new Assignment12();
		ref.addition();

	}

}

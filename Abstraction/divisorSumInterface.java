//Program to use the user defined class myCalculator
import java.util.Scanner;

public class divisorSumInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();
		if(n > 1000) {
			System.out.println("n value beyond the limit");
			System.exit(0);
		}
		myCalculator m1 = new myCalculator();
		System.out.println("Sum of divisors of " + n + ": " + m1.divisor_sum(n));
	}
}

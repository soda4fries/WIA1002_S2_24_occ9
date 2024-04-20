package DS.Lab.Lab1;

public class OddSum {
	public static void main(String[] args) {
		long sum = 0;
		long n = 800000000;

		for (long i = 1; i <= n; i+=2) {
			sum += i;
		}

		System.out.println("Sum of odd numbers from 1 to " + n + " is " + sum);
	}
}

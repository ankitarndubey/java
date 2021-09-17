package in.ankita.recursion;

public class Day14 {

	// Sum of Digits!
	// Given a number A, we need to find sum of its digits using recursion.
	public static int sumOfDigits(int A) {

		if (A == 0)
			return 0;
		else
			return A % 10 + sumOfDigits(A / 10);

	}

	/*
	 * Check Palindrome Write a recursive function that checks whether a string A is
	 * a palindrome or Not. Return 1 if the string A is palindrome, else return 0.
	 * Note: A palindrome is a string that's the same when reads forwards and
	 * backwards.
	 */
	public static int checkPalin(String A, int s, int e) {
		if (s >= e)
			return 1;
		if (A.charAt(s) == A.charAt(e))
			return checkPalin(A, s + 1, e - 1);
		else
			return 0;
	}

	/*
	 * Find Fibonacci The Fibonacci numbers are the numbers in the following integer
	 * sequence. 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, …….. In mathematical
	 * terms, the sequence Fn of Fibonacci numbers is defined by the recurrence
	 * relation: Fn = Fn-1 + Fn-2
	 */
	public static int findAthFibonacci(int A) {
		if (A <= 1)
			return A;
		else
			return findAthFibonacci(A - 1) + findAthFibonacci(A - 2);
	}

	public static void main(String[] args) {
		// System.out.println(sumOfDigits(123));
		// String A="nayan";
		// System.out.println(checkPalin(A,0,A.length()-1));
		System.out.println(findAthFibonacci(10));
	}

}

package in.ankita.problemsolving;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class AssignmentDay20 {
	/*
	 * Sort the Unsorted Array Problem Description
	 * 
	 * You are given an integer array A having N integers.
	 * 
	 * You have to find the minimum length subarray A[l..r] such that sorting this
	 * subarray makes the whole array sorted.
	 */
	public static int sortUnsorted(int[] A) {

		int[] copy_A = new int[A.length];
		int start = 0;
		int end = A.length - 1;
		;
		for (int i = 0; i < A.length; i++) {
			copy_A[i] = A[i];
		}
		Arrays.sort(copy_A);

		System.out.println(Arrays.toString(A));

		System.out.println(Arrays.toString(copy_A));

		while (start < end) {
			if (A[start] == copy_A[start])
				start++;
			else
				break;
		}

		while (end > start) {
			if (A[end] == copy_A[end])
				end--;
			else
				break;
		}
		System.out.println(end - start);
		if ((end - start) != 0)
			return end - start + 1;
		else
			return end - start;

	}

	/*
	 * Minimum Difference Puzzle Problem Description
	 * 
	 * There is a shop whose assistant told you that there are A puzzles in the shop
	 * and you want to buy B of them. They might differ in difficulty and size. The
	 * first jigsaw puzzle consists of A1 pieces, the second one consists of A2
	 * pieces and so on.
	 * 
	 * You decided that the difference between the numbers of pieces in bought
	 * puzzles must be as small as possible. Let x be the number of pieces in the
	 * largest puzzle that the you buy and y be the number of pieces in the smallest
	 * such puzzle. You want to choose such B puzzles that x-y is as minimum as
	 * possible. Find the least possible value of x-y.
	 */
	public static int minDiff(int[] A, int B) {
		if (A.length == 1)
			return 0;
		int ans = Integer.MAX_VALUE;
		Arrays.sort(A);

		for (int i = 0; i <= A.length - B; i++) {
			ans = Math.min(ans, A[i + B - 1] - A[i]);
		}

		return ans;
	}

	/*
	 * Sum the Difference Problem Description
	 * 
	 * Given an integer array A of size N. You have to find all possible non-empty
	 * subsequence of the array of numbers and then, for each subsequence, find the
	 * difference between the largest and smallest numbers in that subsequence Then
	 * add up all the differences to get the number.
	 * 
	 * As the number may be large, output the number modulo 1e9 + 7 (1000000007).
	 * 
	 * NOTE: Subsequence can be non-contiguous.
	 */
	public static int sumOfDiff(int[] A) {
		int mod = 1000000007;
		if (A.length == 1)
			return 0;
		if (A.length == 2)
			return Math.abs(A[1] - A[0]);
		Arrays.sort(A);
		long sum_Diff = 0;
		long sum_min = 0;
		int n = A.length;
		long[] pow = new long[n];
		pow[0] = 1;
		for (int i = 1; i < n; i++) {
			pow[i] = (pow[i - 1] * 2) % mod;
		}
		for (int i = 0; i < A.length; i++) {
			sum_Diff += (A[i] * (pow[i] - pow[n - 1 - i])) % mod;

		}

		return (int) (sum_Diff % mod);
	}

	/*
	 * Contiguous Array Given an array of integers A consisting of only 0 and 1.
	 * 
	 * Find the maximum length of a contiguous subarray with equal number of 0 and
	 * 1.
	 */
	public static int findMaxLength(int[] A) {
		if (A.length == 1)
			return 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0)
				A[i] = -1;
		}
		System.out.println(Arrays.toString(A));
		int[] pfSum = new int[A.length];
		pfSum[0] = A[0];
		for (int i = 1; i < A.length; i++) {
			pfSum[i] = pfSum[i - 1] + A[i];
		}

		System.out.println(Arrays.toString(pfSum));
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		int ans = 0;
		for (int i = 0; i < pfSum.length; i++) {
			if (map.containsKey(pfSum[i]))
				ans = Math.max(ans, i - map.get(pfSum[i]));
			else
				map.put(pfSum[i], i);
		}
		return ans;
	}

	/*
	 * Optimal Partitioning Problem Description
	 * 
	 * You are given an array A having N integers.
	 * 
	 * You have to divide / split the array into 2 subsequence partitions such that:
	 * 
	 * Both the partitions are non-empty. Each integer A[i] in the array belongs to
	 * exactly one of the two partitions. Absolute difference between the maximum of
	 * first partition and the minimum of second partition is minimum possible. If B
	 * and C represent the two partitions, then size(B) >= 1, size(C) >= 1 and
	 * |max(B) - min(C)| is minimum possible. You have to find such a spliting and
	 * tell the minimum value of |max(B) - max(C)|.
	 */
	public static int optimalPartitioning(int[] A) {
		if (A.length == 1)
			return (int) A[0];
		Arrays.sort(A);

		int difference = Integer.MAX_VALUE;

		for (int i = 0; i < A.length - 1; i++) {
			difference = Math.min(difference, A[i + 1] - A[i]);
			/*
			 * if (A[i + 1] - A[i] < difference) { difference = A[i + 1] - A[i];
			 * 
			 * }
			 */
		}
		return difference;

	}

	// Construct Array
	public static int[] constructArray(int A, int B, int C) {
		int[] ans = new int[A];
		if (A == 2) {
			ans[0] = B;
			ans[1] = C;
			return ans;
		}

		for (int i = 0; i < A; i++) {
			ans[i] = Integer.MAX_VALUE;
		}
		for (int a = 1; a <= 50; a++) {
			for (int d = 1; d <= 50; d++) {
				int[] tmp = new int[A];

				for (int i = 0; i < A; i++) {
					tmp[i] = a + i * d;
				}

				boolean fB = false;
				boolean fC = false;

				for (int i = 0; i < A; i++) {
					if (tmp[i] == B)
						fB = true;
					else if (tmp[i] == C)
						fC = true;

				}
				if (fB && fC && tmp[A - 1] < ans[A - 1]) {
					for (int i = 0; i < A; i++) {
						ans[i] = tmp[i];
					}
				}
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		// int[] A = { 0, 1, 15, 25, 6, 7, 30, 40, 50 };
		// System.out.println(sortUnsorted(A));
		// int[] A = { 10, 12, 10, 7, 5, 22 };
		// int B = 4;
		// System.out.println(minDiff(A, B));
		// int[] A = { 5, 4, 2 };

		// System.out.println(sumOfDiff(A));
		// int[] A = { 0, 1, 0 };
		// System.out.println(findMaxLength(A));
		// int[] A = { 2, 1, 3, 2, 4, 3 };
		// System.out.println(optimalPartitioning(A));
		int A = 5;
		int B = 20;
		int C = 50;
		System.out.println(Arrays.toString(constructArray(A, B, C)));
	}

}

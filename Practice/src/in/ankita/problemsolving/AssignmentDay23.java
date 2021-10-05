package in.ankita.problemsolving;

import java.util.Arrays;

public class AssignmentDay23 {
	// Bulbs
	public static void findMinSwitches(int[] A) {
		int ans = 0;
		for (int i = 0; i < A.length; i++) {
			if (ans % 2 != 0) {
				if (A[i] == 0)
					A[i] = 1;
				else
					A[i] = 0;
			}
			if (A[i] == 0)
				ans++;
		}
		System.out.println(ans);
	}

	// XOR Querries
	public static void getXOR(int[] A, int[][] B) {
		int[][] ans = new int[B.length][2];

		int[] pfSum = new int[A.length];
		pfSum[0] = A[0];
		for (int i = 1; i < A.length; i++) {
			pfSum[i] = pfSum[i - 1] + A[i];
		}

		System.out.println(Arrays.toString(pfSum));

		for (int i = 0; i < B.length; i++) {
			int l = B[i][0];
			int r = B[i][1];
			int length = r - l + 1; // length of subarray
			int pfsum = pfSum[r - 1] - pfSum[l - 1];
			int no_of_zero = length - pfsum;
			System.out.println("len - " + length);
			System.out.println("0's - " + no_of_zero);
			if ((length - no_of_zero) % 2 == 0)
				ans[i][0] = 0;
			else
				ans[i][0] = 1;
			ans[i][1] = no_of_zero;
			System.out.println(ans[i][0] + "," + ans[i][1]);
		}
	}

	// SUBARRAY OR
	public static void getSubarrayValue(int[] A) {
		int ans = A[0];
	    int i;
	    for(i = 1; i < A.length; i++)
	    {
	        ans |= A[i];
	    }
	    System.out.println(ans);
	}

	/*
	 * Square granites Problem Description
	 * 
	 * A city is of rectangular shape with the size A * B meters. On the occasion of
	 * the city's anniversary, a decision was taken to pave the city with square
	 * granite flagstones. Each flagstone is of the size C * C. What is the least
	 * number of flagstones needed to pave the city?
	 * 
	 * NOTE: It's allowed to cover the surface larger than the city, but the city
	 * has to be covered. It's not allowed to break the flagstones. The sides of
	 * flagstones should be parallel to the sides of the city.
	 */

	public static int findTiles(int A, int B, int C) {
		return (int) (Math.ceil((double)A / (double)C) * Math.ceil((double)B / (double)C));

	}

	public static void main(String[] args) {
		// int[] A = { 0, 1, 0, 1 };
		// findMinSwitches(A);
		 int[] A = {7,8,9,10};
		 getSubarrayValue(A);
		// int[] A = { 1, 0, 0, 0, 1 };
		// int[][] B = { { 2, 4 }, { 1, 5 }, { 3, 5 } };
		// getXOR(A, B);
		//System.out.println(findTiles(6, 6, 4));

	}

}

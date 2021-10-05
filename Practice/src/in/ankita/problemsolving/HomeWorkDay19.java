package in.ankita.problemsolving;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeWorkDay19 {

	/*
	 * Column Sum Problem Description
	 * 
	 * You are given a 2D integer matrix A, return a 1D integer vector containing
	 * column-wise sums of original matrix.
	 * 
	 * 
	 */
	public static int[] getColSum(int[][] A) {
		ArrayList<Integer> ans = new ArrayList<>();
		int row = A.length;
		int col = A[0].length;

		for (int i = 0; i < col; i++) {
			int col_sum = 0;
			for (int j = 0; j < row; j++) {
				col_sum += A[j][i];
			}
			ans.add(col_sum);
		}
		System.out.println(ans);

		return ans.stream().mapToInt(i -> i).toArray();
	}

	/*
	 * Find Determinant Problem Description
	 * 
	 * You are given an N X N(where N = 2 or N = 3) 2D integer matrix A. You have to
	 * find the value of its determinant (det(A) or |A|).
	 */

	public static int findDeterminant(int[][] A) {
		int n = A.length;
		if(n==2)
			return (A[0][0] * A[1][1]) - (A[0][1] * A[1][0]);
		if(n==3) {
			int x = (A[1][1] * A[2][2]) - (A[2][1] * A[1][2]);
			int y = (A[1][0] * A[2][2]) - (A[2][0] * A[1][2]);
			int z = (A[1][0] * A[2][1]) - (A[2][0] * A[1][1]);
			
			return (A[0][0] * x)- (A[0][1] * y) + (A[0][2] * z);
		}
		return 0;
	}

	/*
	 * Maximum Difference Given an array of integers A and an integer B. Find and
	 * return the maximum value of | s1 - s2 |
	 * 
	 * where s1 = sum of any subset of size B, s2 = sum of elements of A - sum of
	 * elemets of s1
	 * 
	 * Note |x| denotes the absolute value of x.
	 */
	public static int maxDiff(int[] A, int B) {
		 int sum=0;
			int arraySum = 0;
			for (int i = 0; i < A.length; i++)
				arraySum += A[i];

			B=Math.min(B, A.length-B);
			Arrays.sort(A);
			for (int i = 0; i < B; i++) {// first subarray sum of size B
				sum += A[i];
			}
			return arraySum-2*sum;
	}

	public static int maxDiff1(int[] A, int B) {
		int leastSum = Integer.MAX_VALUE;
		int maxSum = Integer.MIN_VALUE;
		int sum = 0;
		int s2;
		int maxDiff = 0;
		int sumSub = 0;
		int arraySum = 0;
		for (int i = 0; i < A.length; i++)
			arraySum += A[i];

		B=Math.min(B, A.length-B);
		Arrays.sort(A);
		for (int i = 0; i < B; i++) {// first subarray sum of size B
			sum += A[i];
		}
		return arraySum-2*sum;
		/*leastSum = Math.min(leastSum, sum);
		maxSum = Math.max(maxSum, sum);

		for (int i = B; i < A.length; i++) {
			sum += A[i];
			sum -= A[i - B];
			leastSum = Math.min(leastSum, sum);
			maxSum = Math.max(maxSum, sum);
		}

		int min= Math.abs(leastSum - (arraySum-leastSum));
		int max= Math.abs(maxSum - (arraySum - maxSum));
		
		

		for (int i = 0; i < B; i++)
			sumSub += A[i];
		
		maxDiff = Math.abs(sumSub - (arraySum - sumSub));
		
		System.out.println(min);
		System.out.println(max);
		System.out.println(maxDiff);
		return 0;*/
	}

	public static void main(String[] args) {
		// int[][] A = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 2, 3, 4 } };
		// int[] ans = getColSum(A);
		// int[][] A = new int[][] { { 1, 2 }, { 3, 4 } };
		int[] A = new int[] {70, 21, 7, 64, 44, 79, 50, 89, 68, 23, 20, 50, 65, 64, 48, 3, 46, 87 };
		int B =16;
		System.out.println(maxDiff(A, B));
		//System.out.println(maxDiff1(A, B));
	}

}

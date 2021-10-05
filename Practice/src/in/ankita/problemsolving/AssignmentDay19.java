package in.ankita.problemsolving;

import java.util.ArrayList;
import java.util.HashMap;

public class AssignmentDay19 {

	// Equilibrium index of an array
	/*
	 * You are given an array A of integers of size N.
	 * 
	 * Your task is to find the equilibrium index of the given array
	 * 
	 * Equilibrium index of an array is an index such that the sum of elements at
	 * lower indexes is equal to the sum of elements at higher indexes.
	 * 
	 * NOTE:
	 * 
	 * Array indexing starts from 0. If there is no equilibrium index then return
	 * -1. If there are more than one equilibrium indexes then return the minimum
	 * index.
	 */
	public static int getEqulibriumindex(int[] A) {
		int left_sum = 0;
		int right_sum = 0;

		for (int i = 0; i < A.length; i++) {
			right_sum += A[i];
		}

		for (int i = 0; i < A.length; i++) {
			System.out.println(left_sum + " " + right_sum);
			right_sum -= A[i];
			if (left_sum == right_sum)
				return i;
			left_sum += A[i];
		}

		return -1;
	}

	// count special elements
	/*
	 * Count ways to make sum of odd and even indexed elements equal by removing an
	 * array element Problem Description Given an array, arr[] of size N, the task
	 * is to find the count of array indices such that removing an element from
	 * these indices makes the sum of even-indexed and odd-indexed array elements
	 * equal.
	 */
	public static int countSpecialElements(int[] A) {
		int n = A.length;
		int ans = 0;
		int right_odd = 0, right_even = 0;
		int left_odd = 0, left_even = 0;

		for (int i = 0; i < A.length; i++) {
			if (i % 2 == 0)
				right_even += A[i];
			else
				right_odd += A[i];
		}

		for (int i = 0; i < n; i++) {
			if (i % 2 != 0)
				right_odd -= A[i];
			else
				right_even -= A[i];

			if (left_odd + right_even == left_even + right_odd)
				ans++;

			if (i % 2 != 0)
				left_odd += A[i];
			else
				left_even += A[i];
		}

		return ans;
	}

	// Subarray with least average
	/*
	 * Problem Description
	 *
	 * Given an array of size N, Find the subarray with least average of size k.
	 */
	public static int leastAvg(int[] A, int B) {
		int ans = Integer.MAX_VALUE;
		int sum = 0;

		for (int i = 0; i < B; i++) {
			sum += A[i];
		}

		sum = sum / B;
		ans = Math.min(ans, sum);
		int inx = 0;
		for (int i = B; i < A.length; i++) {
			sum += A[i];
			sum -= A[i - B];

			if (sum < ans) {
				ans = sum;
				inx = i - B + 1;
			}

		}
		ans = ans / B;
		return inx;
	}

	// Distinct elements
	/*
	 * Distinct Numbers in Window Problem Description
	 * 
	 * You are given an array of N integers, A1, A2 ,..., AN and an integer B.
	 * Return the of count of distinct numbers in all windows of size B.
	 * 
	 * Formally, return an array of size N-B+1 where i'th element in this array
	 * contains number of distinct elements in sequence Ai, Ai+1 ,..., Ai+B-1.
	 * 
	 * NOTE: if B > N, return an empty array.
	 * 
	 * 
	 * 
	 */
	public static int[] dNums(int[] A, int B) {
		ArrayList<Integer> ans=new ArrayList<>();
		HashMap<Integer, Integer> map_A = new HashMap<>();

		for (int i = 0; i < B; i++) {
			map_A.put(A[i], map_A.getOrDefault(A[i], 0)+1);
		}
		System.out.print(map_A.size()+" ");
		ans.add(map_A.size());
		for (int i = B; i < A.length; i++) {
			map_A.put(A[i], map_A.getOrDefault(A[i], 0)+1);
			
			map_A.put(A[i-B], map_A.get(A[i-B] )-1);
			
			if(map_A.get(A[i-B])==0) {
				map_A.remove(A[i-B]);
			}
			System.out.print(map_A.size()+" ");
			ans.add(map_A.size());
		}
		
		return ans.stream().mapToInt(i -> i).toArray();
	}

	public static void main(String[] args) {
		// int[] A=new int[] {-7, 1, 5, 2, -4, 3, 0};
		// System.out.println(getEqulibriumindex(A));
		// int[] A=new int[] {2, 1, 6, 4};
		// System.out.println(countSpecialElements(A));
		// int[] A = new int[] { 3, 7, 90, 20, 10, 50, 40 };
		// int B = 3;
		//int[] A = new int[] { 10, 20, 30, 5, 3, 2, 1 };
		//System.out.println(leastAvg(A, 3));
		 int[] A = new int[] { 1, 2, 1, 3, 4, 3 };
		 int B = 3;
		 dNums(A, B);
	}

}

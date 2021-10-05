package in.ankita.problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HomeWorkDay23 {
	/*
	 * Hotel Bookings Possible Problem Description
	 * 
	 * A hotel manager has to process N advance bookings of rooms for the next
	 * season. His hotel has K rooms.
	 * 
	 * Bookings contain an arrival date and a departure date.
	 * 
	 * He wants to find out whether there are enough rooms in the hotel to satisfy
	 * the demand.
	 * 
	 * Write a program that solves this problem in time O(N log N) .
	 */
	public static int findRooms(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
		int ans = Integer.MIN_VALUE;
		Collections.sort(arrive);
		Collections.sort(depart);
		System.out.println(arrive);
		System.out.println(depart);
		int i = 0, j = 0, c = 0;
		int n = arrive.size();
		while (i < n && j < n) {
			if (arrive.get(i) <= depart.get(j)) {
				c++;
				i++;
			} else {
				c--;
				j++;
			}
			ans = Math.max(ans, c);
		}
		System.out.println(ans);
		if (K < ans)
			return 0;
		else
			return 1;
	}

	/*
	 * Kth Row of Pascal's Triangle Problem Description
	 * 
	 * Given an index k, return the kth row of the Pascal's triangle. Pascal's
	 * triangle: To generate A[C] in row R, sum up A'[C] and A'[C-1] from previous
	 * row R - 1.
	 */
	public static int[] getRow(int N) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int prev = 1;

		for (int i = 1; i <= N; i++) {
			ans.add(prev);
			int curr = (prev * (N - i + 1)) / i;
			prev = curr;
		}
		ans.add(prev);

		return ans.stream().mapToInt(i -> i).toArray();
	}
	/*
	 * Find duplicate rows in a binary matrix Given a binary matrix A of integers 0
	 * and 1, of size N x M.
	 * 
	 * Find and return the indices of the rows which are duplicate of rows which are
	 * already present in the matrix.
	 * 
	 * If row[i] and row[j] are same and i < j then answer will contain only index
	 * j.
	 * 
	 * Note: Rows are numbered from top to bottom and columns are numbered from left
	 * to right. There will be at least one duplicate row in the matrix.
	 */

	public static int[] findDuplicates(int[][] A) {
		ArrayList<Integer> ans = new ArrayList<>();
		Set<String> setA = new HashSet<>();
		/*
		 * // convert each row i into decimal value for (int i = 0; i < A.length; i++) {
		 * int decimal = 0; for (int j = 0; j < A[i].length; j++) { // convert binary
		 * row `i` to its decimal equivalent decimal += A[i][j] * Math.pow(2, j); }
		 * 
		 * if (setA.contains(decimal))// found duplicate ans.add(i+1);// adding row
		 * number into ans else setA.add(decimal); }
		 */

		for (int i = 0; i < A.length; i++) {
			String str = Arrays.toString(A[i]);
			if (setA.contains(str))
				ans.add(i + 1);
			else
				setA.add(str);
		}

		return ans.stream().mapToInt(i -> i).toArray();
	}

	public static void main(String[] args) {
		// int K = 1;
		// ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3));
		// ArrayList<Integer> D = new ArrayList<>(Arrays.asList(2, 3, 4));

		// System.out.println(findRooms(A, D, K));
		// System.out.println(Arrays.toString(getRow(3)));
		int[][] A = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 1, 0 } };
		System.out.println(Arrays.toString(findDuplicates(A)));
	}

}

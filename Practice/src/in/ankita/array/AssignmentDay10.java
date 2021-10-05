package in.ankita.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AssignmentDay10 {

	// Special Subsequences "AG"
	public static int splSubsequence(String A) {
		int ans = 0;
		int count_G = 0;
		for (int i = A.toCharArray().length - 1; i >= 0; i--) {
			if (A.charAt(i) == 'G')
				count_G++;
			else if (A.charAt(i) == 'A')
				ans += count_G;
		}
		return ans;
	}

	// Closest MinMax
	public static int closestMinMax(ArrayList<Integer> A) {
		int ans = Integer.MAX_VALUE;
		int min = A.get(0);
		int max = A.get(0);
		for (int i = 1; i < A.size(); i++) {
			// System.out.println(min+" "+max+" "+i);
			if (A.get(i) > max) {
				max = A.get(i);
			}
			if (A.get(i) < min) {
				min = A.get(i);
			}
		}

		int latest_min = Integer.MIN_VALUE;
		int latest_max = Integer.MAX_VALUE;
		for (int i = 0; i < A.size(); i++) {
			System.out.println(ans);
			System.out.println("At i - " + i + " " + latest_max + " " + latest_min);
			if (A.get(i) == min) {
				System.out.println(ans + " " + (i - latest_max + 1));
				ans = Math.min(ans, Math.abs(i - latest_max + 1));
				latest_min = i;
			}
			if (A.get(i) == max) {
				System.out.println(ans + " " + (i - latest_min + 1));
				ans = Math.min(ans, Math.abs(i - latest_min + 1));
				latest_max = i;
			}
		}
		// System.out.println(latest_max+" "+latest_min+" "+ans);

		return ans;
	}

	// Length of longest consecutive ones
	public static int longestConsOnes(String A) {

		int size = A.length();
		int ans = 0;

		// To count all 1's in the string
		int cnt_one = 0;

		int max_cnt = 0, temp = 0;

		for (int i = 0; i < size; i++) {
			if (A.charAt(i) == '1') {
				cnt_one++;
				temp++;
			} else {
				max_cnt = Math.max(max_cnt, temp);
				temp = 0;
			}
		}
		max_cnt = Math.max(max_cnt, temp);

		// To store cumulative 1's
		int prefix[] = new int[size];
		int suffix[] = new int[size];

		if (A.charAt(0) == '0')
			prefix[0] = 0;
		else
			prefix[0] = 1;
		if (A.charAt(size - 1) == '0')
			suffix[size - 1] = 0;
		else
			suffix[size - 1] = 1;

		// Counting cumulative 1's from left
		for (int i = 1; i < size; i++) {

			if (A.charAt(i) == '1')
				prefix[i] = prefix[i - 1] + 1;
			else
				prefix[i] = 0;
		}
		// Counting cumulative 1's from right
		for (int i = size - 2; i >= 0; i--) {

			if (A.charAt(i) == '1')
				suffix[i] = suffix[i + 1] + 1;
			else
				suffix[i] = 0;
		}

		for (int i = 1; i < size - 1; i++) {
			if (A.charAt(i) == '0') {
				int sum = prefix[i - 1] + suffix[i + 1];
				if (sum < cnt_one)
					max_cnt = Math.max(max_cnt, sum + 1);

				else
					max_cnt = Math.max(max_cnt, sum);
			}
		}

		return (max_cnt);
	}

	//max consecutive ones
	public static int maxConsOnes(String A) {
		int maxConsecutiveOnes=0;
		int start=0;
		int k=1;//Represent we can flip at most one 0
		int zeroCount=0;
		
		//Move end pointer/index
		for(int end=0;end<A.length();end++) {
			 //If zero is found, then increment zeroCount
			if(A.charAt(end)=='0') {
				zeroCount++;
			}
			
			 /*
	        If the value of zeroCount is greater than k,
	        move start pointer and reset the window.
	       */
			while(zeroCount>k) {
				if(A.charAt(start)=='0') {
					zeroCount--;
				}
				start++;
			}
			maxConsecutiveOnes=Math.max(maxConsecutiveOnes, end-start+1);
		}
		
		return maxConsecutiveOnes;
		
	}
	// Search in a row wise and column wise sorted matrix
	public static int search(List<List<Integer>> a, int B) {
		int i = 0;
		int j = a.get(i).size() - 1;
		int n = a.size();
		while (j >= 0 && i < n) {
			if (a.get(i).get(j) == B) {
				while (j - 1 >= 0 && a.get(i).get(j - 1) == B) {
					j--;
				}
				return (i + 1) * 1009 + j + 1;
			} else if (a.get(i).get(j) > B)
				j--;
			else
				i++;
		}

		return -1;
	}

	public static void main(String[] args) {
		// String A="ABCGAG";
		// String B = "GAB";
		// System.out.println(splSubsequence(A));
		// int[] a = new int[] { 1, 3 };
		// ArrayList<Integer> A=
		// IntStream.of(a).boxed().collect(Collectors.toCollection(ArrayList::new));
		// System.out.println(closestMinMax(A));
		Integer[][] a = new Integer[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int B = 2;
		// Convert 2D array into 2D arraylist
		List<List<Integer>> A = Arrays.stream(a).map(Arrays::asList).collect(Collectors.toList());

		// System.out.println(search(A,B));
		String C = "01";
		System.out.println(C);
		System.out.println(maxConsOnes(C));
	}

}

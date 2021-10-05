package in.ankita.problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class HomeWorkDay21 {

	// Intersection of sorted arrays
	/*
	 * Find the intersection of two sorted arrays. OR in other words, Given 2 sorted
	 * arrays, find all the elements which occur in both the arrays.
	 */
	public static void findIntersection(int[] A, int[] B) {
		HashMap<Integer, Integer> map_A = new HashMap<>();
		for (int i = 0; i < A.length; i++) {
			if (map_A.containsKey(A[i]))
				map_A.put(A[i], map_A.get(A[i]) + 1);
			else
				map_A.put(A[i], 1);
		}
		System.out.println(map_A);
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = 0; i < B.length; i++) {
			if (map_A.getOrDefault(B[i], 0) > 0) {
				ans.add(B[i]);
				map_A.put(B[i], map_A.getOrDefault(B[i], 0) - 1);
			}
		}
		System.out.println(ans);
	}

	/*
	 * remove duplicates from sorted array
	 */
	public static void removeDuplicates(int[] A) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (int i = 0; i < A.length; i++) {
			if (!ans.contains(A[i])) {
				ans.add(A[i]);
			}
		}
		System.out.println(ans);
	}

	/*
	 * Merge sorted arrays
	 */
	public static void mergeSorted(ArrayList<Integer> A, ArrayList<Integer> B) {
		ArrayList<Integer> ans = new ArrayList<Integer>();

		for (int i : A) {
			ans.add(i);
		}

		for (int i : B) {
			ans.add(i);
		}

		Collections.sort(ans);
		System.out.println(ans);

	}
	/*
	 * N/3 Repeat Number Problem Description
	 * 
	 * You're given a read only array of n integers. Find out if any integer occurs
	 * more than n/3 times in the array in linear time and constant additional
	 * space. If so, return the integer. If not, return -1.
	 * 
	 * If there are multiple solutions, return any one.
	 */

	public static int repeatedNumber(final List<Integer> a) {
		int n = a.size();
		HashMap<Integer, Integer> map_a=new HashMap<>();
		
		for(int i=0;i<n;i++) {
			map_a.put(a.get(i), map_a.getOrDefault(a.get(i), 0)+1);
		}
		System.out.println(map_a);
		for(int i:map_a.values()) {
			if(i>n/3)
			{
				Set<Integer> set= getKeysByValue(map_a, i);
				return set.stream().findFirst().get();
			}
		}
		return -1;
		
		//solution at site

	  /*  int num;
	    int n = A.size();
	    Collections.sort(A);
	    for (int i = 0; i < n;) {
	        int freq = 0;
	        num = A.get(i);
	        while (i < n && A.get(i) == num) {
	            freq++;
	            i++;
	        }
	        if (freq * 3 > n)
	            return num;
	    }
	    return -1;*/
	}
	public static <T, E> Set<T> getKeysByValue(Map<T, E> map, E value) {
	    return map.entrySet()
	              .stream()
	              .filter(entry -> Objects.equals(entry.getValue(), value))
	              .map(Map.Entry::getKey)
	              .collect(Collectors.toSet());
	}
	public static void main(String[] args) {
		// int[] A = { 1, 3, 8, 10, 13, 13, 16, 16, 16, 18, 21, 23, 24, 31, 31, 31, 33,
		// 35, 35, 37, 37, 38, 40, 41, 43, 47,
		// 47, 48, 48, 52, 52, 53, 53, 55, 56, 60, 60, 61, 61, 63, 63, 64, 66, 67, 67,
		// 68, 69, 71, 80, 80, 80, 80,
		// 80, 80, 81, 85, 87, 87, 88, 89, 90, 94, 95, 97, 98, 98, 100, 101 };

		// int[] B = { 5, 7, 14, 14, 25, 28, 28, 34, 35, 38, 38, 39, 46, 53, 65, 67, 69,
		// 70, 78, 82, 94, 94, 98 };
		// findIntersection(A, B);
		// int[] A= {3,3,1,1,2};
		// removeDuplicates(A);
		// ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3));
		// ArrayList<Integer> B = new ArrayList<>(Arrays.asList(2, 3, 4));
		// mergeSorted(A, B);

		List<Integer> A = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 1, 1));
		System.out.println(repeatedNumber(A));
	}

}

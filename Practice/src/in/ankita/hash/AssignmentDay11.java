package in.ankita.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AssignmentDay11 {

	// Common Elements
	public static void commonElement(ArrayList<Integer> A, ArrayList<Integer> B) {
		Map<Integer, Integer> hash_A = new HashMap<>();

		for (int i = 0; i < A.size(); i++) {// populating hashset for arraylist A
			if (hash_A.containsKey(A.get(i)))
				hash_A.put(A.get(i), hash_A.get(A.get(i)) + 1);
			else
				hash_A.put(A.get(i), 1);
		}

		ArrayList<Integer> ans = new ArrayList<Integer>();

		for (int i = 0; i < B.size(); i++) {// checking for b elements
			if(hash_A.getOrDefault(B.get(i),0)>0) {
				ans.add(B.get(i));
				hash_A.put(B.get(i), hash_A.getOrDefault(B.get(i), 0)-1);
				
			}
		}

		System.out.println(ans);
	}

	// First repeating elements
	public static int firstRepeatingElement(ArrayList<Integer> A) {
		Map<Integer, Integer> map_A = new HashMap<>();

		for (int i = 0; i < A.size(); i++) {// populating hashset for arraylist A
			if (map_A.containsKey(A.get(i))) {
				map_A.put(A.get(i), map_A.get(A.get(i)) + 1);

			} else
				map_A.put(A.get(i), 1);
		}

		map_A.forEach((k, v) -> System.out.println("Key = " + k + ", Value = " + v));
		/*
		 * // using iterators Iterator<Map.Entry<Integer, Integer>> itr =
		 * map_A.entrySet().iterator(); while (itr.hasNext()) { Map.Entry<Integer,
		 * Integer> entry = itr.next(); if (entry.getValue() >= 2) return
		 * entry.getKey(); else return -1; }
		 */

		for (int i = 0; i < A.size(); i++) {
			if (map_A.get(A.get(i)) >= 2)
				return A.get(i);
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a = new int[] { 1,2,3 ,3};
		int[] b = new int[] { 1,1,3,3 };

		ArrayList<Integer> A = IntStream.of(a).boxed().collect(Collectors.toCollection(ArrayList::new));
		ArrayList<Integer> B = IntStream.of(b).boxed().collect(Collectors.toCollection(ArrayList::new));
		commonElement(A, B);

		// int[] a = new int[] { 10, 5, 3, 4, 3, 5, 6 };
		// ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList( 10, 5, 3, 4, 3,
		// 5, 6));
		// System.out.println(firstRepeatingElement(A));
	}

}

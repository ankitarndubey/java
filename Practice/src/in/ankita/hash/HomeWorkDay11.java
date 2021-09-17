package in.ankita.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class HomeWorkDay11 {

	// check Palindrome
	public static int checkPalindrome(String A) {
		HashMap<Character, Integer> map_A = new HashMap();
		int ans = 0;
		for (int i = 0; i < A.toCharArray().length; i++) {

			if (map_A.containsKey(A.charAt(i)))
				map_A.put(A.charAt(i), map_A.get(A.charAt(i)) + 1);
			else
				map_A.put(A.charAt(i), 1);
		}
		// for each with lambda
		map_A.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
		int lenght = A.toCharArray().length;
		int count = 0;
		if (lenght % 2 == 0) {
			for (Integer i : map_A.values()) {

				if (i % 2 == 0)
					ans = 1;
				else
					return 0;
			}
		} else {
			for (Integer i : map_A.values()) {

				if (i % 2 == 0)
					ans = 1;
				else
					count++;
			}
			if (count > 1)
				return 0;
			else
				return 1;
		}

		return ans;

	}

	// Two out of Three
	public static void getCommon(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
		HashSet<Integer> map_A = new HashSet<>();
		for (int i : A) {
			map_A.add(i);
		}
		ArrayList<Integer> ans = new ArrayList<Integer>();
		HashSet<Integer> result = new HashSet<>();
		for (int i = 0; i < B.size(); i++) {
			for (int j = 0; j < C.size(); j++) {
				// System.out.println(B.get(i)+" "+C.get(j));
				if (map_A.contains(B.get(i))) {
					result.add(B.get(i));
				}
				if (map_A.contains(C.get(j))) {
					result.add(C.get(j));
					// break;
				}
				if (C.get(j).equals(B.get(i))) {
					result.add(C.get(j));

				}
			}
		}
		for (int i : result) {
			ans.add(i);
		}

		System.out.println(result);
	}

	// K Occurrences
	public static int sumofKOcuurences(int A, int B, ArrayList<Integer> C) {
		int sum;
		HashMap<Integer, Integer> map_C = new HashMap<>();
		
		for (int i = 0; i < C.size(); i++) {
			if (map_C.containsKey(C.get(i)))
				map_C.put(C.get(i), map_C.get(C.get(i)) + 1);
			else
				map_C.put(C.get(i), 1);
		}
		System.out.println(map_C);
		if(map_C.containsValue(B)){
		
		sum=map_C.entrySet().stream()
		.filter(a->a.getValue()==B)
		.mapToInt(a->a.getKey())
		.sum();
		}
		else
			return -1;
		
		return sum;
	}

	public static void main(String[] args) {
		// String A = "uucgncntt";
		// System.out.println(checkPalindrome(A));
		// ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(56, 56, 34, 34,
		// 72, 71));
		// ArrayList<Integer> B = new ArrayList<Integer>(Arrays.asList(56, 56, 34, 34,
		// 72, 71));
		// ArrayList<Integer> C = new ArrayList<Integer>(Arrays.asList(56, 56, 34, 34,
		// 72, 71));
		// getCommon(A, B, C);
		ArrayList<Integer> C = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		int B = 5;
		int A = 5;
		System.out.println(sumofKOcuurences(A, B, C));
	}

}

package in.ankita.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class HomeWorkDay13 {
	// Elements Removal
	public static void costOfRemoval(ArrayList<Integer> A) {
		// int sum=0;
		/*
		 * Collections.sort(A,Collections.reverseOrder()); while(A.size()>0) { for(int i
		 * =0;i<A.size();i++) { sum+=A.get(i);
		 * 
		 * } A.remove(0); }
		 */
		Collections.sort(A);
		System.out.println(A);
		int sum = 0, ans = 0;

		for (int i = 0; i < A.size(); i++) {
			System.out.println(A.size() - i + " " + A.get(i));

			sum += (A.size() - i) * A.get(i);
		}

		System.out.println(sum);
	}

	// Minimize Difference
	public static void minimizeDiff(ArrayList<Integer> A, int B) {
		HashMap<Integer, Integer> map_A = new HashMap();
		for (int i = 0; i < A.size(); i++) {
			if (map_A.containsKey(A.get(i))) {
				map_A.put(A.get(i), map_A.get(A.get(i)) + 1);
			} else {
				map_A.put(A.get(i), 1);
			}
		}

		Collections.sort(A);

		int min = A.get(0);
		int max = A.get(A.size() - 1);

		while (B > 0 && min < max) {
			if (map_A.get(min) < map_A.get(max)) {
				if (map_A.get(min) <= B) {
					B = B - map_A.get(min);
					map_A.put(min + 1, map_A.get(min) + map_A.getOrDefault(min + 1, 0));

					min = min + 1;
				} else
					break;
			} else {
				if (map_A.get(max) <= B) {
					B = B - map_A.get(max);
					map_A.put(max - 1, map_A.get(max) + map_A.getOrDefault(max - 1, 0));
					max = max - 1;
				} else
					break;
			}
		}
		System.out.println(max - min);
	}

	// Stepwise Selection Sort!
	public static void stepwise(ArrayList<Integer> A) {
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = 0; i < A.size() - 1; i++) {

			int min = Integer.MAX_VALUE, idx = 0;

			for (int j = i; j < A.size(); j++) {
				if (A.get(j) < min) {
					min = A.get(j);
					idx = j;
				}
			}
			int tmp = A.get(i);
			A.set(i, A.get(idx));
			A.set(idx, tmp);
			ans.add(idx);
			System.out.println(A);
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {

		// ArrayList<Integer> A=new ArrayList<>(Arrays.asList(2, 1,5));
		// costOfRemoval(A);
		// ArrayList<Integer> A = new ArrayList<>(Arrays.asList(6, 4, 3, 7, 2, 8));
		// stepwise(A);
		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 1, 7));
		minimizeDiff(A, 7);

	}

}

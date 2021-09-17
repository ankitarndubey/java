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
		HashMap<Integer,Integer> map_A=new HashMap();
		for(int i =0;i<A.size();i++) {
			if(map_A.containsKey(A.get(i))) {
				map_A.put(A.get(i), map_A.get(A.get(i))+1);
			}
			else
				map_A.put(A.get(i), 1);
		}
		System.out.println(map_A);
		
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
		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,1,7));
		minimizeDiff(A, 7);

	}

}

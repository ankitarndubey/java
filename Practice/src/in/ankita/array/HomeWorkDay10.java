package in.ankita.array;

import java.util.ArrayList;

public class HomeWorkDay10 {

	// Pattern Printing -1
	public static ArrayList<ArrayList<Integer>> pattern1(int A) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < A; i++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			int j = 0;
			while (j < A) {
				list.add(0);
				j++;
			}
			result.add(list);
		}

		for (int i = 0; i < A; i++) {
			for (int j = 0; j <= i; j++) {
				result.get(i).set(j, j + 1);
			}
		}

		return result;
	}
	
	//Pattern Printing -2
	public static ArrayList<ArrayList<Integer>> pattern2(int A) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < A; i++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			int j = 0;
			while (j < A) {
				list.add(0);
				j++;
			}
			result.add(list);
		}

		for (int i = A-1; i>=0; i--) {
			int k=1;
			for (int j = A-1; j>=A-1-i; j--) {
				
				result.get(i).set(j, A-1-j+1);
				k++;
			}
		}

		for(ArrayList i:result) {
			System.out.println(i);
		}
		
		return result;
	}

	public static void main(String[] args) {
		//System.out.println(pattern1(3));
		System.out.println(pattern2(3));
	}

}

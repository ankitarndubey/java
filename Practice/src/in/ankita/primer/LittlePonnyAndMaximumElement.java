package in.ankita.primer;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LittlePonnyAndMaximumElement {

	public static int solve(ArrayList<Integer> A, int B) {

		int count = 0;
		int element_not_found = -1;

		// checking f B is present in the arraylist
		for (int i = 0; i < A.size(); i++) {
			if (A.get(i) == B) {
				element_not_found = 0;
				break;
			} 
		}

		if (element_not_found == -1)
			return -1;
		else {
			for (int i : A) {
				if (i > B)
					count++;
			}
			return count;
		}

	}

	public static void main(String[] args) {
		int[] a = new int[] { 2, 4,3,5,  1};
		// Convert int array to array list
		ArrayList<Integer> A = IntStream.of(a).boxed().collect(Collectors.toCollection(ArrayList::new));
		System.out.println(solve(A, 3));
	}

}

package in.ankita.ProblemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AssignmentsDay5 {

	/*
	 * Find for how many elements, there is a strictly smaller element and a
	 * strictly greater element.
	 */
	static int findElements(int[] a) {
		int result = 0;
		// Convert int array to array list
		ArrayList<Integer> A = IntStream.of(a).boxed().collect(Collectors.toCollection(ArrayList::new));
		// TA Suggested method
		int min = A.get(0);
		int max = A.get(0);
		int n = A.size();
		for (int i = 0; i < n; i++) {
			if (min > A.get(i))
				min = A.get(i);
			if (max < A.get(i))
				max = A.get(i);
		}

		for (int i = 0; i < n; i++) {
			if (A.get(i) > min && A.get(i) < max)
				result++;
		}

		// My logic -> will not work for min max repeated values
		/*
		 * Collections.sort(A); for(int i :A) System.out.println(i); result=A.size()-2;
		 */
		return result;
	}

	/*
	 * integer array containing the elements of A which have at-least two greater
	 * elements than themselves in A.
	 */
	static void findArray(int[] a) {
		// Convert int array to array list
		ArrayList<Integer> A = IntStream.of(a).boxed().collect(Collectors.toCollection(ArrayList::new));
		// ArrayList<Integer> B =
		// IntStream.of(a).boxed().collect(Collectors.toCollection(ArrayList::new));
		ArrayList<Integer> B = new ArrayList<Integer>(A);
		Collections.sort(B);
		// System.out.println(A.toString());
		// System.out.println(B.toString());
		int max = B.get(B.size() - 1);
		int max2 = B.get(B.size() - 2);
		ArrayList<Integer> C = new ArrayList<Integer>();
		C.add(max);
		C.add(max2);

		A.removeAll(C);
		System.out.println(A.toString());

		/*
		 * int max=A.get(0); for(int i:A) { if(max<i) max=i; } for(int i : A) {
		 * if(i==max) {
		 * 
		 * }
		 * 
		 * }
		 */
	}

	// Find Max even and min odd numbers difference in the array
	static void findEvenOddDiff(int[] a) {
		ArrayList<Integer> A = IntStream.of(a).boxed().collect(Collectors.toCollection(ArrayList::new));

		int even_max = 0;
		int odd_min = 0;
		if (A.get(0) % 2 == 0)
			even_max = A.get(0);
		if (A.get(A.size() - 1) % 2 != 0)
			odd_min = A.get(A.size() - 1);
		for (int i : A) {
			System.out.println(even_max + " " + odd_min + ": " + i);

			if (i == 0) {
				continue;
			}
			if (i % 2 == 0) {
				if (even_max == 0 || even_max < i)
					even_max = i;
			} else if (i % 2 != 0) {
				if (odd_min == 0 || odd_min > i)
					odd_min = i;
			}
		}
		System.out.println(even_max + " " + odd_min);
		System.out.println(even_max - odd_min);
	}

	// Pattern Printing
	static void twoDArrayList(int A) {

		if (A < 1 && A > 1000)
			System.out.println("Invalid Input");

		// Declaring 2D ArrayList
		ArrayList<ArrayList<Integer>> x = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < A; i++) {
			x.add(new ArrayList<Integer>(Collections.nCopies(A, 0)));
		}
		System.out.println(x.toString());

		for (int i = 0; i < A; i++) {
			System.out.println("i " + i);
			for (int j = 0; j <= i; j++) {
				System.out.println("j " + j);
				x.get(i).set(j, j + 1);
			}
		}

		System.out.println(x.toString());
	}

	public static void main(String[] args) {
		// int[] A = new int[] { 1, 2, 3, 4, 5 };
		// int[] A= new int[] {11, 17, 100, 5};// A=5 11 17 100, a =11, 17,100, 5,
		// B=5,11
//int[] A= new int[] {391, 634, 740, 441, 75, 444, 65, 611, 679, 59, 878, 102, 42, 190, 801, 571, 79, 686, 523, 580, 199, 497, 879, 334, 200, 202, 991, 341, 479, 563, 112, 550, 494, 468, 56, 644, 53, 581, 836, 461, 905, 849, 838, 434, 818, 350, 585, 280, 252, 834, 510, 420, 395, 776, 118, 886, 19, 809, 534, 143, 933, 15, 999, 514, 230, 531, 666, 841, 861, 703, 972, 622, 640, 21, 811, 476, 751, 430, 308, 996, 165, 812, 424, 412, 903, 601, 226, 239, 728, 135};
		// int[] A= new int[] {947, 871, 859, 471, 763, 766, 379, 746, 485, 966, 10,
		// 350, 341, 22, 706, 702, 717, 967, 641, 712, 10, 954, 751, 250, 777, 214, 820,
		// 276, 708, 509, 123, 73, 593, 790, 797, 678, 320, 865, 392, 428, 611, 813,
		// 655, 195, 102, 902, 919, 171, 706, 841, 873, 98, 128, 728, 878, 701, 874,
		// 158, 548, 214, 414, 600, 869, 936, 841, 221, 87, 255, 233, 627, 487, 53, 270,
		// 162, 517, 576, 240, 681, 172, 148, 86, 778, 205, 741, 483, 11, 795, 188, 450
		// };
		/*
		 * int[] A=new int[] {913, 440, 865, 72, 612, 445, 101, 994, 356, 91, 461, 930,
		 * 583, 448, 543, 170, 333, 107, 425, 73, 172, 416, 899, 826, 659, 561, 314, 25,
		 * 110 };
		 */
		// System.out.println(findElements(A));
		// findArray(A);
		// int[] a = new int[] { 0, 2, 9 };
		// int[] a=new int[] {5, 17, 100, 1};
		// int[] a = new int[] {-98, 54, -52, 15, 23, -97, 12, -64, 52, 85};
		// int[] a =new int[] {74, 9, 51, 51, 75, 0, 35, 89, 96, 77};
		// int[] a =new int[] { 91, 76, 81, 73, 64, 13, -63, 8, 60, 27};
		// int[] a =new int[] {-92, 22, 2, 11, 39, 36, 36, 51, 71, 42};
		// int[] a = new int[] { -15, -45, 43, 23, -63, 69, 35, 19, 37, -52 };
		// findEvenOddDiff(a);
		twoDArrayList(3);
	}

}

package in.ankita.array;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AssignmentDay8 {

	// Fizz buzz
	public static ArrayList<String> fizzBuzz(int A) {

		ArrayList<String> result = new ArrayList<String>();
		for (int i = 1; i <= A; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				result.add("FizzBuzz");
				continue;
			}
			if (i % 3 == 0) {
				result.add("Fizz");
				continue;
			}
			if (i % 5 == 0) {
				result.add("Buzz");
				continue;
			}

			result.add(i + "");
		}
		return result;
	}

	// maximum odd-even subsequence length
	public static int maxSubSeqLength(int[] a) {
		int maxSubSeqLength = 0;
		boolean even_flag = false;
		// Convert int array to array list
		ArrayList<Integer> A = IntStream.of(a).boxed().collect(Collectors.toCollection(ArrayList::new));
		ArrayList<Integer> B = new ArrayList<Integer>();
		B.add(A.get(0));
		if (B.get(0) % 2 == 0) {
			even_flag = true;
		}
		for (int i = 1; i < A.size(); i++) {
			if (even_flag && A.get(i) % 2 != 0) {
				B.add(A.get(i));
				even_flag = false;
			} else if (!even_flag && A.get(i) % 2 == 0) {
				B.add(A.get(i));
				even_flag = true;
			}
			/*
			 * 
			 * if(A.get(i)%2!=0 && (B.size()==0 || B.size()%2==0))//adding odd on odd
			 * positions B.add(A.get(i)); else if(A.get(i)%2==0 && (B.size()%2)!=0) //adding
			 * even at even positions B.add(A.get(i));
			 */
		}
		maxSubSeqLength = B.size();
		System.out.println(B);
		return maxSubSeqLength;
	}

	// Time to equality
	public static int timeToEquality(int[] a) {

		int max_val = 0;
		int sum = 0;
		// Convert int array to array list
		ArrayList<Integer> A = IntStream.of(a).boxed().collect(Collectors.toCollection(ArrayList::new));

		for (int i = 0; i < A.size(); i++) {
			if (A.get(i) > max_val)
				max_val = A.get(i);
		}
		System.out.println(max_val);
		for (int i = 0; i < A.size(); i++) {
			sum += (max_val - A.get(i));
		}
		return sum;
	}

	// rotation game
	public static void rotationGame(ArrayList<Integer> A, int b) {
		
		int size=A.size();
		b = b % A.size();
		System.out.println(b);
		ArrayList<Integer> original = new ArrayList<>();
		for (int i : A) {// making copy of original arraylist A
			original.add(i);
		}

		// Left Shift
		/*if (b != 0) {
			ArrayList<Integer> B = new ArrayList<Integer>();
			for (int i = 0; i < b; i++) {
				B.add(i, A.get(i));
			}
			//System.out.println(B);
			for (int i = 0; i < B.size(); i++) {
				A.remove(B.get(i));
			}
			//System.out.println(A);
			for (int i = 0; i < B.size(); i++) {
				A.add(B.get(i));
			}
			//System.out.println("Left Shift result");
			//System.out.println(A);
		}*/

		// RIGHT shift
		if (b != 0) {
			
			// store right shift values to an array
			ArrayList<Integer> right_shift_elements = new ArrayList<Integer>();
			
			for (int i = original.size()-b; i < original.size(); i++) {
					right_shift_elements.add(original.get(i));				
			}

			// remove right shift elements from original array A	
			for (int i = size-1; i >= size-b; i--) {
				original.remove(i);
			}
			System.out.println(original);
			System.out.println(right_shift_elements);

			// add shifted elements to the original array on left side
			for (int i = 0; i < original.size(); i++) {
				right_shift_elements.add(original.get(i));
			}
			System.out.println("Right Shift result");
			System.out.println(right_shift_elements);

		}else
			System.out.println(A);
	}


	public static void main(String[] args) {

		// System.out.println(fizzBuzz(3));
		// int[] A= new int[] {1,2,3,4,5};
		// int[] A = new int[] { 1, 2, 2, 5, 6};
		// int[] A= new int[] {2, 2, 2, 2, 2, 2};
		// int[] A=new int[] {2, 4, 1, 3, 2};
		// int[] A=new int[] {731, 349, 490, 781, 271, 405, 811, 181, 102, 126, 866, 16,
		// 622, 492, 194, 735};
		// System.out.println(maxSubSeqLength(A));
		// System.out.println(timeToEquality(A));
		// int[] A = new int[] { 1, 2, 2 };
		// int[] A = new int[] { 1, 2, 3, 4 };
		/*
		 * Scanner sc = new Scanner(System.in); int size = sc.nextInt();
		 * ArrayList<Integer> A = new ArrayList<>(); for (int i = 0; i < size; i++) {
		 * A.add(sc.nextInt()); } int B = sc.nextInt();
		 */
		// System.out.println(A);
		//int[] a = new int[] { 1, 2, 2 };
		int[] a =new int[] {64, 78, 50, 25, 24, 27, 76, 59, 65, 41, 37, 6, 80, 61, 8, 48, 38, 85, 41, 18, 12, 81, 36, 37, 12, 44, 22, 65, 12, 33, 19, 42, 25, 30, 5, 4, 96, 81, 72, 71, 20, 20, 23, 85, 93, 33, 32, 30, 12, 97, 24, 13, 93, 58, 74, 37, 10, 46, 26, 21, 41, 92, 90, 21, 65, 35, 89, 26, 10, 14, 64, 28, 3, 80, 99, 62, 38, 55, 8, 92, 31, 93, 58, 77, 21, 34, 57, 49, 82, 85, 38, 89, 66, 51, 4, 31, 12, 33, 83, 29 };
		int B = 13;
		ArrayList<Integer> A = IntStream.of(a).boxed().collect(Collectors.toCollection(ArrayList::new));
		System.out.println(A);
		rotationGame(A, B);

	}
	/*
	 * for (int i = 0; i < b; i++) { int j; int last = A.get(A.size() - 1);
	 * System.out.println("Doing for - "+i);
	 * System.out.println("Last elemtn - "+last); for (j = A.size() - 1; j > 0; j--)
	 * { A.set(j, A.get(j - 1)); System.out.println("Shifting - "+A.get(j-1)); }
	 * A.set(0, last); System.out.println(A); }
	 */
}

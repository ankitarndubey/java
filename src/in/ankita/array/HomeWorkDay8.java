package in.ankita.array;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HomeWorkDay8 {

	// Multiple left rotations of the array
	public static void multipleLeftRotation(ArrayList<Integer> A, ArrayList<Integer> B) {
		ArrayList<ArrayList<Integer>> result= new ArrayList<ArrayList<Integer>>();
		System.out.println("A - "+A);
		
		for(int i =0; i<B.size();i++) {//for all B rotate A
			ArrayList<Integer> A1=new ArrayList<Integer>();
			for(int a : A) {
				A1.add(a);
			}
			System.out.println("A1 - "+A1);
			System.out.println(B.get(i)+" "+A.size());
			int b = B.get(i)%A.size();
			System.out.println(b);
			if(b!=0) {

				ArrayList<Integer> C = new ArrayList<Integer>();
				for (int j = 0; j < b; j++) {
					C.add(j, A1.get(j));
				}
				System.out.println("C: "+C);
				for (int j = 0; j < C.size(); j++) {
					A1.remove(C.get(j));
				}
			//	System.out.println("A1 - "+A);
				for (int j = 0; j < C.size(); j++) {
					A1.add(C.get(j));
				}
				System.out.println("Left Shift result");
				System.out.println(A1);
				result.add(A1);
			}else {
				result.add(A);
			}
			System.out.println("Result - "+result);
		}
		for(ArrayList i: result)
			System.out.println(i);
		
	}

	// Plus One
	public static void plusOne(ArrayList<Integer> A) {

		int carry = 1;
		for (int i = A.size() - 1; i >= 0; i--) {
			System.out.println("At index: " + i + " " + A.get(i));
			if (A.get(i) >= 0 && A.get(i) < 9) {
				System.out.println("carry-" + carry);
				A.set(i, A.get(i) + carry);

				carry = 0;
				continue;
			} else if (A.get(i) == 9 && carry == 1) {
				A.set(i, 0);
				carry = 1;
			} else {
				A.set(i, A.get(i) + carry);
				carry = 0;
			}

		}
		if (carry == 1) {
			A.set(0, carry);
			A.add(0);
		}

		int i = 0;
		while (i < A.size()) {
			System.out.println(A.get(i));
			if (A.get(i) == 0) {
				A.remove(i);
				System.out.println("removed");
				i = 0;
			} else if (A.get(i) > 0) {
				break;
			}
			
		}

		System.out.println(A);

	}

	// Multiplication of previous and next
	public static ArrayList<Integer> multiplication(ArrayList<Integer> A) {

		if (A.size() == 1)
			return A;

		ArrayList<Integer> B = new ArrayList<Integer>();
		// copying elements in B
		for (int i : A) {
			B.add(i);
		}

		for (int i = 0; i < A.size(); i++) {

			if (i == 0) {
				A.set(i, B.get(i) * B.get(i + 1));
				continue;
			}
			if (i == A.size() - 1) {
				A.set(i, B.get(i) * B.get(i - 1));
				continue;
			}

			A.set(i, B.get(i - 1) * B.get(i + 1));
		}
		return A;

	}

	// Primal Power
	public static int countPrimes(ArrayList<Integer> A) {
		int count = 0;
		boolean prime_flag = true;
		for (int i = 0; i < A.size(); i++) {
			prime_flag = true;

			int num = A.get(i);
			if (num > 0 && num != 1) {

				for (int j = 2; j <= num / 2; j++) {
					if (num % j == 0) {
						prime_flag = false;
						break;
					} else {
						// System.out.println("Flag true " + num);
						prime_flag = true;
					}
				}
			} else {
				prime_flag = false;
			}

			if (prime_flag) {
				count++;
			}
		}
		return count;
	}

	// Primal Power
	public static int primalPower(ArrayList<Integer> A) {
		int count = 0;
		boolean prime_flag = true;
		for (int i = 0; i < A.size(); i++) {
			prime_flag = true;
			int num = A.get(i);
			if (num > 0 && num != 1) {
				for (int j = 2; j <= sqrt(num); j++) {
					if (num % j == 0) {
						prime_flag = false;
						break;
					} else {

						prime_flag = true;
					}
				}
			} else
				prime_flag = false;

			System.out.println("For - " + num + " Flag is : " + prime_flag);
			if (prime_flag) {
				count++;
			}
		}

		return count;
	}

	// sqrt function
	public static int sqrt(int n) {
		int sqrt = 1;
		for (int i = 1; i < n; i++) {
			if (i * i > n)
				break;
			else
				sqrt = i;
		}
		return sqrt;
	}

	public static void main(String[] args) {

		/*
		 * int[] a = new int[] { 97, 43, 29, 11, 100, 47, 76, 83, 37, 19, 17, 19, 71, 0,
		 * 1, -82, 2, -83, 37, 13, 5, 97, 17, 30, 31, 48, 2, 19, 31, 91, 19, 2, 5, 89,
		 * 2, 67, 31, 47, 43, 31, 5, 17, 83, 11, 47, 73, 19, 3, 3, 19, 59, 91, 67, 7,
		 * 43, 4, 3, 51, 52, 23, 3, 37, 53, 89, 9, 41, 19, 61, 7, 5, 53, 59, 19, 11, 79,
		 * 37, 31, 37, 73, 82, 41, 2, 13, 8, 2, 36, 19, 58, 17, 17, 59, 59, 37, 11, 13,
		 * 37, 47, 83, 31, 3 };
		 */
		// int[] a = new int[] { 6, 4, 7, 7, 8, 9 };
		// int[] a = new int[] { 1,9,9 };
		// int[] a = new int[] { 1, 1, 1, 3, 2, 1, 1, 2, 5, 9, 6, 5 };
		// int[] a =new int[] {3, 0, 6, 4, 0 };
		//int[] a = new int[] { 0, 0, 0 };
		//ArrayList<Integer> A = IntStream.of(a).boxed().collect(Collectors.toCollection(ArrayList::new));
		//plusOne(A);
		// System.out.println(multiplication(A));
		// System.out.println(countPrimes(A));
		// System.out.println(sqrt(25));
		// System.out.println(primalPower(A));
		int [] a = new int[] {1, 2, 3, 4, 5};
		int[] b = new int[] {2, 3};
		ArrayList<Integer> A = IntStream.of(a).boxed().collect(Collectors.toCollection(ArrayList::new));
		ArrayList<Integer> B = IntStream.of(b).boxed().collect(Collectors.toCollection(ArrayList::new));
		multipleLeftRotation(A, B);

	}

}

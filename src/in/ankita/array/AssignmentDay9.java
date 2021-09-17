package in.ankita.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AssignmentDay9 {

	// Rotate Matrix
	public static void rotateMatrix(int[][] a) {
		int N = a.length;
		// Traverse each cycle
		for (int i = 0; i < N / 2; i++) {
			for (int j = i; j < N - i - 1; j++) {
				// Swap elements of each cycle
				// in clockwise direction
				int temp = a[i][j];
				a[i][j] = a[N - 1 - j][i];
				a[N - 1 - j][i] = a[N - 1 - i][N - 1 - j];
				a[N - 1 - i][N - 1 - j] = a[j][N - 1 - i];
				a[j][N - 1 - i] = temp;
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				System.out.print(a[i][j] + " ");
			System.out.println();
		}
	}

	// Anti Diagonal
	public static void antiDiagonal(int[][] A) {
		int n = A.length;
		int N = 2 * n - 1;

		ArrayList<ArrayList<Integer>> result = new ArrayList<>();

		for (int i = 0; i < N; i++) {

			result.add(new ArrayList<>());
		}
		// Push each element in the result vector
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// result.get(i + j).set(i, A[i][j]);
				result.get(i + j).add(A[i][j]);
			}
		}
		
		for(int i =0;i<N;i++) {
			while(result.get(i).size()<n)
			{
				result.get(i).add(0);
			}
		}

		System.out.println(result);
	}

	// 2D spiral matrix
	public static void spiralMatrix(int A) {

		// int row = A, col = A;
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		int row_start = 0, row_end = A - 1;
		int col_start = 0, col_end = A - 1;
		int value = 0;
		int[][] spiralMat = new int[A][A];
		if (A == 1) {
			spiralMat[0][0] = 1;
		}

		while (row_start < row_end && col_start < col_end) {

			// first row
			for (int c = col_start; c <= col_end; c++) {
				spiralMat[row_start][c] = ++value;
			}
			row_start++;

			// last col
			for (int r = row_start; r <= row_end; r++) {
				spiralMat[r][col_end] = ++value;
			}
			col_end--;

			// last row
			for (int c = col_end; c >= col_start; c--) {
				spiralMat[row_end][c] = ++value;
			}
			row_end--;

			// first col
			for (int r = row_end; r >= row_start; r--) {
				spiralMat[r][col_start] = ++value;
			}
			col_start++;
		}
		if (row_end == row_start && col_end == col_start) {
			spiralMat[row_end][col_end] = ++value;
		}

		for (int i = 0; i < A; i++) {
			matrix.add(new ArrayList<Integer>());
			for (int j = 0; j < A; j++) {
				matrix.get(i).add(spiralMat[i][j]);
			}
		}

		System.out.println(matrix);
	}

	// Search in a row wise and column wise sorted matrix
	public static int searchValue(List<List<Integer>> A, int B) {
		for (int i = 0; i < A.size(); i++) {
			for (int j = 0; j < A.get(i).size(); j++) {
				if (A.get(i).get(j) == B) {
					System.out.println(i + " " + j + " " + i * 1009 + " ");
					return ((i + 1) * 1009 + (j + 1));
				}
			}
		}
		return -1;
	}

	// Row with maximum number of ones
	@SuppressWarnings("rawtypes")
	public static void maxOneRows(List<List<Integer>> A) {
		int row = 0;
		int maxCount = 0;
		/*
		 * int k = 0; for (List i : A) {
		 * 
		 * int count = 0; for (Object j : i) { if ((int) j == 1) { count++; } } if
		 * (maxCount < count) { maxCount = count; row = k; } k++; }
		 */

		for (int i = 0; i < A.size(); i++) {
			int count = 0;
			for (int j = 0; j < A.get(i).size(); j++) {
				if (A.get(i).get(j) == 1) {
					count++;
				}
			}
			if (maxCount < count) {
				maxCount = count;
				row = i;
			}
		}

		System.out.println(row);
	}

	public static void pascalTriangle(int n) {
		int[][] mat = new int[n][n];
		/*
		 * for (int i = 0; i < n; i++) { for (int j = 0; j <= i; j++) {
		 * 
		 * mat[i][j] = (factorial(i) / (factorial(i - j) * factorial(j))); }
		 * 
		 * }
		 */
		// Iterate through every line and print integer(s) in it
		for (int line = 0; line < n; line++) {
			// Every line has number of integers equal to line number
			for (int i = 0; i <= line; i++) {
				// First and last values in every row are 1
				if (line == i || i == 0)
					mat[line][i] = 1;
				else // Other values are sum of values just above and left of above
					mat[line][i] = mat[line - 1][i - 1] + mat[line - 1][i];
				System.out.print(mat[line][i]);
			}
			System.out.println("");
		}

		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < n; i++) {
			result.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < n; i++) {
			ArrayList<Integer> values = new ArrayList<>();

			for (int j = 0; j < n; j++) {
				values.add(mat[i][j]);
			}
			result.set(i, values);
		}
		System.out.println(result);
	}

	public static int factorial(int i) {
		if (i == 0)
			return 1;
		return i * factorial(i - 1);
	}

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {

		// Scanner sc = new Scanner(System.in);
		/*
		 * int row = sc.nextInt();// taking rowsize // Declaring dynamic 2d matrix
		 * List<List<Integer>> matrix = new ArrayList<List<Integer>>(); for (int i = 0;
		 * i < row; i++) { List<Integer> list = new ArrayList<Integer>();// adding list
		 * in first row matrix.add(list); int col = sc.nextInt();// taking col size for
		 * (int j = 0; j < col; j++) {// adding colum values list.add(sc.nextInt()); }
		 * // end of colms matrix.set(i, list);// setting list in the row } for (List i
		 * : matrix) { System.out.println(i); }
		 */
		// maxOneRows(matrix);
		// spiralMatrix(21);
		// pascalTriangle(5);
		// System.out.println(searchValue(matrix, 2));
		/*
		 * ArrayList<Integer> A =new ArrayList<Integer>(); int size=sc.nextInt();
		 * while(size>0) { A.add(sc.nextInt()); size--; }
		 */

		int[][] a = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		// rotateMatrix(a);

		antiDiagonal(a);

	}

}

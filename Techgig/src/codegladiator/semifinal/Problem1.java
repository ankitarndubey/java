package codegladiator.semifinal;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem1 {
	public static int n = (int) (1e6 + 10);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N;
		while (T > 0) {
			N = sc.nextInt();
			int[] values = new int[N];
			String[] elements = new String[N];
			ArrayList<Integer> vals = new ArrayList<>();
			ArrayList<Integer> maxSum = new ArrayList<>();
			int element;
			for (int i = 0; i < N; i++) {
				element = sc.nextInt();
				values[i] = element;
				elements[i] = element + "";
				vals.add(element);
			}

			element = 0;
			char[] char1 = elements[0].toCharArray();
			maxSum.add(values[0]);
			boolean common_digit = false;
			for (int i = 0; i < N; i++) {
				char[] char2 = elements[i].toCharArray();

				if (!maxSum.contains(values[i])) {
					for (int j = 0; j < char1.length; j++) {
						for (int k = 0; k < char2.length; k++) {
							if (char1[j] == char2[k]) {
								System.out.println("Found common digits - " + char1[j] + " " + char2[k]);
								common_digit = true;
								if (values[i] > values[i - 1] || values[i] == values[i - 1]) {
									{
										if (maxSum.contains(values[i - 1])) {
											System.out.println("Removed " +values[i-1]+" From maxSum ");
											maxSum.remove(i-1);
										}
										maxSum.add(values[i]);

									}

								} else {
									// maxSum.add(values[i - 1]);
								}
							}
						}
					}

					if (!common_digit) {
						if (!maxSum.contains(values[i - 1]))
							maxSum.add(values[i - 1]);
						if (!maxSum.contains(values[i]))
							maxSum.add(values[i]);

					}
				}
				System.out.println("Formed MaxSum: " + maxSum);
				char1 = elements[i].toCharArray();
				common_digit = false;
			}

			System.out.println(maxSum);
			/*
			 * char[] char1, char2; boolean common_digit = false; for (int i = 0; i < N;
			 * i++) { if (i + 1 != N) { char1 = elements[i].toCharArray(); char2 =
			 * elements[i + 1].toCharArray(); for (int j = 0; j < char2.length; j++) { for
			 * (int k = 0; k < char1.length; k++) { if (char2[j] == char1[k]) { common_digit
			 * = true; break; } else common_digit = false; } if (common_digit) break; }
			 * 
			 * if (common_digit) { if (values[i] > values[i + 1]) { maxSum = maxSum +
			 * values[i]; System.out.println(maxSum); } else { maxSum = maxSum + values[i +
			 * 1]; System.out.println("here"+maxSum); i+=2; common_digit = false; }
			 * 
			 * } } if (!common_digit) { System.out.println(maxSum+" "+values[i]); maxSum =
			 * maxSum + values[i]; System.out.println(maxSum); }
			 * 
			 * }
			 */
			for (int num : maxSum)
				element += num;
			System.out.print("result - " + element);
			--T;
		}

	}

}

package codegladiator.semifinal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.tree.VariableHeightLayoutCache;

public class MaxSumSubArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T > 0) {
			int N = sc.nextInt();
			ArrayList<Integer> maxSum = new ArrayList<>();
			ArrayList<Integer> values = new ArrayList<>();
			int[] value_stack = new int[N];

			int value;
			for (int i = 0; i < N; i++) {
				value = sc.nextInt();
				values.add(value);
				value_stack[i] = value;
			}
			Collections.sort(values);
			System.out.println(values);
			MaxSumSubarray(values);

			--T;
		}

	}

	private static void MaxSumSubarray(ArrayList<Integer> values) {
		ArrayList<Integer> maxSum = new ArrayList<>();
		maxSum.add(values.get(0));
		char[] char1, char2;
		boolean common_digit = false;
		int value = 0;
		for (int i = 0; i < values.size(); i++) {
			for (int a = 0; a < maxSum.size(); a++) {
				System.out.println("For - " + maxSum.get(a) + " " + values.get(i));
				common_digit = false;
				if (maxSum.get(a) != values.get(i)) {
					char1 = values.get(i).toString().toCharArray();
					char2 = maxSum.get(a).toString().toCharArray();
					for (int j = 0; j < char1.length; j++) {
						for (int k = 0; k < char2.length; k++) {
							System.out.println("checking duplicates : " + char1[j] + ":" + char2[k]);
							if (char1[j] == char2[k]) {
								common_digit = true;
								System.out.println(maxSum);
								if (maxSum.contains(values.get(i))) {
									maxSum.remove(a);
									System.out.println("Removing" + maxSum);
								} else {
									if (values.get(i) > maxSum.get(a)) {
										int sum1 = 0;
										for (int num : maxSum) {
											value += num;
										}
										sum1 = value - maxSum.get(a) + values.get(i);

										if (sum1 > value) {
											maxSum.set(a, values.get(i));
											System.out.println("Replacing " + maxSum);
										}
									}
								}
							}
							if (common_digit)
								break;
						}
						if (common_digit)
							break;
					}
				}
			}
			if (!common_digit && !maxSum.contains(values.get(i))) {
				System.out.println("Adding into maxSum");
				maxSum.add(values.get(i));
			}
			System.out.println("Formed MaxSum: " + maxSum);
			common_digit = false;
			value = 0;
		}
		for (int num : maxSum)
			value += num;
		System.out.println(value);
	}

}

package codegladiator.semifinal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem1_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T > 0) {
			int N = sc.nextInt();
			ArrayList<Integer> maxSum = new ArrayList<>();
			ArrayList<Integer> values = new ArrayList<>();
			int[] value_stack = new int[N];
			boolean common_digit = false;
			int value;
			for (int i = 0; i < N; i++) {
				value = sc.nextInt();
				values.add(value);
				value_stack[i] = value;
			}
			Collections.sort(values);
		//	System.out.println(values);
			value = 0;
			char[] char1, char2;
			maxSum.add(values.get(0));
			for (int i = 0; i < N; i++) {
				for (int a = 0; a < maxSum.size(); a++) {
					//System.out.println("For - "+maxSum.get(a)+" "+values.get(i));
					if (values.get(i) != maxSum.get(a)) {
						char1 = values.get(i).toString().toCharArray();
						char2 = maxSum.get(a).toString().toCharArray();
						for (int j = 0; j < char1.length; j++) {
							for (int k = 0; k < char2.length; k++) {
								if (char1[j] == char2[k]) {
									common_digit = true;
									if (values.get(i) > maxSum.get(a)) {
										//System.out.println("Removing " + maxSum.get(a));
										maxSum.set(a, values.get(i));
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
					//System.out.println("Adding into maxSum");
					maxSum.add(values.get(i));
				}
				//System.out.println("Formed MaxSum: " + maxSum);
				common_digit = false;
			}
			for (int num : maxSum)
				value += num;
			System.out.print(value);
			System.out.println("");
			--T;
		}
	}
}

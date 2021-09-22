package codegladiator;

import java.util.Scanner;

public class CodeGladiator_Jio {

	public void codegladiator_winorlose() {

		/*
		 * 
		 * Scanner sc = new Scanner(System.in); int n = sc.nextInt(); int[] arr = new
		 * 
		 * int[n]; for (int i = 0; i < n; i++) { arr[i] = sc.nextInt(); }
		 *
		 * 
		 * 
		 * double positive_val = 0; double negative_val = 0; double zeroes = 0; for (int
		 * 
		 * i =0;i<arr.length;i++) { if (arr[i] == 0) zeroes++; else if (arr[i] >= 1)
		 * 
		 * positive_val++; else negative_val++; }
		 *
		 * 
		 * 
		 * System.out.println(positive_val / arr.length);
		 * 
		 * System.out.println(negative_val / arr.length); System.out.println(zeroes /
		 * 
		 * arr.length);
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();// number of test cases

		if (T >= 1 && T <= 10) {

			String result[] = new String[T];

			int N;// number of players and villains

			for (int i = 0; i < T; i++) {

				N = sc.nextInt();

				if (N >= 1 && N <= 1000) {

					int villain_strength[] = new int[N];

					int player_energy[] = new int[N];

					for (int j = 0; j < N; j++) {// for reading array

						villain_strength[j] = sc.nextInt();

						if (villain_strength[j] >= 1 && villain_strength[j] <= 100000) {

						} else {

							System.exit(1);

						}

					}

					for (int k = 0; k < N; k++) {// for reading array

						player_energy[k] = sc.nextInt();

						if (player_energy[k] >= 1 && player_energy[k] <= 100000) {

						} else {

							System.exit(1);

						}

					}

					// sort the arrays

					int temp = 0;

					for (int a = 0; a < N; a++) {

						for (int b = 1; b < (N - a); b++) {

							if (villain_strength[b - 1] > villain_strength[b]) {

								temp = villain_strength[b - 1];

								villain_strength[b - 1] = villain_strength[b];

								villain_strength[b] = temp;

							}

						}

					}

					temp = 0;

					for (int a = 0; a < N; a++) {

						for (int b = 1; b < (N - a); b++) {

							if (player_energy[b - 1] > player_energy[b]) {

								temp = player_energy[b - 1];

								player_energy[b - 1] = player_energy[b];

								player_energy[b] = temp;

							}

						}

					}

					int win = 0;

					for (int l = 0; l < N; l++) {

						if (player_energy[l] > villain_strength[l]) {

							win++;

						}

					}

					if (win == N) {

						result[i] = "WIN";

					} else {

						result[i] = "LOSE";

					}

				} else {

					System.exit(1);

				}

			}

			for (String output_result : result) { // for printing array

				System.out.println(output_result);

			}

		} else {

			System.exit(1);

		}

	}

	public static void main(String[] args) {

		// New Year Party

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();// number of test cases
		
		if (T >= 1 && T <= 10) {
			String result[] = new String[T];
			int N;// number of houses OR distributed tickets
			
			for (int i = 0; i < T; i++) {
				N = sc.nextInt();

			if (N >= 1 && N <= 10000) {

					int tickets[] = new int[N];
					
					for (int j = 0; j < N; j++) {// for reading array
						tickets[j] = sc.nextInt();

						if (tickets[j] >= -1000 && tickets[j] <= 1000) {// checking values constraint on tickets
						} else {
							System.exit(1);
						}
					}
					int sum1 = 0, sum2 = 0;
					int index_of_sum1 = 0, index_of_sum2 = 0, max = 0;

					// find the highest ticket
					max = tickets[0];

					for (int k = 0; k < N; k++) {
						if (max < tickets[k]) {
							max = tickets[k];
						}
					}

					// scan the tickets array for sum of positive tickets
					for (int j = 0; j < N - 2; j++) {

						if (tickets[j] > 0 && tickets[j + 2] > 0) {
							sum1 = tickets[j] + tickets[j + 2];
							index_of_sum1 = j;

							if (sum1 > sum2) {
								sum2 = sum1;
								index_of_sum2 = index_of_sum1;
							}

							else if (sum1 == sum2) {// if tickets sum are equal

								// find the higher tickets
								if (tickets[index_of_sum2 + 2] < tickets[index_of_sum1 + 2]) {
									index_of_sum2 = index_of_sum1;
							}
								else {
									// if the ticket value is higher then
								}
							}

						} else {

							// No positive tickets to add
							// find the highest ticket
						}
					} // found the highest sum and it's index

					if (sum2 > 0 && sum2 > max) {
						result[i] = tickets[index_of_sum2 + 2] + "" + tickets[index_of_sum2];
					} else {
						result[i] = max + "";
					}
				} else {// else of N range
					System.exit(1);
				}
			}

			// to print the result
			for (String output_result : result) { // for printing array
				System.out.println(output_result);
			}
		} else {// else of test cases if
			System.exit(1);
		}
	}// end of main
}
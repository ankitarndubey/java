package codegladiator;

import java.util.Scanner;
//WIN or LOSE
public class CodeGladiator1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();// number of test cases
		if (T >= 1 && T <= 10) {
			int N;// number of players and villains
			for (int i = 0; i < T; i++) {
				N = sc.nextInt();
				if (N >= 1 && N <= 1000) {
					int villain_strength[] = new int[N];
					int player_energy[] = new int[N];
					for (int j = 0; j < N; j++) {// for reading array
						villain_strength[j] = sc.nextInt();
						if (villain_strength[j] >= 1 && villain_strength[j] <= 100000) {
						}
					}

					for (int k = 0; k < N; k++) {// for reading array
						player_energy[k] = sc.nextInt();
						if (player_energy[k] >= 1 && player_energy[k] <= 100000) {
						}
					}

					// sort the arrays
					int temp1 = 0, temp2 = 0;
					for (int a = 0; a < N; a++) {
						for (int b = 1; b < (N - a); b++) {
							if (villain_strength[b - 1] > villain_strength[b]) {
								temp1 = villain_strength[b - 1];
								villain_strength[b - 1] = villain_strength[b];
								villain_strength[b] = temp1;
							}

							if (player_energy[b - 1] > player_energy[b]) {
								temp2 = player_energy[b - 1];
								player_energy[b - 1] = player_energy[b];
								player_energy[b] = temp2;
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
						System.out.println("WIN");
					} else {
						System.out.println("LOSE");
					}
				}
			}
			sc.close();
		}
	}
}

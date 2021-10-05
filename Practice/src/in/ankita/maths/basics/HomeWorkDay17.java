package in.ankita.maths.basics;

public class HomeWorkDay17 {

	/*
	 * The Prime Game Problem Description
	 * 
	 * Two players are playing a game. The rules are as follows:
	 * 
	 * Player 1 always moves first, and both players always play optimally.
	 * Initially there are A piles, where each pile has B number of stones. The
	 * players move in alternating turns. In each turn, a player can choose a pile
	 * of size x and reduce the number of stones to y, where 1 <= y < x, and x and y
	 * are coprime. If the current player is unable to make a move, they lose the
	 * game. Determine the winner of the game
	 */
	
	public static int primeGame(int A, int B) {
		int player1=1;
		int player2=2;
		
		if(B==1) {
			return player2;
		}
		else {
			if(A%2==0) {
				return player2;
			}
			else
				return player1;
		}
		
	}
	public static void main(String[] args) {
		System.out.println(primeGame(3, 1));

	}

}

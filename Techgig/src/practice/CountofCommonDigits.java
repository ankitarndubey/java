package practice;
// Java program to find the length of subsequence which has 

// atleast one digit common among all its elements 

import java.io.*;

class CountofCommonDigits {

	// If the number contains a digit increase
	// the count by 1 (even if it has multiple
	// same digit the count should be increased
	// by only once)
	static void count_(int count[], int e) {
		// Hash to make it sure that a digit
		// is counted only once
		boolean hash[] = new boolean[10];

		// Set the hash to its initial value
		// memset(hash, false, sizeof(hash));

		// Extract the digits
		while (e > 0) {

			// If the digit did not appear before
			if (hash[e % 10] == false)

				// Increase the count
				count[e % 10]++;

			// Mark the digit as visited
			hash[e % 10] = true;

			// Delete the digit
			e /= 10;
		}
	}

	// Function to find the length of subsequence which has
	// atleast one digit common among all its elements
	static void find_subsequence(int arr[], int n) {
		// Count of digits
		int count[] = new int[10];

		// Set the initial value to zero
		// memset(count, 0, sizeof(count));
		for (int i = 0; i < n; i++) {

			// Extract the digits of the element
			// and increase the count
			count_(count, arr[i]);
		}
		for (int i = 0; i < n; i++) {
			System.out.print(count[i]+" ");
		}
		// Longest subsequence
		int longest = 0;

		// Get the longest subsequence
		for (int i = 0; i < 10; i++)
			longest = Math.max(count[i], longest);

		// Print the length of longest subsequence
		System.out.print("Longest subsequence "+longest);
	}

	// Driver code
	public static void main(String[] args) {
		//int arr[] = { 11, 12, 23, 74, 13 };
		int arr[] = { 11, 1, 23, 74, 13,14,7 };

		int n = arr.length;

		find_subsequence(arr, n);

	}
}
// This code is contributed
// by shs

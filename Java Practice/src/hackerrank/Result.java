package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	/*
	 * Complete the 'findDay' function below.
	 *
	 * The function is expected to return a STRING. The function accepts following
	 * parameters: 1. INTEGER month 2. INTEGER day 3. INTEGER year
	 */

	/*
	 * public static String findDay(int month, int day, int year) { Calendar cal=
	 * Calendar.getInstance();
	 * 
	 * cal.set(Calendar.DAY_OF_MONTH, day); //Set Day of the Month, 1..31
	 * cal.set(Calendar.MONTH,month-1); //Set month, starts with JANUARY = 0
	 * cal.set(Calendar.YEAR,year); //Set year System.out.println(); // DateTime
	 * date = new DateTime(); System.out.println(cal.getTime()); String dayWeekText
	 * = new SimpleDateFormat("EEEE").format(cal.getTime());
	 * 
	 * return dayWeekText.toUpperCase();
	 * 
	 * 
	 * }3
	 */
	public static List<Integer> rotLeft(List<Integer> a, int d) {
		// Write your code here
		List<Integer> b = new ArrayList<Integer>();
		for (int i = d; i < a.size(); i++) {
			b.add(a.get(i));
		}
		for(int i =0;i<d;i++)
			b.add(a.get(i));
		return b;
	}

}

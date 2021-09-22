package hackerrank;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.rotLeft(a, d);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
/*

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		
		 Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	         Enter your code here. Print output to STDOUT. 
	        System.out.println(A.length()+B.length());
	        System.out.println(A.compareTo(B)>0 ? "Yes" : "No");
	        System.out.println(A.substring(1,0).toUpperCase()+A.substring(1,A.length())+" "+   
	        				   B.substring(1,0).toUpperCase()+B.substring(1,B.length()));
	        
		String n = in.next();
		try {
			BigInteger a = new BigInteger(n);
			System.out.println(a.isProbablePrime(0));
		} catch (Exception e) {
			System.out.println("Not a number");
		}
		in.close();
		/*
		 * int testCases = Integer.parseInt(in.nextLine()); while(testCases>0){ String
		 * pattern = in.nextLine(); //Write your code try{ Pattern.compile(pattern);
		 * System.out.println("Valid"); }catch(Exception e) {
		 * System.out.println("Invalid"); } testCases--; } /* Scanner scanner = new
		 * Scanner(System.in); double payment = scanner.nextDouble(); scanner.close();
		 * 
		 * // Write your code here. NumberFormat
		 * us=NumberFormat.getCurrencyInstance(Locale.US); NumberFormat
		 * india=NumberFormat.getCurrencyInstance(new Locale("en","in")); NumberFormat
		 * china=NumberFormat.getCurrencyInstance(Locale.CHINA); NumberFormat
		 * france=NumberFormat.getCurrencyInstance(Locale.FRANCE);
		 * System.out.println("US: " + us.format(payment)); System.out.println("India: "
		 * + india.format(payment)); System.out.println("China: " +
		 * china.format(payment)); System.out.println("France: " +
		 * france.format(payment));
		 * 
		 * /*
		 * 
		 * 
		 * /* BufferedReader bufferedReader = new BufferedReader(new
		 * InputStreamReader(System.in)); BufferedWriter bufferedWriter = new
		 * BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		 * 
		 * String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$",
		 * "").split(" ");
		 * 
		 * int month = Integer.parseInt(firstMultipleInput[0]);
		 * 
		 * int day = Integer.parseInt(firstMultipleInput[1]);
		 * 
		 * int year = Integer.parseInt(firstMultipleInput[2]);
		
		int month = in.nextInt();

		int day = in.nextInt();

		int year = in.nextInt();

		String res = Result.findDay(month, day, year);
		System.out.println(res);
		/*
		 * bufferedWriter.write(res); bufferedWriter.newLine();
		 * 
		 * bufferedReader.close(); bufferedWriter.close();
		 
	}
*/}

/*
 * int t=in.nextInt(); for(int i=0;i<t;i++){ int a = in.nextInt(); int b =
 * in.nextInt(); int n = in.nextInt(); int cal=a; for(int j=0;j<=n-1;j++){
 * 
 * // System.out.println(Math.pow(2,j)*b); cal=cal+(int)((Math.pow(2,j)*b));
 * System.out.print(cal+" "); } System.out.println(); } in.close();
 * 
 * 
 * /* System.out.println("================================"); for(int
 * i=0;i<3;i++){ String s1=sc.next(); int x=sc.nextInt(); //Complete this line
 * String st = x+""; int space=15-s1.getBytes().length-st.getBytes().length;
 * System.out.print(s1); while(space>0) { System.out.print(" "); space--; }
 * if(st.getBytes().length==1) System.out.print("00"+x); else
 * if(st.getBytes().length==2) System.out.print("0"+x); else
 * System.out.print(x); System.out.println(); }
 * System.out.println("================================");
 * 
 * 
 * 
 * /* int N = scanner.nextInt();
 * scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?"); scanner.close(); if(N%2!=0)
 * { System.out.println("in if"); System.out.println("Weird"); }else{ if(N>=2 &&
 * N<=5 || N >20) System.out.println("Not Weird"); else if (N>=6 && N<=20)
 * System.out.println("Weird"); }
 * 
 * int i = scanner.nextInt(); double d = scanner.nextDouble(); String s =
 * scanner.next(); // Write your code here.
 * 
 * System.out.println("String: " + s); System.out.println("Double: " + d);
 * System.out.println("Int: " + i);
 * 
 * 
 * }
 * 
 * }
 */

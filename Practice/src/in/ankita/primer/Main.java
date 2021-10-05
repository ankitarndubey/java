package in.ankita.primer;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		/*ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();

	    while(scan.hasNextInt()){
	         A.add(scan.nextInt());
	    }
	    while(scan.hasNextInt()){
	         A.add(scan.nextInt());
	    }
	    System.out.println(A.toString()+"\n"+B.toString());*/
		PonnyDonnyMobile pnm=new PonnyDonnyMobile();
		ArrayList<Integer> result=pnm.solve();
		System.out.println(result.toString());
	}

}

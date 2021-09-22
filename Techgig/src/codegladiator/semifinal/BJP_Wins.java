package codegladiator.semifinal;

import java.util.Scanner;

public class BJP_Wins {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int r_phases=sc.nextInt();
			int c_states=sc.nextInt();
			int val;
			int[] r_conditions=new int[r_phases];
			int[] c_conditions=new int[c_states];
			int[] r_sums=new int[r_phases];
			int[] c_sums=new int[c_states];
			for(int i=0;i<r_phases;i++) {
				val=sc.nextInt();
				r_conditions[i]=val;
				r_sums[i]=val;
			}
			for(int i=0;i<c_states;i++) {
				val=sc.nextInt();
				c_conditions[i]=val;
				c_sums[i]=val;
			}
			int[][] election=new int[r_phases+1][c_states+1];
			
			for(int i=0;i<r_phases;i++) {
				for(int j=0;j<c_states;j++) {
					if(c_conditions[j]!=0 && r_conditions[i]!=0) {
						election[i][j]=1;
						c_conditions[j]=c_conditions[j]-1;
						r_conditions[i]=r_conditions[i]-1;
					}
				}
			}
			
			for(int i=0;i<r_phases;i++) {
				for(int j=0;j<c_states;j++) {
					System.out.print(election[i][j]+" ");
				}
				System.out.println("");
			}
			int sum_row=0,sum_col=0;
			boolean metRowCond=false,metColCond=false;
			for(int i=0;i<r_phases;i++) {
				for(int j=0;j<c_states;j++) {
					sum_row+=election[i][j];
				}
				
				if(sum_row==r_sums[i])
					metRowCond=true;
				else
					metRowCond=false;
				sum_row=0;
				
			}
			for(int i=0;i<c_states;i++) {
				for(int j=0;j<r_phases;j++) {
					sum_col+=election[j][i];
				}
				
				if(sum_col==c_sums[i])
					metColCond=true;
				else
					metColCond=false;
				sum_col=0;
				
			}
			System.out.println("sum_row: "+metRowCond);
			System.out.println("sum_col: "+metColCond);
			if(metRowCond && metColCond)
				System.out.print("Yes");
			else
				System.out.print("No");
			System.out.println("");
			}

	}

}
/*
 * 
 * Input 
 2 
 3 2 
 2 1 0 
 1 2 
 3 3 
 3 2 1 
 1 2 2 
 *   1 2 
 * 2 b b 
 * 1 0 b 
 * 0 0 0
 * 

 * 
 *  1 2 2 
 * 3 b b b
 * 2 0 b b 
 * 1 0 0 b
 * 
 * Output YES NO
 * 
 */
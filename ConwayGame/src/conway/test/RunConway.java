package conway.test;

import java.util.Arrays;

public class RunConway {

	public static void main(String[] args) {

		int neighbours[]= {1,0,0,0,0,0,0,0};
		int cell=1;
		CellLifeValidator cv =new CellLifeValidator();
		System.out.println(cv.isAlive(countNeighbours(neighbours),cell));
		
		//take a random grid
		// Intiliazing the grid. 
        int[][] grid = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
            { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 }, 
            { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 }, 
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
            { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 }, 
            { 0, 0, 1, 1, 0, 0, 0, 0, 0, 0 }, 
            { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 }, 
            { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 }, 
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } 
        }; 
		//find cell status
        
		//update  cell status
	}

	public static int countNeighbours(int neighbours[]) {
		return Arrays.stream(neighbours).reduce(0,(ele1,ele2)->ele1+ele2);
		
	}
	
}

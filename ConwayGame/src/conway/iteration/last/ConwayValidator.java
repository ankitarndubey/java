package conway.iteration.last;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ConwayValidator {

	public  int countAliveNeighbours(int neighbours[]) {
		return Arrays.stream(neighbours).reduce(0,(ele1,ele2)->ele1+ele2);
		
	}
	public  int isAlive(int aliveNeighbours, int cellValue) {

		Map<Integer, Integer> validators = new HashMap<Integer, Integer>() {
			{
				put(2, cellValue);
				put(3, 1);
			}
		};

		return validators.getOrDefault(aliveNeighbours, 0);
	}
	
	
	public static void main(String args[]) {
		ConwayValidator cv=new ConwayValidator();
		int[] neighbours={1,0,0,0,0,0,0,0};
		System.out.println(cv.isAlive(cv.countAliveNeighbours(neighbours),1)); 
		
		//take a grid
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
        
        
		
		
		
	}
	
}

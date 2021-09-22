package conway.iteration.last;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestConway {
	ConwayValidator cv=new ConwayValidator();	

	@Test
	public void testStarvation() {
		Assert.assertEquals(0, cv.isAlive(1,1));
		
	}
	 
	@Test
	public void testnextGeneration() {
		Assert.assertEquals(1, cv.isAlive(2,1));
		Assert.assertEquals(0, cv.isAlive(2,0)); 
		Assert.assertEquals(1, cv.isAlive(3,1));
	}
	
	@Test
	public void testOverPopulation() {
		Assert.assertEquals(0, cv.isAlive(4,1));
		Assert.assertEquals(0, cv.isAlive(4,0));
	}
	@Test
	public void testReproduction() {
		Assert.assertEquals(1, cv.isAlive(3,0));
	}
	/*@Test
	public void nextGeneration(int aliveNEighbours,int cellValue) {
		//Assert.assertEquals(1, cv.isAlive(aliveNEighbours,cellValue));
		Assert.assertEquals(1, cv.isAlive(2,1));
		Assert.assertEquals(1, cv.isAlive(3,1));
		Assert.assertEquals(0, cv.isAlive(2,0));
		Assert.assertEquals(0, cv.isAlive(3,0));

	}
	
	@Test
	public void overPopulation(int aliveNEighbours,int cellValue) {
		//Assert.assertEquals(0, cv.isAlive(aliveNEighbours,cellValue));
		Assert.assertEquals(0, cv.isAlive(4,1));
		Assert.assertEquals(0, cv.isAlive(4,0));
	}
	
	@Test
	public void reproduction(int aliveNEighbours,int cellValue) {
		//Assert.assertEquals(1, cv.isAlive(aliveNEighbours,cellValue));
		Assert.assertEquals(1, cv.isAlive(3,0));
		Assert.assertEquals(1, cv.isAlive(3,1));


	}*/
}

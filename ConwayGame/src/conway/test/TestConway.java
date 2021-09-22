package conway.test;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestConway {

@Test
public void testLivingStatus() {
	CellLifeValidator cv=new CellLifeValidator();
	Assert.assertEquals(0, cv.isAlive(1,1));
}

@Test
public void testLivingStatus1() {
	CellLifeValidator cv=new CellLifeValidator();
	Assert.assertEquals(0, cv.isAlive(1,0));
}

@Test
public void testLivingStatus2() {
	CellLifeValidator cv=new CellLifeValidator();
	Assert.assertEquals(1, cv.isAlive(2,1));
}

@Test
public void testLivingStatus3() {
	CellLifeValidator cv=new CellLifeValidator();
	Assert.assertEquals(0, cv.isAlive(2,0));
}

@Test
public void testLivingStatus4() {
	CellLifeValidator cv=new CellLifeValidator();
	Assert.assertEquals(1, cv.isAlive(3,1));
}

@Test
public void testLivingStatus5() {
	CellLifeValidator cv=new CellLifeValidator();
	Assert.assertEquals(1, cv.isAlive(3,0));
}

@Test
public void testLivingStatus6() {
	CellLifeValidator cv=new CellLifeValidator();
	Assert.assertEquals(0, cv.isAlive(4,1));
}

@Test
public void testLivingStatus7() {
	CellLifeValidator cv=new CellLifeValidator();
	Assert.assertEquals(0, cv.isAlive(4,0));
}
}

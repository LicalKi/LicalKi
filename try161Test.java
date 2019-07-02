package try161;

import static org.junit.Assert.*;

import org.junit.Test;

public class try161Test {
	
	try161 t1 = new try161();
	
	@Test
	public void testadd() {

		assertEquals(t1.add(2, 3),5);
	}
	
	@Test
	public void testsubstract() {

		assertEquals(t1.substract(3, 2),3);
	}
	@Test
	public void testmultiply() {

		assertEquals(t1.multiply(2, 3),6);
	}
	@Test
	public void testdivide() {

		assertEquals(t1.divide(6, 3),2);
	}

}

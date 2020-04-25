package venkat.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyoperationsTest {

	@Test
	public void testGetsummation1() {
		assertEquals(8, new Myoperations().getsummation(3, 5));
	}

	@Test
	public void testGetsummation2() {
		assertEquals(9, new Myoperations().getsummation(5, 5));
	}	
	
	@Test
	public void testGetFullName1() {
		assertEquals("Venkat ragavan", new Myoperations().getFullName("Venkat", "ragavan"));
	}

}

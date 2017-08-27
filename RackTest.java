package sortingBalls;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Sorting balls test class
 * @author jerill
 *
 */
public class RackTest {

	@Test
	public void testInitRack() {
		Rack test = new Rack();
		int[] correct = new int[] {};
		
		assertArrayEquals(correct, test.balls);
	}
	
	
	@Test
	public void testOneBall() {
		Rack test = new Rack();
		int[] correct = new int[] {44};
		
		test.add(44);
		
		assertArrayEquals(correct, test.balls);
	}
	
	@Test
	public void testSomeBalls() {
		Rack test = new Rack();
		int[] correct = new int[] {1,2,3};
		test.add(2);
		test.add(1);
		test.add(3);
		
		assertArrayEquals(correct, test.balls);
	}
	
	@Test
	public void testTenBalls() {
		Rack test = new Rack();
		int[] correct = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		test.add(2);
		test.add(1);
		test.add(3);
		test.add(10);
		test.add(9);
		test.add(8);
		test.add(7);
		test.add(6);
		test.add(5);
		test.add(4);
		
		
		assertArrayEquals(correct, test.balls);
	}

}

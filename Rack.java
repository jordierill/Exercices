package sortingBalls;

import java.util.Arrays;

/**
 * 
 * @author jerill
 *
 */
public class Rack {
	
	int[] balls = null;
	
	public Rack () {
		balls = new int[0];
	}
	
	/**
	 * Adds a new ball into de Rack
	 * @param n
	 */
	public void add (int n) {
		
		balls = Arrays.copyOf(balls, balls.length+1);
		
		balls[balls.length-1] = n;
		
		QuickSort.qSort(balls, 0, balls.length-1);
		
	}

}

package sortingBalls;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		Rack rack = new Rack();
		
		while (true) {
	       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.print("Enter a new ball : ");
	        
	        try{
	            int i = Integer.parseInt(br.readLine());
	            
	            rack.add(i);
	            
	            QuickSort.qSort(rack.balls, 0, rack.balls.length-1);
	            
	            for (int ball : rack.balls) {
					System.out.println(ball);
				}
	            
	        } catch (NumberFormatException nfe) {
	            System.err.println("Invalid Format!");
	        } catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}

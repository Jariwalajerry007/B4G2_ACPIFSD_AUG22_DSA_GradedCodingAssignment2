package com.gradedcoding.assignment2.Skyscrapermethod;

import java.util.PriorityQueue;

public class Builder {
	
	public void structure(int floor[], int noOffloor) {
		
		System.out.println("The order of construction is as follows");

		// Collections.reverseOrder() will sort priority queue in reverse order...

		PriorityQueue<Integer> queue = new PriorityQueue<>(java.util.Collections.reverseOrder());

		int[] tempfloor = new int[noOffloor];
		int max = noOffloor;
		System.out.println();
		for (int i = 0; i < noOffloor; i++) {
			
			System.out.println("Day: " + (i + 1));
			
			tempfloor[i] = floor[i];

			// Adding items to the Queue using add()
			queue.add(tempfloor[i]);

			// peek will be Printing the top element of PriorityQueue
			while (!queue.isEmpty() && queue.peek() == max) {

				// Printing the top element and removing it from the PriorityQueue container
				System.out.print(queue.poll() + " ");

				max--;
			}
			System.out.println();
		}
	}
}
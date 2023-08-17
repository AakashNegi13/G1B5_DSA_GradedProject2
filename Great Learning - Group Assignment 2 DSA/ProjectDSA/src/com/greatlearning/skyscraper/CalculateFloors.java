package com.greatlearning.skyscraper;

import java.util.Stack;

public class CalculateFloors {

	public void calculatingfloors(int n, int[] floors) {
		System.out.println("The order of construction is as follow :");
		Stack<Integer> s = new Stack<>();

		for (int i = 0; i < n; i++) {
			int floorSize = floors[i];

			while (!s.isEmpty() && floorSize < s.peek()) {
				System.out.print(s.pop() + " ");

			}

			System.out.println();
			s.push(floorSize);
			System.out.println("Day " + (i + 1) + ":");

		}

		while (!s.isEmpty()) {
			System.out.print(s.pop() + " ");

		}

	}

}

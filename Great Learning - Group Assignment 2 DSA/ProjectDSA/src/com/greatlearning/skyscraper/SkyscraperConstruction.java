package com.greatlearning.skyscraper;

import java.util.Scanner;
import java.util.Stack;

public class SkyscraperConstruction {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of floors in the building :");
		n = sc.nextInt();

		int[] floors = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the floor size given on Day " + (i + 1) + " :");
			floors[i] = sc.nextInt();

		}

		sc.close();

		CalculateFloors cf = new CalculateFloors();
		cf.calculatingfloors(n, floors);

	}
}


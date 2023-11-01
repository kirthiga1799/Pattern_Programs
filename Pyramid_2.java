package com.task;

import java.util.Scanner;

public class Pyramid_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number :");
		int no = sc.nextInt();

		for (int i = no; i >= 1; i--) { // rows only

			for (int k = i; k <= no; k++) { // space only
				System.out.print(" ");

			}

			for (int j = 1; j <= i; j++) { // char print
				System.out.print(i + " ");
			}
			System.out.println();

		}

	}
}

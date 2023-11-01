package com.task;

import java.util.Scanner;

public class Pyramid_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number :");
		int no = sc.nextInt();

		for (int i = 1; i <= no; i++) { // rows only

			for (int k = no - i; k >= 1; k--) { // space only
				System.out.print(" ");

			}

			for (int j = 1; j <= i; j++) { // char print
				System.out.print(i + " ");
			}
			System.out.println();

		}

	}
}

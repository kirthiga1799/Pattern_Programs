package com.task;

import java.util.Scanner;

public class Pyramid_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number :");
		int no = sc.nextInt();
		for (int i = 1; i <= no; i++) {

			for (int k = no - i; k >= 1; k--) {
				System.out.print("  ");

			}

			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");

			}

			for (int l = i - 1; l >= 1; l--) {
				System.out.print(l + " ");
			}
			System.out.println();

		}
	}
}

package com.task;

import java.util.Scanner;

public class Pattern_8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number : ");
		int no = sc.nextInt();

		System.out.println("Enter the symbol : ");
		char ch = sc.next().charAt(0);

		for (int i = 1; i <= no; i++) {

			for (int j = 1; j <= no; j++) {
				if (j == no || i + j == no + 1) {
					System.out.print(ch);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for (int i = no-1; i >= 1; i--) {

			for (int j = 1; j <= no; j++) {
				if (j == no || i + j == no + 1) {
					System.out.print(ch);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}

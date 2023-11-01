package com.task;

import java.util.Scanner;

public class Pyramid_6 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number :");
		int no = sc.nextInt();
		System.out.println("Enter the character: ");
		char ch = sc.next().charAt(0);
		
		
		for (int i = 1; i <= no; i++) {          //rows only

			for (int k = no - i; k >= 1; k--) {     //space only
				System.out.print(" ");

			}

			for (int j = 1; j <= i; j++) {           //char print 
				System.out.print(ch + " ");
			}
			System.out.println();

		}

}
}


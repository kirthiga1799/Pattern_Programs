package com.task;

import java.util.Scanner;

public class Pyramid_4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number :");
		int no = sc.nextInt();
		
		
		for (int i = no; i>=1; i--) {

			
			for (int k = 1; k <i; k++) {
				System.out.print("  ");

			}	

			for (int j = i; j <= no; j++) {
				System.out.print(j+ " ");
				
			}

			for (int l = no-1; l >= i; l--) {
				System.out.print(l + " ");
			}
			System.out.println();

		}

		
	}

}

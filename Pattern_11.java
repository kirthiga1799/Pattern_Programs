package com.task;

import java.util.Scanner;

public class Pattern_11 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number :");
		int no = sc.nextInt();
		System.out.println("Enter the character: ");
		char ch = sc.next().charAt(0);
		
		
		for(int i=1;i<=no;i++) {
			for(int j=1;j<=no;j++) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
		
		
	}
}

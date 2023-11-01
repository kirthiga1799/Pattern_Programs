package com.task;

import java.util.Scanner;

public class Pyramid_3 {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the number :");
	int no = sc.nextInt();
	System.out.println("Enter the character: ");
	char ch = sc.next().charAt(0);
	
	for (int i = no; i >=1; i--) {          

		for (int k = i; k <= no; k++) {     
			System.out.print(" ");

		}

		for (int j = 1; j <= i; j++) {           
			System.out.print(ch + " ");
		}
		System.out.println();

	}

}
}

package com.task;

import java.util.Scanner;

public class Pattern_2 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number : ");
		int no = sc.nextInt(); 
		
		System.out.println("Enter the symbol : ");
		char ch = sc.next().charAt(0);
		
		
		for(int i=no;i>=1;i--) {
			
			for(int j=1;j<=no;j++) {
				if(j==1 || i == j || i == no) {
					System.out.print(ch);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		 
	}

}

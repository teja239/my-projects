package com.teja.problem1_1;

import java.util.Scanner;

public class ListofEvenNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}
}

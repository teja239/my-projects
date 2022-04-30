package com.teja.problem2_2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int a=sc.nextInt();
		System.out.println("Enter Second Number: ");
		int b=sc.nextInt();
		
		System.out.print (a+" "+b+" ");
		int c;
		
		
		for(int i=1;i<=13;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
			
		}
		
	}

}

package com.teja.problem2_1;

import java.util.Scanner;

public class UsingString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		String rev=str;
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		StringBuffer sb=new StringBuffer();
		sb.append(rev);
		sb.reverse();
		if(str.contentEquals(sb)){
			System.out.println("Sting "+str+" is a Palindrome.");
		}else {
			System.out.println("Sting "+str+" is Not a Palindrome.");
		}
	}

}

package com.teja.problem1_2;

import java.util.Scanner;

public class TestRectangle {
	
	
	public static int length;
	public static int breadth;
	public static int area;
	
	public static void main(String[] args) {
		TestRectangle rect=new TestRectangle();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length and Breadth of the rectangle");
		rect.length=sc.nextInt();
		rect.breadth=sc.nextInt();
		rect.area=length*breadth;
		System.out.println("Area of Rectanle is :"+rect.area);
		
		
	}

}

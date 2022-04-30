package com.teja.problem6_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListOfStudents {
	
	public static void main(String[] args) {
		ArrayList<String> students=new ArrayList<>();
		int n ;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no of Students do you want to add: ");
		n=sc.nextInt();
		System.out.println("Enter the Name of Students : ");
		for(int i=0 ;i<=n;i++)
		{
			students.add(sc.nextLine()) ;
		}
		System.out.println("List of Students are  :");
		for (String a:students)
		{
			System.out.println(a);
		}
		System.out.println(" Enter the name of student to be searched : ");
		String str =sc.next();
		int position = Collections.binarySearch(students, str);
		System.out.println(" Position of "+ str + " is : "+position );
	}

}

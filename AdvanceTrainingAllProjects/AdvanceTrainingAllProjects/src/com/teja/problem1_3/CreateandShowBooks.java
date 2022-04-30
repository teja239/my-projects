package com.teja.problem1_3;

import java.util.Scanner;

public class CreateandShowBooks {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Book Name: ");
		String book_title=sc.nextLine();
		System.out.println("Enter Book Price: ");
		int book_price=sc.nextInt();
		
		Book book=new Book();
		book.setBook_title(book_title);
		book.setBook_price(book_price);
		System.out.println("Book Details are:");
		System.out.println("Book Name :"+book.getBook_title());
		System.out.println("Book Price :"+book.getBook_price());
	
	}

}

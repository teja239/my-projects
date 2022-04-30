package com.teja.problem5_1;

public class HandlingwithString {
	public static void main(String[] args) {
		String str="JAVA is Simple";
		
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		String[] words=str.split("\\s");	//1st words of letter
		for(String w:words){  
			System.out.print(w.charAt(0)); 
			System.out.print(" ");
		}
		System.out.println(" ");
		String[] words1=str.split("\\s"); // Change order 
		for(String w:words1){  
			System.out.println(w); 
		}
		StringBuilder sb=new StringBuilder();
		sb.append(str);
		sb.reverse();
		System.out.println(sb);
		
		str.replace(str, "JavaisSimple");
		
		System.out.println(str.length());
	}

}

package com.teja.problem2_2;



public class IntegerArray {
	public static void main(String[] args) {
		int A[]={3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};
		int larg=A[0];
		int sum=0,avg=0;
		
		
		for (int i=0;i<14;i++) {
			sum=sum+A[i];
			avg=sum/2;
			if(larg>A[i]) {
				larg=A[i];
			}			
		}
		A[15]=sum;
		A[16]=avg;
		A[17]=larg;
		for(int v:A) {
			System.out.print(" "+v);
		}
	}

}

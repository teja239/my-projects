package com.teja.problem5_3;


public class RotateString {
	

	
	static String leftrotate(String str, int d)
    {
            String ans = str.substring(d) + str.substring(0, d);
            return ans;
    }
	public static void main(String args[])
    {
		int j=0;
            String str1 = "MPHASIS";
            for(int i=0;i<=str1.length();i++) {
            System.out.println(leftrotate(str1, j));
            j++;
            }
            
    }
	
	
}
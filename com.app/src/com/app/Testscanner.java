package com.app;
import java.util.*;
public class Testscanner {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any name");
		String name = sc.next();
		//Aditya
		
		int length = name.length();
		System.out.println(length);
		
		for(int i = length-1; i >=0; i--)
		{
			char ch = name.charAt(i);
			
			System.out.println(ch);
		}
	

	}

}

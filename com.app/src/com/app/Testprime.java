package com.app;

import java.util.Scanner;

public class Testprime {
	public static void main(String[] args) {
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		
		int num = sc.nextInt();
		int count=0;
		for(int i=2; i<=num; i++) {
			if(num%i==0) {
				count++;
				
			}
		}
		if (count >1) {
			System.out.println(num+"is not prime");
			
		}else {
			System.out.println(num+"is prime");
		}
		}
		while(true);
	
	}
}

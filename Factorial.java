package com.java;

import java.util.Scanner;

public class Factorial {
	  int n;
	 long factorial=1;
	void display()
	{
		/*
		 * if(n==0) { System.out.println("The factorial is 1"); } else {
		 */
		for(int i=1;i<=n;i++)
		{
			factorial=factorial*i;
		}
	}
	public static void main(String args[]) {
		System.out.println("This is factorial programming..");
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		Factorial sss=new Factorial();
		sss.n=s.nextInt();
		sss.display();
		System.out.println("The factorial is\n" +sss.factorial);
	
	}

}

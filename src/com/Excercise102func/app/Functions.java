package com.Excercise102func.app;

import java.util.Scanner;

public class Functions {

	public static void main(String[] args) 
	{
		// variable
		long factorial=1;
		int number=-1;
		//object
		Scanner input=new Scanner(System.in);
		do
		{
			System.out.println("input number to factor:");
			number=input.nextInt();
			if(number<=0)
			{
				System.out.println("you must inpput a positive value");
			}
		} while (number<0);
		
		factorial = GiveFactorial(number);
		
		System.out.println("the facorial of"+number+"is:"+factorial+"wich is gotten by multiplying several times"+number);

	
		
	}
	public static long GiveFactorial(int n)
	{
		int factorial=1;
		for(int i=1;i<n;i++)
		{
			factorial=factorial+i;
		
		}
		return factorial;
	}

}

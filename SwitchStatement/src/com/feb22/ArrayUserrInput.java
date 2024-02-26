package com.feb22;

import java.util.Scanner;

public class ArrayUserrInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter Elements of array");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("array Elemnts:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}

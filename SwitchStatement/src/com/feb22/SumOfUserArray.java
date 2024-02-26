package com.feb22;

import java.util.Scanner;

public class SumOfUserArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner("System.in");
		
	System.out.println("Enter sum of array");
		
		
		int []arr=new int[] {};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println("The sum of array element is:"+sum);
	}
}
		
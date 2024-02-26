package com.feb22;

public class SumOfArray {

	public static void main(String[] args) {
		int[]arr=new int[] {1,5,6,9,8,4};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println("The sum of array element is:"+sum);

	}

}

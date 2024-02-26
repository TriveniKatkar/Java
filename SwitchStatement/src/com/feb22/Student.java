package com.feb22;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		System.out.println("Student Information Management:");
		int choice=0;
		do
		{
			System.out.println("1.Student Information:");
			System.out.println("2.Student Course Ratings:");
			System.out.println("3.Student Eligibility:");
			System.out.println("4.Exit:");
			Scanner sc=new Scanner(System.in);
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Student name:");
				
				String name=sc.next();
				System.out.println("Student Name:"+name);
				
				System.out.println("Student age");
				int age=sc.nextInt();
				System.out.println("Student Age:"+age);
				
				System.out.println("Student address:");
		        String address=sc.next();
				System.out.println("Student address:"+address);
				break;
				
			case 2:
                 System.out.println("Student Course Rating:");
			     double rating=sc.nextDouble();
			     
			     if(rating>=4)
			     {
			    	 System.out.println("Good Performance");
			     }
			     else
			     {
			    	 System.out.println("Need to improve");
			     }
			 
				break;
				
			case 3:
				System.out.println("Student Eligibility Criteria:");
				int s=sc.nextInt();
				if(s>=50)
				{
					System.out.println("Eligible for Interview");
				}
				else
				{
					System.out.println("Not Eligible");
				}
				break;
				
			case 4:
				System.out.println("Bye....bye");
				break;
				default:
					System.out.println();
					}
		}while(choice!=4);
		}
	}
		
		
		
		
	


		
		
	



	



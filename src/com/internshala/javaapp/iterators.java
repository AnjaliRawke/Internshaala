package com.internshala.javaapp;

import java.util.Scanner;

public class iterators {
	public static void main(String[] args) {

		//WAP to find odd num between 1 to 4   //1 ,2 ,3 ,4
//
//		int number =1;
//		if(number%2 != 0)
//			System.out.println(number);
//
//		number++;
//		if(number%2 != 0)
//			System.out.println(number);
//
//		number++;
//		if(number%2 != 0)
//			System.out.println(number);
//
//		number++;
//		if(number%2 != 0)
//			System.out.println(number);

		//syntax for loop
		//for(counter variable ; condition ; increment/decrement of counter )

//		for(int num=1;num<=4;num++){
//			if(num%2 != 0)
//				System.out.println(num);
//		}

//		for(int i=0;i<3;i++) {
//
//			System.out.println("i");
//		}

		//syntax of while loop and basic example
		//counter variable
		//while(condition){
		//your code
		//inc/dec counter variable
		// }

		//wap to print out natural numbers till 10

//		int naturalNum=0;
//		while(naturalNum<=10){
//			System.out.println(naturalNum);
//			naturalNum++;
//		}

		//wap to find factorial of a number
		//ex: fact of 5=5*4*3*2*1=120;

//		int num=5;
//		long fact=1;
//		while(num>0){
//			//System.out.println(num);
//			fact *=num;//fact=fact*num;
//			num--;
//		}
//		System.out.println("factorial of 5: "+fact);

		//syntax of do while loop and basic example

		//counter variable
		//do{
		//your code
		//inc/dec counter of variable
		//}while(condition);

		//wap to print natural numbers till 10

//		int naturalNum=0;
//		do{
//			System.out.println(naturalNum);
//			naturalNum++;
//		}while(naturalNum<=10);

		//wap to add numbers untill the user enters zero
//		Scanner scanner = new Scanner(System.in);
//        double number=0;
//		double sum=0;
//		do{
//			System.out.println("Enter the number: ");
//			number=scanner.nextDouble();
//			sum += number;
//		}while( number != 0);
//		System.out.println(sum);

		//prime or not using for loop

//		Scanner scanner = new Scanner(System.in);

		// Using For Loop

//		int flag = 0;
//
//		System.out.println("Enter a number: ");
//		int num = scanner.nextInt();
//		if(num == 0){
//			System.out.println("Not prime");
//			System.exit(0);
//		}
//		for(int i = 2; i < num; i++){
//			if( num % i == 0) {
//				System.out.println(num + " is not prime");
//				flag = 1;
//				break;
//			}
//		}
//
//		if(flag == 0)
//			System.out.println(num + " is prime");

		// Using While Loop
//         Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		int number = scanner.nextInt();
//		if(number == 0) {
//			System.out.println("Not prime");
//		}
//
//			int counterFlag = 0;
//			int i = 2;
//
//			while (i < number) {
//
//				if( number % i == 0) {
//					System.out.println(number + " is not prime");
//					counterFlag = 1;
//					break;
//				}
//				i++;
//			}
//
//			if(counterFlag == 0)
//				System.out.println(number + " is prime");
//
//			scanner.close();


		//Array
		//index                0  1  2   3  4
//		int[] myFirstArray = { 20,3,564,757,3};
//
//		myFirstArray[2]=37;
//		System.out.println(myFirstArray[2]);
//
//		//to print length of array
//		System.out.println(myFirstArray.length);
//
//		//to print every element of array
//		//sum
//		int sum=0;
//		for(int i=0;i< myFirstArray.length;i++)
//		{
//			sum += myFirstArray[i];
//			System.out.println(myFirstArray[i]);
//		}
//		System.out.println(sum);
//      	float[] mySecondArray = new float[3];
//		mySecondArray[0]=3.4f;
//		mySecondArray[1]=5.66f;
//		mySecondArray[2]=33.54f;

//		float sum=0;
//		for(int i=0;i< mySecondArray.length;i++)
//		{
//			sum += mySecondArray[i];
//			System.out.println(mySecondArray[i]);
//		}
//		System.out.println(sum);
//		float sum=0;
//		for(float num:mySecondArray){  //for Each loop
//			sum += num;
//			System.out.println(num);
//		}
//		System.out.println(sum);

		// Define a double array and use For Each loop to find the sum of all the numbers stored in the array.
//		double[] arr = {3.3, 4.7, 6.5, 7.5, 10.0};
//		double sum = 0;
//
//		for (double i:arr) {
//			sum += i;
//		}
//		System.out.println(sum);

		//2d array: is a collection of 1d array

//		int[] myFirstArray= {1,2,5,7};
//		int[] mySecondArray= {12,18,27,46};
//		int[] myThirdArray= {5,6,3,12,34};
//		int[] myFourthArray= {5,76,32,12};

//		int[][] myFirst2dArray={{1,2,5,7},
//				                {12,18,27,46} ,
//				                {5,6,3,12,34},
//				                {5,76,32,12}
//		                       };
//        for(int row=0;row<myFirst2dArray.length;row++ )
//        {
//			for(int column=0;column<myFirst2dArray[row].length;column++)
//			{
//				System.out.print(myFirst2dArray[row][column] +" ");
//			}
//	        System.out.println();
//        }

		//String Handling

		//index      0   1   2   3   4   5   6      //length of 7
//		char[] arr={'w','e','l','c','o','m','e'};
//
//		//using literals to create string
//		String firstString = "welcome";  //sequence of characters
//		String secondString="welcome";
//
//		//using new keyword
//		String thirdString= new String("welcome");
//
//		System.out.println(firstString == secondString ); //comparing two objects
//		System.out.println( firstString == thirdString ); //comparing two objects
//		System.out.println(firstString.equals(thirdString)); //using .equals methods
//		                                                     //comoare two values thatswhy returned true
//
//
//		System.out.println(arr.length);  //length constant variable
//		System.out.println(firstString.length()); //length method
//
//		System.out.println(firstString.charAt(2)); //to access particular element of string
//
//		System.out.println(firstString.toUpperCase()); //to make capital
//		System.out.println(firstString.toLowerCase()); //to make small
//
//		System.out.println(firstString.contains("hello"));
//
//		System.out.println(firstString+ " to internshala");
//
//		System.out.println(firstString.concat(" to internshala"));

//
//		String myString = "        Welcome      ";
//		System.out.println(myString.equalsIgnoreCase("WeLCOme")); //to compare two strings
//		                                                                     // irrespective of their cases
//	    System.out.println(myString);
//
//		String str = "";
//       //To check if a String is empty or not, use str.isEmpty()
//		System.out.println(str.isEmpty()); // returns true
//
//		System.out.println(myString.indexOf('c')); //to get index of character
//
//		System.out.println(myString.trim()); //to remove spaces in start or end of string

		String str= "you are geek!";

		System.out.println(str.charAt(8));


	}


	}


package com.internshala.javaapp;

public class methods {

	public static void main(String[] args) {

		//method body
//		sayName();
//
//		return;
//	}
//	public static void sayName(){
//			System.out.println("hello");

		/*wap to calculate simple interest SI=P*R*T/100
		user 1: principal=10000,rateofinterest=8.7%,timeperiod=2years;
		 */
//
//		int principal1 = 10000;
//		float rateOfInterest1 = 8.7f;
//		int timePeriod1 = 2;
//
//		double SI1 = principal1 * rateOfInterest1 * timePeriod1 / 100;
//		System.out.println(SI1);
//
//		//user2: principal=130000.rateofinterest=10.5,timeperiod=4years;
//
//		int principal2 = 130000;
//		float rateOfInterest2 = 10.5f;
//		int timePeriod2 = 4;
//
//		double SI2 = principal2 * rateOfInterest2 * timePeriod2 / 100;
//		System.out.println(SI2);

		//write using method
//
//		double si1=calculateSimpleInterest(10000,8.7f,2);
//		System.out.println(si1);
//
//		//user2: principal=130000.rateofinterest=10.5,timeperiod=4years;
//
//		double si2=calculateSimpleInterest(130000,10.5f,4);
//		System.out.println(si2);
//
//		double si3=calculateSimpleInterest(350000,5.9f,6);
//		System.out.println(si3);
//
//	}
//	public static double calculateSimpleInterest(int principal, float rateOfInterest, int timePeriod){
//		double SI = principal * rateOfInterest * timePeriod / 100;
//		return SI;

		//method overloading :same method name different method parameter
         add();   //method1

		 add(50,30);  //method2

		add(5.5f,5.5f);
       }

	   public static void add(){  //method1
		int sum=5+7;
		   System.out.println(sum);
       }
       public static void add(int a, int b){   //method2
		int sum=a+b;
	       System.out.println(sum);
	   }
	   public static void add(float a, float b){
		float sum=a+b;
		   System.out.println(sum);
	   }

	}




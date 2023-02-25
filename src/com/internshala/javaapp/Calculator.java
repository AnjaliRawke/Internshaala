package com.internshala.javaapp;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {

        	int  sum1 =Adition(23,12);
			System.out.println(sum1);


			int sum2 = Adition(23,0);
			System.out.println(sum2);


			int sub1 = Subtraction(23,12);
			System.out.println(sub1);


			int sub2 = Subtraction(23,0);
			System.out.println(sub2);


			int mul1 = Multiplication(23,12);
			System.out.println(mul1);


			int mul2 = Multiplication(23,0);
			System.out.println(mul2);


			int div1 = Divison(23,12);
			try {
				int div2 = Divison(23, 0);
			}catch (ArithmeticException exception){
				System.out.println("Divide by 0 is not allowed");
			}
		}
		public static int Adition(int a, int b) {
			return a + b;
		}
		public static int Subtraction(int c, int d) {
			return c - d;
		}
		public static int Multiplication(int e, int f) {
			return e * f;
		}
		public static int Divison(int g,int h) {
			return g/h;
		}
	}






package com.internshala.javaapp;

import java.util.Scanner;

public class Swap {
	public static void main(String args[]) {


		//Scanner sc = new Scanner(System.in);
		String a = "Harry";
		String b = "Drake";
		System.out.println("a= "+a+"\nb= "+b);
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("new String \na= "+a+"\nb="+b);
	}
}

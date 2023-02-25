package com.internshala.javaapp;

public class Dog {
	public String breed;
	public int size;
	public String color;

	public Dog(){   //default Constructor
		System.out.println("Default Constructor triggered");
	}
	public Dog(String b , int s , String c ){  //Parametrized Constructor
		breed=b;
		size=s;
		color=c;
	}

	public void bark()
	{
		System.out.println("Wooh!  Wooh!  ");
	}
	public void run()
	{
		System.out.println("My breed Name is: " + breed + " I am running.");
	}

	//getter and setter for dog class instance variables


//	public String getBreed()
//	{
//		return breed;
//	}
//
//	public void setBreed(String breed)
//	{
//		this.breed = breed;
//	}
//
//	public int getSize()
//	{
//		return size;
//	}
//
//	public void setSize(int size)
//	{
//		this.size = size;
//	}
//
//	public String getColor()
//	{
//		return color;
//	}
//
//	public void setColor(String color)
//	{
//		this.color = color;
//	}
}

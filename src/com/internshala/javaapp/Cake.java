package com.internshala.javaapp;

public class Cake {
	public String cakeName;
	public int price;
	public String flavour;
	public boolean isAvailable;

	public void Display(){
		cakeName="Birthday Cake";
		price=300;
		flavour="Chocolate";
		isAvailable=true;

		System.out.println(cakeName);
		System.out.println("price: " + price);
		System.out.println("flavour: " + flavour);
		System.out.println("Yes ! It Is Available " + isAvailable);
	}
}

package com.internshala.javaapp;

public class hi {
	public static void main(String[] args) {
		car car1 = new car();
		car1.increment();
		System.out.println(car1.x);
	}
}

class car{
	int x= 0;
	void increment(){
		x++;
		x++;
	}

}

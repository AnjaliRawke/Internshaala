package com.internshala.javaapp;

public class ClassAndObject {
	public static void main(String[] args) {
        //dog1
//		Dog dog1=new Dog();
//		dog1.breed="German shepherd";
//		dog1.size=50;
//		dog1.color="Black";
//
//		System.out.println(dog1.breed);
//		System.out.println(dog1.size);
//		System.out.println(dog1.color);

//		dog1.bark();
//		dog1.run();

//		System.out.println("---------------------------------------------");
//		//dog2
//		Dog dog2 = new Dog();
//		dog2.breed="Labrador";
//		dog2.size=40;
//		dog2.color="brown";
//
//		System.out.println(dog2.breed);
//		System.out.println(dog2.size);
//		System.out.println(dog2.color);
//
//		dog2.bark();
//		dog2.run();

//		Dog dog3 = new Dog();
//		dog3.breed="Pug";
//		dog3.size=30;
//		dog3.color="Brown";
//		dog3.bark();
//		dog3.run();
//
//		Dog dog4 = new Dog("Golden Retriver" , 55 , "Golden");
//		System.out.println(dog4.breed);
//		System.out.println(dog4.size);
//		System.out.println(dog4.color);
////
//		System.out.println("---------------------------------------------");
		//Rectangle
		Rectangle rect1=new Rectangle();  //default constructor called
		rect1.length=8.7f;
		rect1.breadth=12.9f;

		Rectangle rect2 = new Rectangle(20.4f,18.2f);
		System.out.println(rect2.length);
		System.out.println(rect2.breadth);

		System.out.println("Length of the rectangle is: " + rect1.length);
		System.out.println("Breadth of the rectangle is: " + rect1.breadth);

		System.out.println(rect1.getArea());
		System.out.println(rect1.getPerimeter());

		//cake
//		Cake cake1=new Cake();
//		cake1.cakeName="Birthday Cake";
//		cake1.price=300;
//		cake1.flavour="Chocolate";
//		cake1.isAvailable=true;
//
//		System.out.println(cake1.cakeName);
//		System.out.println(cake1.price);
//		System.out.println(cake1.flavour);
//		System.out.println("Yes ! It Is Available " + cake1.isAvailable);

//		cake1.Display();

		Rectangle r1 = new Rectangle();
		r1.setLength(2.43f);
		r1.setBreadth(3.67f);

		System.out.println(r1.getLength());
		System.out.println(r1.getBreadth());

//		Dog dog1 = new Dog();
//
//		dog1.setBreed("Pomerian");
//		dog1.setSize(50);
//		dog1.setColor("White");
//
//		System.out.println(dog1.getBreed());
//		System.out.println(dog1.getSize());
//		System.out.println(dog1.getColor());





	}
}


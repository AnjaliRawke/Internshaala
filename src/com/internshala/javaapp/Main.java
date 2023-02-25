package com.internshala.javaapp;



public class Main {
	public static void main(String[] args) {

		Remote remote = new Television();
		remote.powerOn();
		remote.volumeUp();
		remote.volumeDown();
		remote.powerOff();

		//new Animal();  //not allowed cannot create objects of abstract class

		/*Parent class->Reference Varibale */
//		Animal animal = new Cat(); /* Child class->object*/
		//allowed.you can create the reference variable of abstract class
//		animal.run();
//		animal.eat();

////    //Note: Always use getter and setter.this is a sample code meant to explain inheritance concept.
////		cat obj2 = new cat();
////		obj2.name="persian";
////		obj2.pattern="tabby";
////		obj2.meow();
////		obj2.run();
////		System.out.println("--------------------------------------");
////		lion obj3 = new lion();
////		obj3.name="Panthera LEO";
////		obj3.size=150;
////		obj3.Roar();
////		obj3.run();
////		System.out.println("--------------------------------------------");
////		bird obj4 = new bird();
////		obj4.voice();
////		obj4.name="Koyal";
////		obj4.run();
////		System.out.println("------------------------------------------------");
////		bees obj5 = new bees();
////		obj5.name="Humming Bird";
////		obj5.Buzz();
////		obj5.run();
//
////		cat cat1 = new cat();
////		cat1.run();
//
//		Animal animal1 = new Animal();  //animal1->A(object)
//		animal1.run();   //animal is running
//		Animal animal2 = new cat();  //animal2->D(object of dog)  //UPCASTING
//		animal2.run();  //dog is running
//
//		//child class!-->Parent class object
//		cat cat1 = (cat) new Animal();   //DOWNCASTING
//
//
//
//
//
//
//	}
//}
//
//class Animal{       //Parent class/Super-class
////	String name;
//
//	public void run(){
//		System.out.println("Animal is running");
//	}
//}
//
////class dog extends Animal{   //sub-class/Child class
////	String color;
////
////	public void bark(){
////		System.out.println("Wooh Wooh");
////	}
////}
//
//class cat extends Animal{    //sub-class/Child class
////	String pattern;
////
////	public void meow(){
////		System.out.println("Meow");
//   public void run()  //Method overriding
//   {
//
//	   System.out.println("Cat is Running");
//   }
//}
//
////
////class lion extends Animal{    //sub-class/Child class
////	int size;
////
////	public void Roar(){
////		System.out.println("Roaring Sound");
////	}
////}
////
////class bird extends Animal{   //sub-class/Child class
////	public void voice(){
////		System.out.println("kuuhuu !! kuuhuu !!");
////	}
////}
////
////class bees extends Animal{       //sub-class/Child class
////	public void Buzz(){
////		System.out.println("humm !! humm !!");

//interface  Animal
//{
//
//	abstract public void run();
//
//	abstract public void eat();  //Abstract Method
//}
//
//class Cat implements Animal
//{
//
//	@Override
//	public void run() {
//		System.out.println("Cat is running");
//	}
//
//	@Override
//	 public void eat()  //overriding method
//	{
//		System.out.println("Cat is eating");
	}
}

interface Remote
{
	 void volumeUp();
	 void volumeDown();
	 void powerOff();
	 void powerOn();
}

class Television implements Remote
{

	@Override
	public void volumeUp() {
		System.out.println("Volume Up");
	}

	@Override
	public void volumeDown() {
		System.out.println("Volume Down");
	}

	@Override
	public void powerOff() {
		System.out.println("Power Off");
	}

	@Override
	public void powerOn() {
		System.out.println("Power On");
	}
}



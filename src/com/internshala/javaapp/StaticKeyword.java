package com.internshala.javaapp;

public class StaticKeyword {
	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.name = "Rahul";
		Employee e2 = new Employee();
		e2.name = "Anjali";

		Employee.count=20;  //Class Variable
		System.out.println(Employee.count);

		System.out.println(Employee.company);  //cannot modify value since final

		Employee.myFirstStaticMethod();  //Class Method
	}
}

class Employee
{
 public String name;   // it will vary for each employee
 public static final String company = "Internshala";  //CONSTANT VALUE. it belongs to class not to an object
 public static  int count = 0;

 public static void myFirstStaticMethod()
 {
	 System.out.println("My First Static Method");
	 System.out.println(count);
	 test();
 }
public static void test(){

}
}

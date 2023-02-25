package com.internshala.javaapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionFramework
{
	public static void main(String[] args)
	{
		//ARRAYLIST
//		List<String> namesList=new ArrayList();
//		namesList.add("Sam");  //0
//		//namesList.add("Anjali");  //1
//		namesList.add("Rahul");  //2   //1
//		namesList.add("Tina");  //3    //2
//		namesList.add("Sam");  //4     //3
//
//		namesList.remove(1);  //remove the element "Anjali"
//
//		namesList.add(1,"Peter");  //Add "Peter" at index 1
//		namesList.set(1,"Rahul");  //replace element at index 1 by "Rahul"
//
//		namesList.remove("Tina");  // Remove object of "Tina"
//
//		System.out.println(namesList.get((2)));  //for getting particular element at particular index in arraylist
//
//		//for each
//		for(String name : namesList)
//		{
//			System.out.println(name);
//		}
//		employee1 e1 = new employee1("Albert");
//		employee1 e2 = new employee1("Parul");
//		employee1 e3 = new employee1("Kamal");
//
//		//Create ArrayList of employee and print out the names
//		List<employee1> employee1List = new ArrayList();
//		employee1List.add(e1);
//		employee1List.add(e2);
//		employee1List.add(e3);
//
//		for(employee1 employee : employee1List)
//		{
//			System.out.println(employee.name);
//		}

		Map<Integer,String> namesMap = new HashMap();
		namesMap.put(2,"Shashank");
		namesMap.put(43,"Rahul");
		namesMap.put(13,"Robert");
		namesMap.put(43,"New NAme");

//		String name1=namesMap.get(2);
//		String name2=namesMap.get(43);
//		String name3=namesMap.get(13);
//		System.out.println(name1);
//		System.out.println(name2);
//		System.out.println(name3);

		for(Map.Entry entry : namesMap.entrySet()){
		System.out.println(entry.getKey() + " " + entry.getValue());
	}

	}
}

//class employee1
//{
//	String name;
//
//	public employee1(String name) {
//		this.name = name;
//	}
//}

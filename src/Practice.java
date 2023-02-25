import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		System.out.println("----------FAMILY TREE------------");
		System.out.println("FATHER");
		System.out.println("-----------------------------------");
		Father member1 = new Father();
		System.out.println(member1.name="Pramod Rawke");
		System.out.println(member1.age=56);
		System.out.println(member1.occupation="Government Service");
		System.out.println("-------------------------------------------");

		System.out.println("MOTHER");
		System.out.println("-----------------------------------");

		Mother member2 = new Mother();
		System.out.println(member2.name = "Aruna Rawke");
		System.out.println(member2.age=51);
		System.out.println(member2.occupation="House Wife");
		System.out.println("-------------------------------------------");

		System.out.println("FIRST DAUGHTER");
		System.out.println("-----------------------------------");

		Daughter1 member3 = new Daughter1();
		System.out.println(member3.name="Pranjali Rawke");
		System.out.println(member3.age=26);
		System.out.println(member3.occupation="Software Engineer");
		System.out.println("-------------------------------------------");

		System.out.println("SECOND DAUGHTER");
		System.out.println("-----------------------------------");

		Daughter2 member4 = new Daughter2();
		System.out.println(member4.name="Anjali Rawke");
		System.out.println(member4.age=21);
		System.out.println(member4.occupation="Student");
	}
}

class Family{
	String name;
	int age;
	String occupation;
}

class Father extends  Family{

}

class Mother extends Family{

}

class Daughter1 extends  Family{

}

class Daughter2 extends  Family{

}
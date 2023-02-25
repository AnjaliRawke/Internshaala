package com.internshala.javaapp;

public class Demo {
	public static void main(String[] args) {


	System.out.println("Hello internshala");
//		System.out.println("Hello intershala again ");
//		System.out.println(80);
//		System.out.println(80+10);

//		//implicit Conversion
//		int radius=400;
//		long newRadius=radius;
//		System.out.println(newRadius);
//
//		//explicit Conversion
//		long diameter=38247565782L;
//		int newDiameter=(int)diameter;
//		System.out.println(newDiameter);

	//taking String input
//		String name;
//		int population;
//		float populationDensity;
//		double GDP;
//		char currency;
//		boolean isSecular;
//
//	 Scanner scanner=new Scanner(System.in);
//		System.out.println("Enter Your Country Name: ");
//	 name=scanner.nextLine();
//		System.out.println(name);
//
//		System.out.println("Enter Your Country population: ");
//		population=scanner.nextInt();
//		System.out.println(population);
//
//		System.out.println("Enter Your Country's population density: ");
//		populationDensity=scanner.nextFloat();
//		System.out.println(populationDensity);
//
//		System.out.println("Enter Your Country's GDP: ");
//		GDP=scanner.nextDouble();
//		System.out.println(GDP);
//
//		System.out.println("Enter Your Country's currency: ");
//		currency=scanner.next().charAt(0);
//		System.out.println(currency);
//
//		System.out.println("Country Name is: " + name);
//		System.out.println("population is: " + population);
//		System.out.println("population density is: " + populationDensity);
//		System.out.println("GDP is: " + GDP);
//		System.out.println("currency is: " + currency);
//		System.out.println();
//
//		scanner.close();

	//Arithmatic operator
//		int result=3+1-7*5%(3/2);  //left to right //[ * / % ]>[ + - ]
// System.out.println(result); //variables and operators in the bracket will get the highest priority

//		//relational operator
//		int x=2;
//		int y=3;
//		int z=3;
//
//		//greater than and greater than equal to
//		boolean r1= x > y;
//		boolean r2= y>=x;
//
//		//less than and less than equal to
//		boolean r3=x<y;
//		boolean r4=y<=x;
//
//		//is equal to and is not equal to
//		boolean r5= y==z;
//		boolean r6= z!=x;
//
//		System.out.println(r1);
//		System.out.println(r2);
//		System.out.println(r3);
//		System.out.println(r4);
//		System.out.println(r5);
//		System.out.println(r6);

//		//assignment operator
//		int income=30000;
//		int bonus=5000;
//
//		income=income+bonus;  // equivalent to: income += bonus
//		System.out.println(income);
//
//		//example2
//		int number=10;
//		int x=2;
//
//		//number*=x;  //equivalent to: number=number*x
//		number %= x;
//		System.out.println(number);

	//post-increment operator
//		int year=10;
//		int newYear= year++;  //newYear=year; == newYear=10
//		                      //year=year+1; ==  year=11
//		System.out.println(newYear);
//		System.out.println(year);
//
//		//pre-increment operator
//
//		int year1=10;
//		int newYear1= ++year1;  //year1=year1+1;  == year1=11;
//		                       //newYear1=year1; == newYear1=11;
//
//		System.out.println(year1);
//		System.out.println(newYear1);

	//post-decrement operator

//		int year =10;
//		int newYear= year--;   //newYear=year  ==  newYear=10
//		                       //year =year-1; == year=9
//
//		System.out.println(newYear);
//		System.out.println(year);
//
//		//pre-decrement operator
//
//		int year1= 10;
//		int newYear1= --year1;  //year1 =year1-1;  == year=9;
//		                        //newYear1=year1;  == newYear1=9
//
//		System.out.println(newYear1);
//		System.out.println(year1);

	//exmaple2
//		int num=8;
//		System.out.println(num++ - ++num + --num); //-2 + 9

	//logical operator  ! && ||

//		boolean x=4>3; // true
//		boolean y=5>100; // false
//		System.out.println(!(x || y));

	//IF-ELSE
//		boolean isSecular=false;
//
//		String message;
//		if(isSecular) {
//			message="India is a secular country";
//		}else{
//				message="India is not a secular country";
//			}
//		System.out.println(message);
//
//		//ternary operator   //condition? Exp1:Exp2
//
//		String msg = isSecular? "India is a secular country" : "India is not a secular country";
//		System.out.println(msg);

	//if else if ladder

	int score=97;
	char grade;
		if(score >= 90)
	{
		grade='A';
	}
		else if(score >=80){
		grade='B';
	} else if (score >=70) {
		grade='C';
	}else if(score >=60){
		grade='D';
	}else{
		grade='F';
	}
		System.out.println("Grade: " + grade);

	//Switch case
		switch(grade){
		case 'A':
			System.out.println("Excellent score");
			break;
		case 'B':
			System.out.println("Very Good Score");
			break;
		case 'C':
			System.out.println("Good Score. you can do better");
			break;
		case 'D':
			System.out.println("Average Score. Work Hard");
			break;
		case 'F':
			System.out.println("you have failed");
			break;
		default :
			System.out.println("Invalid Grade");

	}
}


}

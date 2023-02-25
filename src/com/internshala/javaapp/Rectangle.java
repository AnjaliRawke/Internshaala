package com.internshala.javaapp;

public class Rectangle {

	public float length;
	public float breadth;

	public Rectangle(){  //non-parametrized constructor or Default Constructor

		this(20.4f,18.3f);
	}
	public  Rectangle(float length , float breadth ){  //parametrized Constructor
		this.length=length;
		this.breadth=breadth;
	}

    public float getArea(){
		float area=length*breadth;
	    return area;
    }
    public float getPerimeter(){
        float perimeter=2*(length+breadth);
	    return  perimeter;

    }

	//Getter and Setter

    //getter for length
	public float getLength()
	{
		return length;
	}
    //setter for length
	public void setLength(float length)
	{
		this.length = length;
	}
    //getter for breadth
	public float getBreadth()
	{
		return breadth;
	}
    //setter for breadth
	public void setBreadth(float breadth)
	{
		this.breadth = breadth;
	}
}

package com.internshala.javaapp;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DigitalWatch {
	public static void main(String[] args) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println(formatter.format(date));

		boolean b2=false;

	}
}

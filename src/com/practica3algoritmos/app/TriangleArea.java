package com.practica3algoritmos.app;

import java.util.Scanner;

public class TriangleArea {
	public static void main(String[] args) {
		//Variables declaration
		double base = 0.0;
		double height = 0.0;
		double area = 0.0;
		
		//Objects declaration
		Scanner keywordInput;
		keywordInput = new Scanner(System.in);
		
		//Input from the user
		System.out.println("Write the base: ");
		base = keywordInput.nextDouble();
		System.out.println("Write de height: ");
		height = keywordInput.nextDouble();
		
		//Process
		area = (base * height) / 2;
		
		//Output
		System.out.println("The area is: " + area);
		
		//Closing of objects
		keywordInput.close();
	}
}

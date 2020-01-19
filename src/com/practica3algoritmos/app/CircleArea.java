package com.practica3algoritmos.app;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		
		//Constats declaration
		final double PI_NUMBER = 3.1416;
		
		//Variable declaration
		double radioCircle = 0.0;
		double areaCircle = 0.0;
		
		//Object declaration
		Scanner kInput;
		kInput = new Scanner(System.in);
		
		//Inputs
		System.out.println("Input the radio of the circle:");
		radioCircle = kInput.nextDouble();
		
		//Process
		areaCircle = (PI_NUMBER * (radioCircle * radioCircle));
		
		//Outputs
		System.out.println("The area of the circle is: " + areaCircle);
		
		
		//Termination
		kInput.close();
		
	}

}

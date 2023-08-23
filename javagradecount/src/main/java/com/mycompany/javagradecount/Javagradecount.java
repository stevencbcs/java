package com.mycompany.javagradecount;
import java.util.Scanner;

public class Javagradecount {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("how many grades: ");
		int amountOfGrades = sc.nextInt();

		String orderReference[] = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth and above"}; 		
		int listOfGrades[];
		listOfGrades = new int[amountOfGrades]; 	
		int sumOfGrades = 0;

		for (int i = 0; i < amountOfGrades; i++) {

			System.out.print(orderReference[i] + " grade: ");
			listOfGrades[i] = sc.nextInt();

		}	

		for (int i = 0; i < listOfGrades.length; i++) {

			sumOfGrades = sumOfGrades + listOfGrades[i];

		}

		System.out.println("your average: " + String.valueOf(sumOfGrades/(listOfGrades.length)));

    }
}

package com.mycompany.matrixedan;
import java.util.Scanner;

public class Matrixedan {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

		// declaration
		int[][] matrixFactor1 = {
			{0, 0},
			{0, 0}		
		};

		char[][] listOfFactors1= {
			{'a', 'b'},
			{'c', 'd'}		
		};

		int[][] matrixFactor2 = {
			{0, 0},
			{0, 0}		
		};

		char[][] listOfFactors2 = {
			{'x', 'y'},
			{'z', 'w'}		
		};

		// code mulai
		System.out.println("|a,b| |x,y|" + "\n" + "|c,d| |z,w|" + "\n" + "---");	

		for (int i = 0; i < matrixFactor1.length; i++) {
			for (int j = 0; j < matrixFactor1[0].length; j++) {
				System.out.print("What is " + listOfFactors1[i][j] + ": ");
				matrixFactor1[i][j] = sc.nextInt();
			}
		}	

		for (int i = 0; i < matrixFactor2.length; i++) {
			for (int j = 0; j < matrixFactor2[0].length; j++) {
				System.out.print("What is " + listOfFactors2[i][j] + ": ");
				matrixFactor2[i][j] = sc.nextInt();
			}
		}	

		System.out.println(matrixFactor1[0][0]);

		int a = matrixFactor1[0][0];
		int b = matrixFactor1[0][1];
		int c = matrixFactor1[1][0];
		int d = matrixFactor1[1][1];

		int x = matrixFactor2[0][0];
		int y = matrixFactor2[0][1];
		int z = matrixFactor2[1][0];
		int w = matrixFactor2[1][1];

		System.out.println("Result:");	
		System.out.println("|" + String.valueOf(a*x + b*z) + " " + String.valueOf(a*y + b*w) + "|");
		System.out.println("|" + String.valueOf(c*x + d*z) + " " + String.valueOf(c*y + d*w) + "|");

    }
}

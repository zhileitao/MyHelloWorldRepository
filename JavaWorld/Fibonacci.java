package com.nokia;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int numberOfFibonacci = 0;
		numberOfFibonacci = myScanner.nextInt();
		int preValue = 0, currentValue = 1, nextValue =0, i = 1;
		System.out.println("Fibonaaci numbers:");
		switch (numberOfFibonacci){
		case 0:
			break;
		case 1:
			System.out.println("1");
			break;
		case 2: 
			System.out.println("1 1");
			break;
		default:
			System.out.printf("1 ");
			while (i < numberOfFibonacci) {
				nextValue = preValue + currentValue;
				System.out.printf("%d ", nextValue);
				preValue = currentValue;
				currentValue = nextValue;
				i++;
			}	
			break;
		}
		
		if (numberOfFibonacci < 1) {
			System.out.println("Please input a positive number larger than 0");
		}
		
		int fArray[] = new int[numberOfFibonacci];
		switch (numberOfFibonacci) {
		case 1: 
			fArray[0] = 1;
			break;
		case 2:
			fArray[0] = 1;
			fArray[1] = 1;
			break;
		default:
			fArray[0] = 1;
			fArray[1] = 1;
			i = 3;
			while (i < numberOfFibonacci + 1) {
				fArray[i-1] = fArray[i-2] + fArray[i-3];
				i++;
			}
			break;
		}
		
		System.out.println("Fibonaaci in Array:");
		for (int j: fArray) {
			System.out.printf("%d ", j);
		}
	}

}

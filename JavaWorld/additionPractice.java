package com.nokia;

import java.io.IOException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("Today is " + new Date());
		Random myRandom = new Random();
		Scanner myScanner = new Scanner(System.in);
		int m = myRandom.nextInt(50)+1;
		int n = myRandom.nextInt(50)+1;
		int a = 0;
		for (int i=0; i<10; i++){
			// System.out.println("i=" + i);
			// System.out.println("m + n = " + m + "+" + n );
			m = myRandom.nextInt(50)+1;
			n = myRandom.nextInt(50)+1;
			System.out.printf("%d + %d = ", m, n);
			a = myScanner.nextInt();
			if (a == (m + n)) {
				System.out.println(m + "+" + n + "=" + a + "   Good!");
			}
			else {
				System.out.println(m + "+" + n + "=" + (m+n) + "But not " + a + "   Bad!");
			}
		}
	}

}

package com.cybage.main;

import java.util.Scanner;

import com.cybage.service.Lawn;

public class Lawntest {

	public static void main(String[] args) {
		Lawn L = new Lawn();
		final int lawnNumber = 6;
		double[] eachLawnsize = new double[lawnNumber + 1];
		System.out.println("------Welcome to lawn moveing service--------");
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i < lawnNumber + 1; i++) {
			System.out.println("Enter the size of lawn in square meters for lawn number= " + i);
			double temp = sc.nextDouble();
			if (temp > 0) {
				eachLawnsize[i] = temp;
				System.out.println("The weekly fee for lawn " + i + " is " + L.lawnMowing(eachLawnsize[i]));
			} else {
				System.out.println("please enter postive number");
				i--;

			}

			System.out.println("------------------------------------------");
		}
		sc.close();
		L.report(eachLawnsize, lawnNumber);
		System.out.println("----------Thank you for opting our Lawn moveing service--------------- ");

	}

}
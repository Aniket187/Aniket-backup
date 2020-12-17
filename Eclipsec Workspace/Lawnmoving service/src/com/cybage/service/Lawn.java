package com.cybage.service;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Lawn {

	double minLawn = 0;
	double maxLawn = 0;
	int totalServicecost = 0;
	Map<Double, Integer> serviceMap = new HashMap<Double, Integer>();


	public double lawnMowing(double area) {
		if (area < 501 && area > 0) {
			serviceMap.put(area, 40);
			return 40;
		}
		if (area > 500 && area < 901) {
			serviceMap.put(area, 60);
			return 60;
		}
		if (area > 900 && area < 1501) {
			serviceMap.put(area, 75);
			return 75;

		}
		if (area > 1500) {
			serviceMap.put(area, 100);
			return 100;
		}
		return 0;

	}

	public void report(double[] arr, int lawnNumber) {
		minLawn = Collections.min(serviceMap.keySet());
		maxLawn = Collections.max(serviceMap.keySet());
		System.out.println();
		for (Map.Entry<Double, Integer> rs : serviceMap.entrySet()) {
			totalServicecost = rs.getValue() + totalServicecost;
		}
		System.out.println("--------------Lawn moveing service report---------------");
		System.out.println("Heighest weekly lawn moveing fee:-" + serviceMap.get(maxLawn) + "$");
		System.out.println("Lowest weekly lawn moveing fee:- " + serviceMap.get(minLawn) + "$");
		System.out.println("Total weekly lawn moveing fee:- " + totalServicecost + "$");
		System.out.println("Average weekly lawning fee is " + (float)totalServicecost / lawnNumber  + "$");
		System.out.println("Lawn number with height monthly fee is " + lawnNumber(arr, maxLawn));

	}

	private int lawnNumber(double[] arr, double maxLawn2) {
		for (int i = 1; i < arr.length + 1; i++) {
			if (maxLawn2 == arr[i]) {
				return i;
			}
		}
		return 0;

	}
}

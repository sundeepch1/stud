package com.number;

public class FabonnaciSeriesWithRecusion {

	public static void main(String[] args) {
		int m=0;
//		for (int i = 0; i < 10; i++) {
//			System.out.print(printFabonaciSeries(m++) + "\t");
//		}
		System.out.print(printFabonaciSeries(4) + "\t");
	}

	private static int printFabonaciSeries(int n) {
			if(n==0 || n==1)
				return n;
			else
				return printFabonaciSeries(n-1) + printFabonaciSeries(n-2);
	}
}

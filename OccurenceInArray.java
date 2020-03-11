package com.array;

import java.util.*;

public class OccurenceInArray {

	public static void main(String x[]) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[6];
		int index, value;
		System.out.println("Enter the values");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("display the elements");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d\n", a[i]);
		}

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (j < i && a[i]== a[j]) {
					break;
				}  
				else if (a[i] == a[j]) {
					count++;
				}
			}
			if (count > 1) {
				System.out.printf("\n%d----->%d", a[i], count);
			}
		}
	}

}

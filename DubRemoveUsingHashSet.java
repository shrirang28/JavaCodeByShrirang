package com.array;

import java.util.HashSet;

public class DubRemoveUsingHashSet {

	public static void main(String[] args) {

		int arr[]= {1,2,4,3,5,2,5,6};
		
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0; i<arr.length; i++)
		{
			hs.add(arr[i]);
		}
		
		for(int no: hs)
		{
			System.out.print(no+" ");
		}
		
	}

}

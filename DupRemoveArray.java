package com.array;
import java.util.*;
public class DupRemoveArray {

	public static void main(String[] args) {
		int a[]=new int[10];
		int size=a.length;
		for(int i=0; i<a.length; i++)
		{
		  for(int j=i+1; j<a.length; j++)	
		  {
			if(a[i] == a[j])
			{
				for(int k=j; k<size; k++)
				{
					a[k]=a[k+1];
					size--;
				}
			}
		  }
		}	
		System.out.println("Display");
		for(int i=0; i<size; i++)
		{
			System.out.println(a[i]);
		}
	}

}

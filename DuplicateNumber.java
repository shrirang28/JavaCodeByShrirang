package com.array;

// WAP Using Brute Force Method
public class DuplicateNumber {

	public void duplicate(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j] && (i!=j))
				{
					System.out.println(arr[i]);
				}
			}
			
		}
		
	}
		
	public static void main(String[] args) {
 
		int arr[]= {1,2,3,2,1,4,5,3};
		
		System.out.println("\nDublicate Element is ");
		DuplicateNumber dc=new DuplicateNumber();
		dc.duplicate(arr);
		
	}

}

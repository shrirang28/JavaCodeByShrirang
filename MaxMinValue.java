package com.array;

public class MaxMinValue {
	
	public void max(int a[])
	{
		int mx=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(mx < a[i])
			{
				mx = a[i];
			}
		}
		System.out.println("Max Number is "+mx);
	}
	
	public void min(int b[])
	{
		int mn=b[0];
		for(int i=0; i<b.length; i++)
		{
			if(mn > b[i])
			{
				mn = b[i];
			}
		}
		System.out.println("Min Number is "+mn);	
		
	}

	public static void main(String[] args) {

		int a[]= {55,11,12,43,12,65,33,1,85,3,25};
		
		MaxMinValue mn=new MaxMinValue();
		
		mn.max(a);
		mn.min(a);
		
	}

}

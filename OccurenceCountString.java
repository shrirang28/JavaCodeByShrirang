package com.array;

public class OccurenceCountString {
	
	public static void main(String x[])
	{
	 String str="aabcdabafsfsdfcvbaafddffcxsdzertrd";
	 char[] ch=str.toCharArray();
	   
	 boolean visit[]=new boolean[str.length()];
	   
	   for(int i=0; i<str.length(); i++)
	   {
		   int count=0;
		   for(int j=0; j<str.length(); j++)
		   {
			 if(ch[i]==ch[j] && !visit[j])
			 {
				 visit[j] = true;
				 count++;
			 }
		   }
		   
		   if(count>1)
		   {
			   System.out.println(ch[i]+" "+count);
			   
		   }
	   } 

   }
}

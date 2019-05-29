package org.sel;

public class Arraybasedonindex 
{
	
	public static void main(String[] args) 
	{
		int num[]=new int[5];
		 
		 num[3]=50;
         num[0]=10;
		 num[1]=60;
		 num[4]=90;
		 num[2]=80;

		 
		 int len = num.length;
		 
	for(int i=0;i<len;i++)
	{
		System.out.println(num[i]);
	}
	
	}
	}

package Array;
import java.util.Scanner;
public class Charprinting 
{
	public void convertcase(char a[])
	{
		for (int i=0;i<=a.length-1;i++)
		{
			if(a[i]>='A' && a[i]<='Z')
				System.out.print((char)(a[i]+32)+ " ");
			else if(a[i]>='a' && a[i]<='z')
				System.out.print((char)(a[i]-32)+ " ");
			else
				System.out.print("no any alphabet ");
		}
	}
	public static void main(String args[]) 
	{
		char a[]= {'m','A','y','U','R','i','0'};
		new Charprinting().convertcase(a);
	}
	  
}
package String;
import java.lang.String;
import java.util.Scanner;

public class Occuranceofchar 
{
	public static void main(String[]args)
	{
		int cnt=0;
		
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter a string: ");  
		String str= sc.nextLine();             
		
		
		for(char ch='a'; ch<='z';ch++)
		{	
		for (int i = 0; i < str.length(); i++)  
	    { 
	        if (ch==str.charAt(i)) 
	        { 
	            cnt++;
	           // System.out.println("occurance of a="+cnt);
	        }
	        if(cnt!=0)
	        	System.out.println(ch+" "+cnt);       
	    }
		}
		 
	}
}
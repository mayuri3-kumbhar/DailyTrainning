package String;
import java.lang.String;
import java.util.Scanner;

public class Addingorly {
	public static void main(String[]args)
	{
		
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter a string: ");  
		String str= sc.nextLine();             
		System.out.println(str); 
		String s="";
		
		for(int i=0;i<=str.length();i++)
		{
			if(str.length()<=3)
				{
					s=str+"ing";	
				}
			//else(str.endsWith("ing"))
				{
				s=str+"ly";
				}
		}
		System.out.print("new string="+s);
		
		
	
	}
}

package String;
import java.lang.String;
import java.util.Scanner;

public class ConcateString {
	public static void main(String[]args)
	{
	Scanner sc= new Scanner(System.in); 
	System.out.print("Enter a string: ");  
	String str= sc.nextLine(); 
	System.out.print("Enter 2nd  string: ");  
	String str1= sc.nextLine(); 
	
	System.out.println("Concat String="+str.concat(str1));
	
	}
}

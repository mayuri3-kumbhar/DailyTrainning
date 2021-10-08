package String;
//Write a Java program to count occurrences of a word in a given string.
import java.util.Scanner;
import java.lang.String;
public class Wordcount {
	public static void main(String[]args)
	{
		int cnt=0;
	Scanner sc= new Scanner(System.in); 
	System.out.print("Enter a string: ");  
	String str= sc.nextLine();             
	
	System.out.print("Enter a word: ");  
	String word= sc.nextLine();   
		
	//word = str.split(" ");
	for (int i=0;i<str.length();i++) 
	{
		if (word.equals(str))  
		{
		  cnt++;
		}
	}
		System.out.println(word+" occurs " +cnt+ " times in string");
		
	}
}
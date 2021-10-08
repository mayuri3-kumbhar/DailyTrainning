package String;
import java.lang.String;
import java.util.Scanner;

public class SimpleEg {
	public static void main(String[]args)
	{
	Scanner sc= new Scanner(System.in); 
	System.out.print("Enter a string: ");  
	String str= sc.nextLine();  
	String s="";
	System.out.println(str); 
	if(str.endsWith("ing"))
	{
		s=str+"ly";
	}
	System.out.println(s);
	
	
	System.out.println("Length of String: " +str.length());
	System.out.println("Convert to LowerCase: " +str.toLowerCase());
	System.out.println("Convert to LowerCase: " +str.toUpperCase());
	System.out.println("Character at position 3: " +str.charAt(3));
	System.out.println("Index of character 'a': " +str.indexOf('a'));
	//System.out.println("reverse of String: " +str.rev());
	
	char ch[]=str.toCharArray();	
	System.out.print("String in reverse order: ");
	for (int j=ch.length-1;j>=0;j--)
	{
	System.out.print(ch[j]+" ");
	}
	
	System.out.println("String in convetcase=");
	for (int k=0;k<ch.length-1;k++)
	{
		if(ch[k]>='A' && ch[k]<='Z')
			System.out.println("Convert string: " +str.toLowerCase());	
		else if(ch[k]>='a' && ch[k]<='z')
			System.out.println("Convert string: " +str.toUpperCase());
			
	}
	
}
}
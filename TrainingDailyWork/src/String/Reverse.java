package String;
//Write a Java program to find reverse of a string(using function).
import java.lang.String;
public class Reverse {
	public static void main(String[]args)
	{
		String s="My name is mayuri";
		String reverses="";
		for(int i = s.length()-1; i>=0; i--)
		{    
            reverses = reverses + s.charAt(i);    
        }    
            
        System.out.println("Original string: " +s);    
         
        System.out.println("Reverse of given string: " + reverses);   

	}
}

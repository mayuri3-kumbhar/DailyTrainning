package String;
import java.lang.String;
//Write a program that takes your full name as input and displays the abbreviations of the first and middle names except the last name which is displayed as it is
public class Initialname {
	public static void main(String[] args) 
    { 
        String str = "mayuri amol kumbhar";
        int len=str.length();
        String t = ""; 
        for (int i = 0; i < len; i++) 
        { 
            char ch = str.charAt(i); 
            if (ch != ' ') 
            {
            	t = t + ch; 			//// forming the word 
            } 
            else 
            { 
              System.out.print(Character.toUpperCase(t.charAt(0)) + ". ");       // printing the first letter 
              																	// of the name in capital letters 
                t = ""; 
            } 
        } 
  
        String temp = "";
        for (int j = 0; j < t.length(); j++) 
        {
            if (j == 0) 
                temp = temp + Character.toUpperCase(t.charAt(0)); 
            else
                temp = temp + Character.toLowerCase(t.charAt(j)); 
        }
        System.out.println(temp);  												// printing surname 
    }
} 



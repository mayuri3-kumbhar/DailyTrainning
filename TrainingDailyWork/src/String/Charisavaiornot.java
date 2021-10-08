package String;
import java.lang.String;
import java.util.Scanner;

public class Charisavaiornot 
{
	public static void main(String[] args) 
    {
	Scanner sc= new Scanner(System.in); 
	System.out.print("Enter a string: ");  
	String str= sc.nextLine(); 
	
	System.out.print("Enter a string: ");  
	String word= sc.nextLine();
	int a[]=new int[256];
	
	char String []=str.toCharArray();
	char String1 []=word.toCharArray();
	for(int i=0;i<=str.length();i++)
	{
		//a[str.charAt(i)]++;
		for(int j=i+1;j<=word.length()-1;j++)
		{
			//a[str.charAt(j)]--;
			if(word.equals(String[i]))
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("no");
			}
				
		}
	}
    }
}

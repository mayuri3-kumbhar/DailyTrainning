package String;
import java.lang.String;
import java.util.Scanner;

public class Maxoccuraceofchar {
	public static void main(String[]args)
	{
	Scanner sc= new Scanner(System.in); 
	System.out.print("Enter a string: ");  
	String str= sc.nextLine(); 
	int []cnt=new int [str.length()];
	char maxChar=str.charAt(0);
	int max;
	
	char String []=str.toCharArray();
			for(int i=0;i<=str.length();i++)
			{
				for(int j=i+1;j<=str.length()-1;j++)
				{
					if(String[i]==String[j])
					cnt[i]++;	
				}
			}
	max=cnt[0];
	for(int i=0;i<cnt.length-1;i++)
	{
		if(max<cnt[i])
		{
			max=cnt[i];
			maxChar=String[i];
		}
	}
	System.out.println("max occuring char="+maxChar);
				
	}

}

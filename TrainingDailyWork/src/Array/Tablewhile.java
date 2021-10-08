package Array;
import java.util.Scanner;

public class Tablewhile {
	public static void main(String[]arg) {
	int a,i=1;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter no=");
	a=sc.nextInt();
	
	while (i<=10)
	{
		System.out.println(i*a);
		i++;
	}
	

}
}
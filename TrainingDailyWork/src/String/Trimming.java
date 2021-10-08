package String;
//Write a Java program to trim leading white space characters in a string.
import java.lang.String;
public class Trimming {
	public static void main(String[]args)
	{
		String s=" My name is mayuri ";
		System.out.println(s);
		System.out.println("after trimming=\n"+s.trim());
		System.out.println("length="+s.trim().length());
	}

}

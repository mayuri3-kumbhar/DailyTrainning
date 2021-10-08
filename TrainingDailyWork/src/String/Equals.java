package String;
import java.lang.String;
public class Equals {
	public static void main(String[]args)
	{
	StringBuffer  s=new StringBuffer("Mayuri");
	StringBuffer  s1=new StringBuffer("Mayuri");
	
	String a=new String(s);
	String b=new String(s1);
	
	if(a.equals(b))
		System.out.print("equal");
	else
		System.out.print("not equal");

}
}
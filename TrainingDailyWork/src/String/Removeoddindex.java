package String;
import java.lang.String;
public class Removeoddindex {
	public static void main(String[] args) 
    { 
        String str = new String("mayuri");
        System.out.println("entered string="+str);
        String s="";
        for(int i=0;i<=str.length();i++)
        {
        	if(i%2==1)
        		 continue;
        		 s = s + str.charAt(i);
        }
        System.out.print("after removing odd index of String=" +s);
        
}
}

package SimpleProgram;
import java.util.Scanner;
public class Switcharith {
	public static void main(String[]args) {
		int num1,num2,add,sub,mul,div;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no1=");
		
		num1=sc.nextInt();
		System.out.println("Enter no2=");
		num2=sc.nextInt();
		
		String op;
		System.out.println("Enter op=");
		op=sc.next();
		
        switch(op)
        {
          case "add" :
                      add=num1+num2;
                      System.out.println("add="+add);
        		      break;
          case "sub" :
                      sub=num1-num2;
                      System.out.println("sub="+sub);
                      break;
          case "mul" :
              		  mul=num1*num2;
              		  System.out.println("mul="+mul);
              		  break;
          case "div" :
        	  		  div=num1/num2;
        	  		  System.out.println("div="+div);
        	  		  break;
          default     :
        	          System.out.println("wrong choice");
	  		          break;
        }
	}
}



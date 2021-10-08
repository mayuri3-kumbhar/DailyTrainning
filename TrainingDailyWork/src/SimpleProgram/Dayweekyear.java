package SimpleProgram;

import java.util.Scanner;

public class Dayweekyear {
	public static void main(String[]args) {
		int d,y,w;
		System.out.println("no of days");
		Scanner sc1=new Scanner(System.in);
		d=sc1.nextInt();
		
		y=d/365;
		System.out.println("year="+y);
		
		w=d/7;
		System.out.println("week="+w);
		
	}
	

}

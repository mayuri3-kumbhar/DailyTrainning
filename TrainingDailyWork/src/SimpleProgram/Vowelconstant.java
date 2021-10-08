package SimpleProgram;

import java.util.Scanner;

public class Vowelconstant {
	public static void main(String[]args) {
		char a;

		System.out.println("Enter Alphabet");
		Scanner sc=new Scanner(System.in);
		a=sc.next().charAt(0);
		
		if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='E' || a=='I' || a=='O' || a=='U')
			System.out.println("this is vowel");
		else
			System.out.println("this is not vowel");	
		
	}
}

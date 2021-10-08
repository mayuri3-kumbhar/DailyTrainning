package SimpleProgram;

import java.util.Scanner;

public class Switchmonth {
	public static void main(String[]args) {
		int mon;
		System.out.println("Enter month=");
		Scanner sc=new Scanner(System.in);
		mon=sc.nextInt();

        switch(mon)
        {
        case 1: 
        	    System.out.println("Jan");
        		break;
        case 2: 
        	    System.out.println("feb");
		        break;
        case 3: 
    	    	System.out.println("march");
    	    	break;
        case 4: 
        		System.out.println("April");
	            break;
        case 5: 
    	        System.out.println("May");
	            break;
        case 6: 
    	        System.out.println("June");
	            break;
        case 7: 
    	        System.out.println("July");
	            break;
        case 8: 
	        	System.out.println("Aug");
	        	break;   
        case 9: 
        		System.out.println("Sept");
        		break;
        case 10: 
	        	System.out.println("Oct");
	        	break;
        case 11: 
        		System.out.println("Nov");
        		break;
        case 12: 
        		System.out.println("Dec");
        		break;
        default :
        	    System.out.println("Wrong choice");
        	    break;
	        	
	            
             
        }
}
}



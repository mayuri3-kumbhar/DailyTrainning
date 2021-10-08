package Map;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {
	int cid;
	String cname;
	Float fees;
	
	Course () {}

	Course(int i,String cn,Float f)
	{
		cid=i;
		cname=cn;
		fees=f;
	}
	public String toString()
	{
		return " [Course id : " +cid+ " Course name : "+cname+ " Fees : "+fees+"]  ";
	}
	
	public static void main(String[] args) {
		
		
		Course c1=new Course(12,"Java",12000.00f);
		Course c2=new Course(14,"C",10000.00f);
		Course c3=new Course(10,"C++",9000.00f);
		Course c4=new Course(16,"Python",11500.00f);
		Course c5=new Course(12,"Data Stucture",11000.00f);
		
		HashMap<Course,Integer> m= new HashMap<>();
		m.put(c1, 34);
		m.put(c2, 45);
		m.put(c3, 52);
		m.put(c4, 25);
		m.put(c5, 55);
	
		for(Course key : m.keySet())
		{
		    Integer value = m.get(key);
		    System.out.println("Course Detail : " + key + "No of Student : " + value);
		}
		
	}
	
}

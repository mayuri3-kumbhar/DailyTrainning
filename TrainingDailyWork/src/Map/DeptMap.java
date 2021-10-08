package Map;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DeptMap {
	public static void main(String[] args) {
		Student s1=new Student(12,"Mayuri");
		Student s2=new Student(56,"Gouri");
		Student s3=new Student(67,"Rutuja");
		Student s4=new Student(34,"Vaishnavi");
		
		ArrayList<Student> studentlist =new ArrayList<>();
		studentlist.add(s1);
		studentlist.add(s2);
		studentlist.add(s3);
		studentlist.add(s4);
		
		Department d1=new Department(1,"Computers", studentlist);
		Department d2=new Department(2,"Electronics",studentlist);
		Department d3=new Department(3,"Mechanical",studentlist);
		Department d4=new Department(4,"Civil",studentlist);
			
			
			
		Map<Integer,Department> dmap=new HashMap<>();
		dmap.put(d1.deptid, d1);
		dmap.put(d2.deptid,d2);
		dmap.put(d3.deptid,d3);
		dmap.put(d4.deptid,d4);
		
		System.out.println(dmap);
		
		
	}

}

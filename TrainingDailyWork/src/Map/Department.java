package Map;

import java.awt.List;
import java.util.ArrayList;

public class Department {
	int deptid;
	String deptname;
	
	ArrayList<Student> studentlist;
	
	Department() {}
	
	public Department(int i,String d,ArrayList<Student> list)
	{
		deptid=i;
		deptname =d;
		studentlist=list;
		
	}
	public String toString()
	{
		//String studentlist = null;
		return "Department [dept id : "+deptid+ " deptname : " +deptname+ "]" + studentlist ;
	}
	
}

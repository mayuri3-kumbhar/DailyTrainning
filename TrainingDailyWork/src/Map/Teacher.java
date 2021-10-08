package Map;

import java.util.HashMap;

public class Teacher {
	int tid;
	String tname;
	
	Teacher() {}
	public Teacher(int i,String n)
	{
		tid=i;
		tname=n;
	}
	public String toString()
	{
		return "Teacher id : "+tid+" Teacher name : "+tname+ " " ;
	}
}


package Map;

public class Student {
	int roll;
	String name;
	 
	Student() {}
	Student(int r,String n)
	{
		roll=r;
		name=n;
	}
	
	public String toSting()
	{
		return "Student [Roll : "+roll+ "Name : "+name+"]";
	}

}

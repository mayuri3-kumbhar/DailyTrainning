package Map;

public class DivisionTeacher {
	int std;
	int totalstu;
	String divname;
	
	DivisionTeacher(){}

	DivisionTeacher(int s,int ts,String dn)
	{
		std=s;
		totalstu=ts;
		divname=dn;
	}
	public String toString()
	{
		return "Standard : "+std+" total Student : "+totalstu+" Division name : "+divname+ " ";
	}
}

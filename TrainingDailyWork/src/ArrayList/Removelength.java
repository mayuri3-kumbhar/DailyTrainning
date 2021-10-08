package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Removelength {
	public static void main(String[]args)
	{
		List<String> day=new ArrayList<>();
		day.add("sunday");
		day.add("monday");
		day.add("tuesday");
		day.add("wednesday");
		day.add("thursday");
		day.add("friday");
		day.add("Saturday");
		
		ArrayList<String> days = new ArrayList<>();
		for(String s :day)
		{
			if(s.length()<=7)
				days.add(s);
		}
		System.out.println("Days : "+days);
		
	}
}

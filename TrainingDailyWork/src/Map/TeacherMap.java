package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TeacherMap {
	
		public static void main(String[] args) 
		{
			Teacher t1=new Teacher(4,"Mr X");
			Teacher t2=new Teacher(5,"Mr Y");
			Teacher t3=new Teacher(2,"Mrs Z");
			Teacher t4=new Teacher(8,"Mr A");
			Teacher t5=new Teacher(1,"Mrs B");
			
			HashMap<Teacher,String> m1=new HashMap<>();
			m1.put(t1, "Maths");
			m1.put(t2, "Physics");
			
			HashMap<Teacher,String> m2=new HashMap<>();
			m2.put(t3, "Electronics");
			m2.put(t4, "Chemestry");
			m2.put(t5, "English");
			System.out.println(m1);
			System.out.println("_____________");
			System.out.println(m2);
			System.out.println("___________________");
			
			
			DivisionTeacher d1= new DivisionTeacher(12,56,"A");
			DivisionTeacher d2= new DivisionTeacher(11,63,"B");
			DivisionTeacher d3= new DivisionTeacher(12,88,"A");
			DivisionTeacher d4= new DivisionTeacher(10,32,"C");
			DivisionTeacher d5= new DivisionTeacher(11,52,"D");
			
			//HashMap in HashMap
			HashMap<DivisionTeacher,HashMap<Teacher,String>> h=new HashMap<>();
			h.put(d1, m1);
			h.put(d2, m2);
			
			//using iterator
			Set<Map.Entry<DivisionTeacher, HashMap<Teacher,String>>> entryset=h.entrySet();
			Iterator<Map.Entry<DivisionTeacher, HashMap<Teacher,String>>> it=entryset.iterator();
			while(it.hasNext())
			{
				Map.Entry<DivisionTeacher, HashMap<Teacher,String>> entry=(Map.Entry<DivisionTeacher, HashMap<Teacher,String>>)it.next();
				System.out.println("Division info : "+entry.getKey()+"  Teacher info : "+entry.getValue());
				
			}
			//System.out.println(h);
			System.out.println("_________________________");
			
			HashMap<Integer,String> a=new HashMap<>();
			a.put(d1.std,t1.tname);					  //std from division & name from teacher class
			a.put(d2.std, t2.tname);
			System.out.println(a);
		}
	

}

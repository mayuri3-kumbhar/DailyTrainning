package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Menu {
	public static void main(String[] args) {
		LinkedList<String> menu =new LinkedList<>();
		
		LinkedList<String> submenu=new LinkedList<>();
		LinkedList<LinkedList<String>> menuCard=new LinkedList<>();
	//System.out.println("menu");
		menu.add("abs");
		menu.add("hgfkh");
		menu.add("jhgjgm");
		menu.add("jk");
	
		//submenu.add("yu");
		
		//System.out.println(submenu);
		//System.out.println("submenu");
		submenu.add("uiusjka");
		submenu.add("kshaj");
		
		
		
		menuCard.add(menu);
		for (String me:menu) {
			System.out.println("menu card is "+me);
			menuCard.add(submenu);
			for(LinkedList<String> m:menuCard)
			{
				if(m.removeAll(menu))
				{
				System.out.println("subManu is following");
				}
				else
					System.out.println(m);
				}
			}
		
		}
		
		
		
		
		
	
		/*Iterator<LinkedList<String>> ite=menuCard.iterator();
		while(ite.hasNext()) 
		{
			LinkedList<String>i=ite.next();
			Iterator<String >
			System.out.println("menu"+ite.next());
		}*/
	
	
	
}

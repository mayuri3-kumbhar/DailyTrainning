package abstractProgram;

public class Machine1 {
	public static void main(String[]args)
	{
		Juicer j=new Juicer();
		j.crush();
		j.setRotate(9000);
		System.out.println("The rotion speed of Juicer is "+j.getRotate());
		
		Machine m= new Juicer();
		m.crush();
		m.setRotate(10000);
		System.out.println("The rotion speed of Juicer1 is "+m.getRotate());
		
		Juicer f=new Filter();
		f.crush();
		f.setRotate(500);
		System.out.println("The rotion speed of filter is "+f.getRotate());
		
		/*Mixer a=new Mixer();
		a.blend();
		a.crush();
		a.setRotate(6000);
		System.out.println("The rotion speed of filter is "+a.getRotate());*/
		
		
	}

}

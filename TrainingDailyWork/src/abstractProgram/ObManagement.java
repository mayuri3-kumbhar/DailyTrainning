package abstractProgram;

public class ObManagement {
	public static void main(String[]arg) 
	{
		ObjectManagement om;
		
		om=new Ball();
		om.setSpeed(120);
		System.out.println("initial speed of ball:"+om.getSpeed()+"km/hr");
		om.move(180);
		
		om=new Car();
		om.setSpeed(230);
		om.move(240);
		System.out.println("initial speed of Car:"+om.getSpeed()+"km/hr");
		
	}
}

package abstractProgram;

public class Shape1 {
	public static void main(String[]arg)
	{
		Shape sh;
		
		sh=new Rectangle();
		sh.setFillcolour("red");
		System.out.println("colour of rectangle is " +sh.getFillcolour());
		sh.describeShape("2D");
		
		sh=new Triangle();
		sh.setFillcolour("Green");
		System.out.println("colour of tringle is " +sh.getFillcolour());
		sh.describeShape("3D");
	}
}

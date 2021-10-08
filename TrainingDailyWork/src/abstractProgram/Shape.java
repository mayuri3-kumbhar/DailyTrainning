package abstractProgram;

abstract public class Shape {
	String colour,shape;
	abstract public void describeShape(String shape);
	public void setFillcolour(String c)
	{
		colour=c;
	}
	public String getFillcolour()
	{
		return colour;
	}

}

class Rectangle extends Shape{
	
	public void describeShape(String s)
	{
		shape=s;
		System.out.println("rectangle shape is "+shape);
	}
	
}
class Triangle extends Shape{
	
	public void describeShape(String s)
	{
		shape=s;
		System.out.println("Triangle shape is "+shape);
	}
	
}

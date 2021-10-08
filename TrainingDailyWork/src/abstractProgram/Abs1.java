package abstractProgram;

abstract public class Abs1 {
	int a=3;
	abstract public void doAbs1(int a);
	{
		System.out.println("value of a="+a);
	}
	

}

abstract class Abs2 extends Abs1
{
	int b;
	abstract public void doAbs2(int b);
	{
		System.out.println("value of b"+b);
	}
}

class Temp extends Abs1
{
	public void doAbs1(int a)
	{
		System.out.println("temp value " +a);
	}
}

/*class Temp extends Abs2
{
	public void doAbs1(int a)
	{
		System.out.println("temp value " +a);
	}
}*/
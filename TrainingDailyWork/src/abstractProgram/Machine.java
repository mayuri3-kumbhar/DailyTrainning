package abstractProgram;

abstract public class Machine {
	int rotation;
	abstract public void crush();
	public void setRotate(int r)
	{
		this.rotation=r;
	}
	public int getRotate()
	{
		return rotation;
	}

}
class Juicer extends Machine
{
	public void crush()
	{
		System.out.println("juicer will rotate fast");
	}
	
}
class Filter extends Juicer
{
	public void crush()
	{
		System.out.println("their are 2 type of filter = LPF,HPF");
	}
}

abstract class Mixer extends Machine{
	abstract public void blend();
	/*{
		System.out.println("mixer is faster than Juicer");
	}*/
	
}
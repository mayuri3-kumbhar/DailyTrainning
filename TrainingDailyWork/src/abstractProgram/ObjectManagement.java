package abstractProgram;

abstract class ObjectManagement {
	int speed;
	static String direction="forword";
	abstract public void move(int newspeed);
	public void setSpeed(int s)
	{
		this.speed=speed;
	}
	public int getSpeed()
	{
		return speed;
	}

}
class Ball extends ObjectManagement
{
	public void move(int s)
	{
		speed=s;
		System.out.println("now ball is rolling with speed"+speed+"meter/min on ground in "+ObjectManagement.direction+"Direction");
	}
}
class Car extends ObjectManagement
{
	public void move(int s)
	{
		speed=s;
		System.out.println("now car is running with speed"+speed+"km/hr on ground in "+ObjectManagement.direction+"Direction");
	}
}

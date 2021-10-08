package p2interaface;

interface Washable {
	void wash();
}

class Kitchen implements Washable
{
	public void wash()
	{
		System.out.println("My kitchen interior is made of marble");
	}
}

class Laundry implements Washable
{
	public void wash()
	{
		System.out.println("Lotus hotel laundry service is not up to mark");
	}

}

class Carservice implements Washable
{
	public void wash()
	{
		System.out.println("I used to do my car service every 6 month ");
	}

}

package p2interaface;

interface Printable {
	void print();

}

interface Decorable{
	void decorate();
}

class Book implements Printable,Decorable
{
	public void print()
	{
		System.out.println("this book is out of print");
	}
	public void decorate()
	{
		System.out.println("i want to decorate my notebook by using craft paper");
	}
}

class Document implements Printable, Decorable
{
	public void print()
	{
		System.out.println("Document printing");
	}
	public void decorate()
	{
		System.out.println("decorative background for word document is very nice ");
	}
}
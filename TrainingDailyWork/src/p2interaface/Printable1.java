package p2interaface;

public class Printable1 {
	public static void main(String[]args)
	{
		Book b=new Book();
		b.print();
		b.decorate();
		
		Document d=new Document();
		d.print();
		d.decorate();
	}

}

package p2interaface;

public class Washable1 {
	public static void main(String []args) {
	Washable w;
	
	w=new Kitchen();
	w.wash();
	
	
	w=new Laundry();
	w.wash();
	
	w=new Carservice();
	w.wash();
	

}
}

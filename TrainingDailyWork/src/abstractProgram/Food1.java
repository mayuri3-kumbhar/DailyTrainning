package abstractProgram;

public class Food1 {
	public static void main(String[]args)
	{
		Food f;
		
		f=new Maharashtrianfood();
		f.setIngredient("abc");
		System.out.println("ingredient are"+f.getIngredient());
		f.receipe("xyz");
		
		f=new Puranpoli();
		f.setIngredient("mno");
		System.out.println("ingredient are"+f.getIngredient());
		f.receipe("lmo");
		
	}

}

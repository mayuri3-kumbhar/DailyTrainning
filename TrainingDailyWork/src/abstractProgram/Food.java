package abstractProgram;

abstract public class Food {
	String ingredient,receipe;
	abstract public void receipe(String r);
	public void setIngredient(String i)
	{
		this.ingredient=ingredient;
	}
	public String getIngredient()
	{
		return ingredient;
	}

}
class Maharashtrianfood extends Food
{
	public void receipe(String r)
	{
		receipe=r; 
		System.out.println("There are so many maharastrian food but "+r+" receipe is very easy and ingredient are");
		
	}
	}

class Puranpoli extends Maharashtrianfood
{
	public void receipe(String r)
	{
		receipe=r; 
		System.out.println("receipe of puranpoli is using "+r);
	}
}

class Southindianfood extends Food
{
	public void receipe(String r)
	{
		receipe=r; 
		System.out.println("southindian food are very testy but "+r+"is very good");
	}
}

class Idli extends Southindianfood
{
	
	}

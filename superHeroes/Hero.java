package superHeroes;

public class Hero
{
	private String heroName; 
	
	public Hero(String name)
	{
		heroName = name;
	}
	
	public void saveTheWorld()
	{
		System.out.println(getName() + " saves the world again!");
	}
	
	public String getName()
	{
		return heroName;
	}
}

package superHeroes;

public class HeroBatman extends Hero
{
	public HeroBatman(String name)
	{
		super(name);
	}
	
	@Override
	public void saveTheWorld()
	{
		System.out.println(getName() + " saves the world again!  Gotham City celebrates!");
	}
}

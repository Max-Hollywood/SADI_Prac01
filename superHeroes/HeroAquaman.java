package superHeroes;

public class HeroAquaman extends Hero
{
	public HeroAquaman(String name)
	{
		super(name);
	}
	
	@Override
	public void saveTheWorld()
	{
		System.out.println(getName() + " saves the world again!  Atlantis rejoices!");
	}
}

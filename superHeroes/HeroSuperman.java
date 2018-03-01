package superHeroes;

import superAbilities.Abilities;

public class HeroSuperman extends Hero implements Abilities
{
	public HeroSuperman(String name)
	{
		super(name);
	}

	@Override
	public void fly()
	{
		System.out.println(getName() + " is flying to the fortress of solitude.");
	}
}

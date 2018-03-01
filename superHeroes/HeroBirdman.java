package superHeroes;

import superAbilities.Abilities;

public class HeroBirdman extends Hero implements Abilities
{
	public HeroBirdman(String name)
	{
		super(name);
	}
	
	@Override
	public void fly()
	{
		System.out.println(getName() + " is flying close to the sun.");
	}
}

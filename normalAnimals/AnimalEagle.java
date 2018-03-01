package normalAnimals;

import normalAnimals.Animal;
import superAbilities.Abilities;

public class AnimalEagle extends Animal implements Abilities
{
	public AnimalEagle()
	{
		super("eagle");
	}
	
	@Override
	public void fly()
	{
		System.out.println("The " + getAnimal() + " is soaring.");
	}
}

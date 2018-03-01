package normalAnimals;

import normalAnimals.Animal;
import superAbilities.Abilities;

public class AnimalParrot extends Animal implements Abilities
{
	public AnimalParrot()
	{
		super("parrot");
	}
	
	@Override
	public void fly()
	{
		System.out.println("The " + getAnimal() + " is flying in all its glorified colour.");
	}
}

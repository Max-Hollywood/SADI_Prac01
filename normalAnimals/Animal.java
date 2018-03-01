package normalAnimals;

import creatures.Creatures;

public class Animal extends Creatures
{
	String animal;
	
	public Animal(String species)
	{
		animal = species;
	}
	
	public String getAnimal()
	{
		return animal;
	}
}

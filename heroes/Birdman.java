package heroes;

import abilities.Flight;

public class Birdman  extends _Hero implements Flight
{
	Birdman(String name)
	{
		super(name);
	}

	@Override
	public void fly()
	{
		System.out.println("A dude that looks like a bird flying.");
	}
}

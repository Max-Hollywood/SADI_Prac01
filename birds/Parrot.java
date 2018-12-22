package birds;

import abilities.Flight;

public class Parrot extends _Bird implements Flight
{
	@Override
	public void fly()
	{
		System.out.println("Soaring colours something Parrot.");
	}
	
}

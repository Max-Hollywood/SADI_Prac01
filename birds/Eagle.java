package birds;

import abilities.Flight;

public class Eagle extends _Bird implements Flight
{
	@Override
	public void fly()
	{
		System.out.println("Big flying soaring talon feet.");
	}
	
}

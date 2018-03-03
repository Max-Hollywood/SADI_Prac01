package heroes;

import abilities.Flight;

public class Superman extends _Hero implements Flight
{
	Superman(String name)
	{
		super(name);
	}

	@Override
	public void fly()
	{
		System.out.println("The spokesman for comfy undies, taking flight.");
	}
}

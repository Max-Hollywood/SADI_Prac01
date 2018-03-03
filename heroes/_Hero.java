package heroes;

/**
 * The abstract parent class to all the heroes.
 * 
 * @version 2
 * 
 * @version
 * CHANGES:
 *  Make the Hero class abstract _Hero.
 *  
 *  Made it so that we append to the string that is printed when saveTheWorld() is called,
 *  instead of telling it to print the same thing every time we override.
 *  	Issues:
 *  	 Couldn't call super("...") from the overridden saveTheWorld(), so had to send process
 *  	 to the saveTheWorld("...") with "", so removed saveTheWorld() printing.  Kevin's example
 *  	 helped with this.
 * 
 * @author Max
 *
 */

public abstract class _Hero
{
	private String name;
	private String saveWorldText = " has saved the world!";
	
	_Hero(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void saveTheWorld()
	{
		saveTheWorld("");
	}
	
	public void saveTheWorld(String str)
	{
		String saveWorldString = getName() + saveWorldText + "  " + str;
		System.out.println(saveWorldString);
	}
}

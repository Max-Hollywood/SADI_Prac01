package heroes;

public class Batman extends _Hero
{
	private String victoryText = "Gotham celebrates!";
	
	Batman(String name)
	{
		super(name);
	}
	
	@Override
	public void saveTheWorld()
	{
		saveTheWorld(victoryText);
	}
}

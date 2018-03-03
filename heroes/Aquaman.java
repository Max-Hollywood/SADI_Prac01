package heroes;

public class Aquaman extends _Hero
{
	private String victoryText = "Atlantis rejoices!";
	
	Aquaman(String name)
	{
		super(name);
	}
	
	@Override
	public void saveTheWorld()
	{
		saveTheWorld(victoryText);
	}
}

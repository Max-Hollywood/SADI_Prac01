package birds;

import java.util.ArrayList;
import java.util.List;

/**
 * This generates the birds into a list and returns the list
 * 
 * @author Max
 */
public class BirdControl
{
	/** Generate the list of birds.
	 * 
	 * @return List<_Birds>
	 */
	public static List<_Bird> generateBirdList()
	{
		List<_Bird> list = new ArrayList<_Bird>();
		list.add(new Eagle());
		list.add(new Emu());
		list.add(new Parrot());
		list.add(new Penguin());
		return list;
	}
}

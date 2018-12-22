package heroes;

import java.util.ArrayList;
import java.util.List;

import heroes.Aquaman;
import heroes.Batman;

/**
 * This generates the heroes into a list and returns the list.
 * 
 * NOTE:
 *  We could just have a single Hero class and create
 *  each instance of a Hero with their name, instead
 *  of doing what we are doing below.  But that means
 *  more work later for the extra stuff we want them
 *  to do.
 * 
 * @author Max
 *
 */
public class HeroControl
{
	/** Generate the list of heroes.
	 * 
	 * @return List<_Hero>
	 */
	public static List<_Hero> generateHeroList()
	{
		List<_Hero> list = new ArrayList<_Hero>();
		list.add(new Aquaman("Aquaman"));
		list.add(new Batman("Batman"));
		list.add(new Birdman("Birdman"));
		list.add(new Superman("Superman"));
		list.add(new WonderWoman("WonderWoman"));
		return list;
	}
}

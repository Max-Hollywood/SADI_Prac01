package abilities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import birds._Bird;
import heroes._Hero;

/** This generates the flying Heroes and Birds and returns the list
 * 
 * @author Max
 */
public class FlightControl
{
	/** Generate the list of flyers
	 * 
	 * @return List<Flight>
	 */
	public static List<Flight> generateFlyingList(List<_Hero> HeroList, List<_Bird> BirdList)
	{
		List<Flight> list = new ArrayList<Flight>();
		
		/* Keeping this here, as auto filled by Eclipse.
		 * Don't know what it does, but adds the stuff together.
		 * list.addAll((Collection<? extends Flight>) HeroList); */
		
		for (_Hero flyer : HeroList)
		{
			if (flyer instanceof Flight)
			{
				list.add((Flight) flyer);
			}
		}
		
		for (_Bird flyer : BirdList)
		{
			if (flyer instanceof Flight)
			{
				list.add((Flight) flyer);
			}
		}
		
		return list;
	}
}

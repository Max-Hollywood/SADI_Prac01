package mainProgram;

import java.util.List;

import abilities.Flight;
import abilities.FlightControl;
import birds.BirdControl;
import birds._Bird;
import heroes.HeroControl;
import heroes._Hero;

/**
 * Our favourite DC superheroes in their prime, before
 * most of them were turned into horrible movies.
 * 
 * Also, birds.
 * 
 * @version 2
 * @version
 * CHANGES:
 *  Rewriting to make use of List<T> and ArrayList<T>.
 *  Apparently List<T> is abstract, and ArrayList<T>
 *  is the (usable) implementation of List<T>.
 *  
 *  Reducing coupling by introducing a Control class
 *  to handle related classes.
 * 
 * @author Max
 *
 */
public class HeroesAndBirds
{
	public static void main(String[] args)
	{
		List<_Hero> HeroList = HeroControl.generateHeroList();
		List<_Bird> BirdList = BirdControl.generateBirdList();
		List<Flight> Flying = FlightControl.generateFlyingList(HeroList, BirdList);
		// Print out our heroes
		
		
		for (_Hero hero : HeroList)
		{
			hero.saveTheWorld();
		}
		
		// Print out our flying chaps
		
		
	}
}

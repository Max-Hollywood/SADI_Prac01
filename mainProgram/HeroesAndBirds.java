
/**
 * @version 1
 * @author Max-Hollywood
 * 1/3/2018
**/


package mainProgram;

import superHeroes.Hero;
import superHeroes.HeroAquaman;
import superHeroes.HeroBatman;
import superHeroes.HeroBirdman;
import superHeroes.HeroSuperman;
import superHeroes.HeroWonderWoman;
import normalAnimals.AnimalEagle;
import normalAnimals.AnimalParrot;
import superAbilities.Abilities;

public class HeroesAndBirds
{
	public static void main(String[] args)
	{
		// Our superheroes
		Hero[] heroList =
		{
				(Hero) new HeroAquaman("Aquaman"),
				(Hero) new HeroBatman("Batman"),
				(Hero) new HeroBirdman("Birdman"),
				(Hero) new HeroSuperman("Superman"),
				(Hero) new HeroWonderWoman("Wonder Woman")
		};
		
		/* Flying things
		 * Casting as the interface to put them into the array
		 */
		Abilities[] fliers =
		{
			(Abilities) new HeroBirdman("Birdman"),
			(Abilities) new HeroSuperman("Superman"),
			(Abilities) new AnimalEagle(),
			(Abilities) new AnimalParrot()
		};
		
		for (Hero hero : heroList)
		{
			hero.saveTheWorld();
		}
		
		System.out.println("");
		
		// All instances in this implement the interface, so they can all do fly()
		for (Abilities flapper : fliers)
		{
			flapper.fly();
		}
	}
}

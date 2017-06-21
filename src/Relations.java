
public class Relations {

	public static void main(String[] args) {
		/* TODO Show the difference between IS-A and HAS-A relationships.
		 * One isn't necessarily better than the other. It's just a matter of what is
		 * needed to satisfy the requirements of the project.
		 */
		
		Insect fireAnt = new Insect(6,"red");
		Bee bumbleBee = new Bee(6,"yellow");
		
		System.out.println(fireAnt);
		System.out.println(bumbleBee);
	}

}

class Insect {									//Parent Class to be inherited by Bee.
	
	int legs = 0;
	String color = "black";
	
	Insect(int legs, String color){				//Insect constructor initializing Insect variables.
		this.legs = legs;
		this.color = color;
	}
	
	public String toString(){					
		return "This insect is "+color+" in color, and has "+legs+" legs.";
	}
	
}

class Wings {									//Wing class to be instantiated in Bee Class. 
	
	int wingCount = 2;							//Default value for wingCount is 2
	
	Wings(int wingCount){						//Wings constructor initializing wingCount
		this.wingCount = wingCount;
	}
	@Override
	public String toString() {
		return "It has "+wingCount+" wings";
	}
	
}
/*Bee "IS-A" Insect because it inherits the Insect Class
*Bee 'is-like' an Insect because it has legs, color like the Insect class.
*The only reason (in this example) it needs it's own class is because it requires a feature that
*'Insect' doesn't have, which is Wings. "Not All Insects Have Wings"
*/
class Bee extends Insect {						
	
	private final int wingCount = 4;			//Every Bee has exactly 4 wings
	
	Bee(int legs, String color){				
		super(legs, color);
	}
	/*Bee 'HAS-A' Wings; winged is an instance of Wings contained in Bee.
	*Besides the fact that Insect can't inherit from more than 1 class, Wing is not necessarily a class
	*that bee should inherit from. Though Wings has some content that affect Bee, it is more of an
	*asset/data that Bee 'has'/'requires', than it is an object that it 'is-like'/or 'behaves-like.'
	*/ 
	Wings winged = new Wings(wingCount);		
	
	@Override
	public String toString(){					//Overriding toString method in Insect
		return "This bee is "+color+" in color and has "+legs+" legs\n" + winged;
	}
}
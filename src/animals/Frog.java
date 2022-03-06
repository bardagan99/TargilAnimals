package animals;

public class Frog extends Animals implements Water, Land{

	//Characteristics
	public int numberOfLegs = 4;
	public boolean oviparous;
	public boolean gills;

	//constructor
	public Frog(boolean mammals, boolean carnivorous, int mood, boolean oviparous, boolean gills) {
		
		super(mammals, carnivorous,  mood);
		this.mammals = false;
		this.carnivorous = false;
		this.oviparous = oviparous;
		this.gills = gills;

	}
	
	//prints hello according to mood
	@Override
	public void sayHello(int mood) {
		if(mood >= 5)
			System.out.println("quack quack quack");
		else
			System.out.println("plop into the water");
	}
	
	// check if has gills
	public boolean hasGills() {
		if (gills == true)
			return true;
		return false;
	}
	// check if has lays eggs
	public boolean hasLaysEggs() {
		if (oviparous == true)
			return true;
		return false;
	}

	public int getNumberOfLegs() {
		return this.numberOfLegs;
	}
	
	//print
	@Override
	public String toString() {
		return "Frog is: mammals: " + this.mammals + " carnivorous: " + this.carnivorous + " MOOD_HAPPY: "  +
				this.MOOD_HAPPY + " MOOD_SCARE: " + this.MOOD_SCARE + " mood: " + 
				this.mood + " numberOfLegs: " + this.numberOfLegs + " oviparous: " + this.oviparous + " gills: " + this.gills ;
	}
	


}

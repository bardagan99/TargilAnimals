package animals;

public class Dog extends Animals implements Land{

	//Characteristics
	public int numberOfLegs = 4;
	
	//constructor
	public Dog(boolean mammals, boolean carnivorous, int mood) {
		
		super(mammals, carnivorous, mood);
		this.mammals = true;
		this.carnivorous = true;
		
	}
	
	//prints hello
	@Override
	public void sayHello() {
		System.out.println("wagging their tails");
	}
	
	//prints hello according to mood
	@Override
	public void sayHello(int mood) {
		if(mood >= 5)
			System.out.println("bark loudly");
		else
			System.out.println("whooping");
	}
		
	@Override
	public int getNumberOfLegs() {
		return this.numberOfLegs;
	}
	
	//print
	@Override
	public String toString() {
		return "Dog is: mammals: " + this.mammals + " carnivorous: " + this.carnivorous + " MOOD_HAPPY: "  + this.MOOD_HAPPY + " MOOD_SCARE: " + this.MOOD_SCARE + " mood: " + this.mood + " numberOfLegs: " + this.numberOfLegs;
	}
	
	
}

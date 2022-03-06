package animals;

public abstract class Animals {

	//Characteristics
	protected boolean mammals;
	protected boolean carnivorous;
	protected int MOOD_HAPPY;
	protected int MOOD_SCARE;
	protected int mood;
	
	//constructor
	public Animals(boolean mammals ,boolean carnivorous, int mood) {
		this.mammals = mammals;
		this.carnivorous = carnivorous;
		this.mood = mood;
	}
	
	//getter
	public int getMood() {
		return mood;
	}
	
	public int getMOOD_HAPPY() {
		return MOOD_HAPPY;
	}
	
	public int getMOOD_SCARE() {
		return MOOD_SCARE;
	}
	
	//setter
	public void setCarnivorous(boolean carnivorous) {
		this.carnivorous = carnivorous;
	}
	
	public void setMammals(boolean mammals) {
		this.mammals = mammals;
	}
	
	public void setMood(int mood) {
		this.mood = mood;
	}
	
	public void setMOOD_HAPPY(int mOOD_HAPPY) {
		MOOD_HAPPY = mOOD_HAPPY;
	}
	
	public void setMOOD_SCARE(int mOOD_SCARE) {
		MOOD_SCARE = mOOD_SCARE;
	}
	
	//prints hello
	public void sayHello() {
		System.out.println("hello");
	}
	
	//prints hello according to mood
	public void sayHello(int mood) {
		if(mood >= 5)
			System.out.println("hhhh");
		else
			System.out.println("nnnnn");
	}
	
	//checks if it's a mammals
	public boolean isMammals() {
		if (mammals == true)
				return true;
		return false;
	}
	
	//checks if it's a carnivorous
	public boolean isCarnivorous() {
		if (carnivorous == true)
				return true;
		return false;
	}
	
	//print
	public String toString() {
		return  "Animals is: mammals: " + this.mammals + " carnivorous: " + this.carnivorous + " MOOD_HAPPY: "  + this.MOOD_HAPPY + " MOOD_SCARE: " + this.MOOD_SCARE + " mood: " + this.mood;
	}
}


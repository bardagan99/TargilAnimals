package animals;

import java.util.Scanner;

public class TestAnimals {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Dog d = new Dog (true, true, 9);
		d.sayHello(5);
		d.sayHello();
		d.getNumberOfLegs();
		System.out.println(d.toString());

		
		Cat c = new Cat(true, true, 3);
		Cat c2 = new Cat(true, true, 6);
		c.sayHello();
		c.sayHello(4);
		System.out.println(c.getNumberOfLegs());
		System.out.println(c.toString());
		System.out.println(c2.toString());
		
		
		Frog f = new Frog(false, false, 1, false, false);
		f.sayHello();
		f.sayHello(8);
		f.hasGills();
		f.getNumberOfLegs();
		System.out.println(f.toString());
		System.out.println(f.hasLaysEggs());

		input.close();

	}

}

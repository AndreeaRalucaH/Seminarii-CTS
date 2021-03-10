package program;

import clase.Girafa;
import clase.Zebra;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		Zoo z = new Zoo();
		
		Girafa girafa  = new Girafa("Girafa1");
		Girafa girafa1  = new Girafa("Girafa2");
		z.addAnimal(girafa);
		z.addAnimal(girafa1);
		
		z.feedAnimals();
		
		Zebra zebra = new Zebra("z1");
		Zebra zebra1 = new Zebra("z2");
		Zebra zebra2 = new Zebra("z3");
		
		z.addAnimal(zebra1);
		z.addAnimal(zebra2);
		z.addAnimal(zebra);
		
		z.feedAnimals();
	}

}

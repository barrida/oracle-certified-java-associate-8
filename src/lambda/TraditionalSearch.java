package lambda;

import java.util.ArrayList;
import java.util.List;

class Animal {
	private String species;
	private boolean canHop;
	private boolean canSwim;

	public Animal(String speciesName, boolean hopper, boolean swimmer) {
		species = speciesName;
		canHop = hopper;
		canSwim = swimmer;
	}

	public boolean canHop() {
		return canHop;
	}

	public boolean canSwim() {
		return canSwim;
	}

	public String toString() {
		return species;
	}
}


interface CheckTrait {
	boolean test(Animal a);
}

class CheckIfHopper implements CheckTrait {
	public boolean test(Animal a) {
		return a.canHop();
	}
}

class CheckIfSwims implements CheckTrait {

	@Override
	public boolean test(Animal a) {
		return a.canSwim();
	}
}

public class TraditionalSearch {
	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>(); // list of animals

		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));
		animals.add(new Animal("tomis", true, true));

		print(animals, new CheckIfHopper()); // pass class that does check
		print(animals, new CheckIfSwims());
		print(animals, a -> a.canHop()); // Lambda syntax omitting optional parts.  Only parameter name, arrow, and body are required
		print(animals, (Animal a) -> a.canHop()); // Lambda syntax omitting optional parts
		print(animals, a -> {return a.canHop();}); //Lambda syntax including optional parts: return statement and ;
		print(animals, (Animal a) -> { return a.canHop();}); //Lambda syntax including optional parts: optional parameter type, return statement and ;		print(animals, a -> a.canSwim());
		print(animals, a -> !a.canSwim());
		print(animals, a -> a.canSwim() && a.canHop());
		print(animals, a -> {return a.canSwim() && a.canHop();});

	}

	/**
	 * Lambdas are passed to a method expecting an interface with one method.
	 * 
	 * @param animals
	 * @param checker
	 */
	private static void print(List<Animal> animals, CheckTrait checker) {
		
		for (Animal animal : animals) {
			if (checker.test(animal)) // the general check
				System.out.print(animal + " ");
		}
		System.out.println();
	}
	
}
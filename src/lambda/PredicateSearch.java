package lambda;

import java.util.*;
import java.util.function.Predicate;

/**
 * Predicate is a common interface. It has one method named test that returns a
 * boolean and takes any type.
 * 
 * The removeIf() method on ArrayList takes a Predicate.
 * 
 * @author suleyman.yildirim
 *
 */
public class PredicateSearch {

	public static void main(String[] args) {

		List<Animal> animals = new ArrayList<Animal>(); // list of animals

		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));
		animals.add(new Animal("tomis", true, true));

		printPredicate(animals, a -> a.canHop());

		// You need to know remoteIf for exam
		callRemoveIf(animals);
	}

	/***
	 * Predicate is a common interface. It has one method named test that
	 * returns a boolean and takes any type.
	 * 
	 * @param animals
	 * @param checker
	 */
	private static void printPredicate(List<Animal> animals, Predicate<Animal> checker) {

		for (Animal animal : animals) {
			if (checker.test(animal)) // the general check
				System.out.print(animal + " ");
		}
		System.out.println();
	}

	/**
	 * You need to know remoteIf for exam. The removeIf() method on ArrayList
	 * takes a Predicate.
	 * 
	 * @param animals
	 */
	private static void callRemoveIf(List<Animal> animals) {
		Predicate<Animal> predicate = s -> s.canHop() == false;
		animals.removeIf(predicate);
		System.out.println(animals);
	}

}

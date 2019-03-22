package lambda;

import java.util.function.*;

/**
 * 
 * @author suleyman.yildirim
 *
 */
public class LambdaFunctions {

	public static void main(String[] args) {
		functionalInterface();
	}

	/**
	 * 
	 * @param number
	 * @param predicate
	 */
	static boolean callPredicate(int number, Predicate<Integer> predicate) {
		return predicate.test(number);
	}

	/**
	 * 
	 */
	private static void functionalInterface() {

		Predicate<Integer> isOdd = i -> (i % 2 == 0);
		
		
		System.out.println(isOdd.test(10)); // true
		System.out.println(isOdd.test(11)); // false
		

		Predicate<String> empty = s -> (s.isEmpty());
		System.out.println(empty.test("")); // true
		System.out.println(empty.test("asd"));

		// predicate in function
		Predicate<Integer> predicate = i -> i % 2 == 0;
		callPredicate(10, predicate);

	}

}

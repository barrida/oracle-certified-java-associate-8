package arraylists;

import java.util.ArrayList;
import java.util.List;

/**
 * add() remove() set() isEmpty() size() clear() contains() equals()
 * 
 * @author suleyman.yildirim
 *
 */
public class ArrayListFunctions {

	public static void main(String[] args) {
		// Arrays define a property called length not a function
		// The ArrayList class defines a method called size().
		functions();
	}

	/**
	 * 
	 */
	private static void functions() {
		// add()
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(5);
		arr.add(2);
		arr.add(8);
		System.out.println(arr);

		// add 45 to 2nd index
		arr.add(2, 45);
		System.out.println(arr);

		// remove()
		arr.remove(0);
		System.out.println(arr);

		// set() - doesn't change the size.
		arr.set(0, 12);
		System.out.println(arr);

		// isEmpty(), size()
		if (arr.isEmpty()) {
			System.out.println("Array is empty");
		} else {
			System.out.println("Array is not empty. Size is " + arr.size());
		}

		// contains()
		int number = 6;
		if (arr.contains(number)) {
			System.out.println("Array contains " + number);
		} else {
			System.out.println("Array doesn't contain " + number);
		}

		// clear()
		arr.clear();
		System.out.println("Array is empty: " + arr.isEmpty());
		System.out.println("Array size after clear() " + arr.size());

		// equals()
		List<String> s1 = new ArrayList<String>();
		List<String> s2 = new ArrayList<String>();
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2)); // s1 and s2 are defined to be equal
											// as they contain the same
											// elements, which are empty, in the
											// same order

	}
}

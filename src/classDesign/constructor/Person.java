package classDesign.constructor;

public class Person {
	/**
	 * Java permits you to redeclare a new method in the child class with the
	 * same or modified signature as the method in the parent class. This
	 * method in the child class is a separate and independent method, unrelated
	 * to the parent version’s method, so none of the rules for overriding
	 * methods are invoked.
	 * 
	 * @return
	 */

	private String getId() {
		return "name";
	}
}

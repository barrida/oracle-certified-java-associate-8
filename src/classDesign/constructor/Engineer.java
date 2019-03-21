package classDesign.constructor;

public class Engineer extends Person {
	/**
	 * If the getId() method in parent class was public or protected, this wouldn't compile
	 * @return
	 */
	private int getId() {
		return 2;
	}
}

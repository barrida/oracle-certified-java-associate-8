package classDesign.constructor;

public class Engineer extends Person {
	
	//if the getId() method in parent class was public or protected, this wouldn't compile 
	private int getId() {
		return 2;
	}
}

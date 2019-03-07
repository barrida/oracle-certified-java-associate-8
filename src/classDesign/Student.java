package classDesign;


/**
 *
 *	Abstract Class Definition Rules:
		1. Abstract classes cannot be instantiated directly.
		2. Abstract classes may be defined with any number, including zero, of abstract and nonabstract
		methods.
		3. Abstract classes may not be marked as private or final.
		4. An abstract class that extends another abstract class inherits all of its abstract methods
		as its own abstract methods.
		5. The first concrete class that extends an abstract class must provide an implementation
		for all of the inherited abstract methods.

	Abstract Method Definition Rules:
		1. Abstract methods may only be defined in abstract classes.
		2. Abstract methods may not be declared private or final.
		3. Abstract methods must not provide a method body/implementation in the abstract
		class for which is it declared.
		4. Implementing an abstract method in a subclass follows the same rules for overriding a
		method. For example, the name and signature must be the same, and the visibility of
		the method in the subclass must be at least as accessible as the method in the parent
		class
 *
 *	- Only public and abstract are permitted for a abstract class definition
	- Abstract method --> only in an abstract class, final is not allowed
	- A method may not be marked as both abstract and private
	- They are also fond of questions with methods marked as abstract for which an implementation is also defined
	- Subclass cannot reduce the visibility of the parent method
	- The key point is that the first class to extend the non-abstract class must implement all inherited abstract methods
 * @author suleyman.yildirim
 *
 */


public abstract class Student {
	public abstract void method();
//	 private abstract void method2(); //Compile error. Can only set a visibility modifier, one of public or protected
	public void method3(){};
}


/**
 * A concrete class that extends an abstract class must implement all inherited abstract methods
 * @author suleyman.yildirim
 *
 */
abstract class Animal {
	public abstract String getName();
}

abstract class BigCat extends Animal {
	public abstract void roar();
}

// Lion must implement all inherited abstract methods because of IS-A relationship: Lion --> BigCat --> Animal 
class Lion extends BigCat {
	public String getName() {
		return "Lion";
	}

	public void roar() {
		System.out.println("The Lion lets out a loud ROAR!");
	}
}

/**
 * A concrete subclass is not required to provide an implementation for an
 * abstract method if an intermediate abstract class provides the
 * implementation.
 */

abstract class Animal2 {
	public abstract String getName(); //it is no longer abstract by the time it reaches the Lion2 so it is not considered as abstract by Lion2
}

abstract class BigCat2 extends Animal {
	public String getName() { 
		return "BigCat";
	}

	public abstract void roar();
}

class Lion2 extends BigCat2 {
	public void roar() {
		System.out.println("The Lion lets out a loud ROAR!");
	}
}
package classDesign;

/**
 * Java object may be accessed using
 * 
 * (1) a reference with the same type as the object
 * 
 * (2) a reference that is a superclass of the object
 * 
 * (3) a reference that defines an interface that the object implements, either
 * directly or through a superclass
 * 
 * @author suleyman.yildirim
 *
 */

interface IFoo {
	int a = 5;
	boolean isInterfaceMethod();
}

class SuperClass {
	void foo() {
		System.out.println("SuperClass");
	}
}

class SubClass extends SuperClass implements IFoo {

	void foo() {
		System.out.println("SubClass");
	}

	@Override
	public boolean isInterfaceMethod() {
		return true;
	}
}

public class Polymorphism extends SuperClass {
	public static void main(String[] args) {

		/**
		 * 1. A reference with the same type as the object
		 * 
		 */
		SubClass subclass = new SubClass();
		subclass.foo();

		/**
		 * (2) a reference that is a superclass of the object
		 */

		SuperClass superClass = subclass;
		superClass.foo();

		/**
		 * (3) a reference that defines an interface that the object implements,
		 * either directly or through a superclass
		 */

		IFoo asd = new SubClass();
		System.out.println(asd.isInterfaceMethod());

	}
}
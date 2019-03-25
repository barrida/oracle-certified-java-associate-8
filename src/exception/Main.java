package exception;

import java.io.IOException;

import javax.xml.ws.WebServiceException;

/**
 * ### Differentiate between checked and unchecked exceptions. Unchecked
 * exceptions are also known as runtime exceptions and are subclasses of
 * java.lang.RuntimeException. All other subclasses of java.lang.Exception are
 * checked exceptions.
 * 
 * ### Understand the flow of a try statement. A try statement must have a catch
 * or a finally block. Multiple catch blocks are also allowed, provided no
 * superclass exception type appears in an earlier catch block than its
 * subclass. The finally block runs last regardless of whether an exception is
 * thrown.
 * 
 * ### Identify whether an exception is thrown by the programmer or the JVM.
 * Illegal ArgumentException and NumberFormatException are commonly thrown by
 * the programmer. Most of the other runtime exceptions are typically thrown by
 * the JVM.
 * 
 * ### Declare methods that declare exceptions. The throws keyword is used in a
 * method declaration to indicate an exception might be thrown. When overriding
 * a method, the method is allowed to throw fewer exceptions than the original
 * version.
 * 
 * 
 * ### Recognize when to use throw versus throws. The throw keyword is used when
 * you actually want to throw an exception—for example, throw new
 * RuntimeException(). The throws keyword is used in a method declaration.
 * 
 * @author suleyman.yildirim
 *
 */

class AnimalsOutForAWalk extends RuntimeException {
}

class ExhibitClosed extends RuntimeException {
}

class ExhibitClosedForLunch extends ExhibitClosed {
}

class NoMoreCarrotsException extends Exception {}

public class Main {

	private static void tomis() throws Exception {

		System.out.println("Tomis");
		throw new Exception();
	}

	private static void eatCarrot() throws NoMoreCarrotsException {
	}

	public static void main(String[] args)  {
		// System.out.println(s.substring(s.indexOf('I', 4))); //4
		// try {
		// foo();
		// } catch (Exception e) {
		// System.out.println(e);
		// System.out.println(e.getMessage());
		// e.printStackTrace();
		// }
		try {
			eatCarrot();
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}// DOES NOT COMPILE
		try {
			tomis();
			System.out.println("after Tomis");
			foo();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// system.exit()
		try {
			System.out.println("Before System.exit(0)");
			System.exit(0);
			System.out.println("After System.exit(0)");
		} finally {
			System.out.println("Finally does not run");
		}

		// invalid: super class should be caught last
		try {
			seeAnimal();
		} catch (ExhibitClosedForLunch e) {// first catch block
			System.out.print("try back later");
		} catch (ExhibitClosed e) {// second catch block
			System.out.print("not today");
		} catch (RuntimeException e) {

		} catch (Exception e) {

		}

		/** Compile error: super class should be caught last **/
		// try {
		// seeAnimal();
		// } catch (ExhibitClosed e) {// first catch block
		// System.out.print("try back later");
		// } catch (ExhibitClosedForLunch e) {// second catch block
		// System.out.print("not today");
		// }

		// RuntimeException is masked by Exception. So we need a new try catch
		// block
		try {
			throw new RuntimeException();
		} catch (RuntimeException e) {
			throw new RuntimeException();
		} finally {

			// So we need a new try catch block
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private static void seeAnimal() throws Exception {
		throw new Exception();

	}

	static void call() throws IOException {
		foo();
	}

	static void foo() throws IOException {
		throw new IOException("hoppaa");
	}

}

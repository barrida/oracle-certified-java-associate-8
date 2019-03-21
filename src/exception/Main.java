package exception;

import java.io.IOException;

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
public class Main {

	public static void main(String[] args) {
		 //      System.out.println(s.substring(s.indexOf('I', 4))); //4  
		try {
			foo();
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	static void call() throws IOException {
		foo();
	}

	static void foo() throws IOException {
		throw new IOException("hoppaa");
	}

}

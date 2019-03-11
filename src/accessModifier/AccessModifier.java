package accessModifier;

public class AccessModifier {
	public static void main(String[] args) {

		// The default accessibility is more restrictive than protected, but
		// less restrictive than private.

		// default members are only accessible within the class itself and from
		// other classes in the same package.

		// protected members are accessible from subclasses in any other
		// package as well.

		// private members are only accessible within the
		// class itself.

		// public > protected > package (or default) > private
	}
}

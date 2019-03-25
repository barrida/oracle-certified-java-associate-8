package equals;

import java.util.ArrayList;
import java.util.List;

import coreapi.string.StringFunctions;
import coreapi.string.StringManipulation;

public class Main {

	public static void main(String[] args) {
		

		//object equality
		StringFunctions s1 = new StringFunctions();
		StringFunctions s2 = new StringFunctions();
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); //false
		
		//Stringbuilder
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		System.out.println(sb1.equals(sb2)); //false
		
		//String	
		String str = "Java"; // Use string pool	
		String str2 = new String("Java"); // don't use string pool and create object
		System.out.println(str == str2); //false
		System.out.println(str.equals(str2)); //true

		//Arraylist
		List one = new ArrayList<Integer>();
		List<Integer> two = new ArrayList<>();
		one.add(1);
		one.add(2);
		two.add(2);
		two.add(1);
		System.out.println(one == two); //false
		System.out.println(one.equals(two)); //false order of Arraylist elements are important!
		two.remove(0);
		two.add(2);
		System.out.println(one == two); //false
		System.out.println(one.equals(two)); //true order of Arraylist elements are important!
	
		List<String> string1 = new ArrayList<String>();
		List<String> string2 = new ArrayList<String>();
		System.out.println(string1 == string2); // false
		System.out.println(string1.equals(string2)); // s1 and s2 are defined to be equal
											// as they contain the same
											// elements, which are empty, in the
											// same order

}

}

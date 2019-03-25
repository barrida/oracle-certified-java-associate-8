package arrays;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		int [] a =  {1,2}; 
		int [] b = new int [] {1,2};
		int c [] = new int [] {1,2,3};
		int d [] = new int [5]; 
				
		System.out.println("before b=a:\t" + a.equals(b)); // checks reference equality	
		System.out.println("a: " + a); // 
		System.out.println("b: " + b); //
		System.out.println("a == b ? " + (a == b));
		
		b = a;
		
		System.out.println("after b=a:\t" + a.equals(b)); // checks reference equality
		System.out.println("a: " + a); // 
		System.out.println("b: " + b); //
		System.out.println("a == b ? " + (a == b));
		
		String [] s = new String[]{"22","234"};
		String [] s2 = {"22", "234"};
		System.out.println(s.equals(s2));
		
		Integer i = new Integer(2);
		Integer i2 = new Integer(2);
		System.out.println("i.equals(i2): "+ i.equals(i2));
		
		
		String[] strings = { "10", "9", "100" };
		Arrays.sort(strings);
		for (String string : strings)
		System.out.println(string + " ");
		
		String[] str = { "stringValue" };
		Object[] objects = str;
		String[] againStrings = (String[]) objects;
		againStrings[0] = "asd";
		List<String> asd = Arrays.asList(againStrings);
		//asd.add("asdas"); // compile error
		//asd.add("fdsfs");
		

		//binary search
		int f [] = new int [] {1,4,6,7,12, 14};
		System.out.println(Arrays.binarySearch(f, 13));
		int g[] = {5,3,1};
		System.out.println("Unpredictable: "+ Arrays.binarySearch(g, 1));
		
		
		int [][] dar = new int[4][];
		
	}

}
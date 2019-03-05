package coreapi.wrapper;

public class Main {

	public static void main(String[] args) {
	     // Wrapper Classes
	     int a = 5, b = 3, k = 0;
	     int m = 0;
	     k = new Integer(a) + new Integer(b); //
	     System.out.println(k);
	     
	     k = new Integer(a) + b;
	     System.out.println(k);
	     
	     k = b + new Integer(a);
	     System.out.println(k);
	     
	     m = new Integer(a) + new Integer(b); //
	     System.out.println(m);
	}

}

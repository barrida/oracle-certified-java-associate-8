package basics;

public class ArrayClassOutput {

	public String name;
	public int dob;
	
	public ArrayClassOutput(String name, int dob) {
		this.name = name;
		this.dob = dob;
	}
	
	public static void main(String[] args) {
		ArrayClassOutput[] members = { 
				new ArrayClassOutput("Omur", 1952),
				new ArrayClassOutput("Fatma", 1953),
				new ArrayClassOutput("Canan", 1979),	
				new ArrayClassOutput("Suleyman", 1982)				
		};
		
		System.out.println(members); // [Lbasics.Family;@6d06d69c Lpackage name.class name; hashcode of the class
		System.out.println(members[1]); // basics.Family@7852e922 package name.class name; hashcode of the class
		System.out.println(members[1].dob); //2
		
		double [] d = new double[]{1,2};
		int [] a = new int[]{1,2};
		String [] s = new String[]{"22","234"};
		System.out.println(a);
		System.out.println(d);
		System.out.println(s);
	}
}
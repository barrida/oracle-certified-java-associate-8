package initialization;

class OverloadingTest {

	void m1(int x) {
		System.out.println("m1 int");
	}

	void m1(double x) {
		System.out.println("m1 double");
	}

	void m1(String x) {
		System.out.println("m1 String");
	}

}

public class InitTest {
	private int j;

	public InitTest() {
		s1 = sM1("1");
	}

	double ma(int a) {
		return a * 10 / 4.0;
	}

	static String s1 = sM1("a");
	String s3 = sM1("2");

	{
		s1 = sM1("3");
	}

	static {
		s1 = sM1("b");
	}

	static String s2 = sM1("c");

	String s4 = sM1("4");

	public static void main(String args[]) {
		InitTest it = new InitTest();

		OverloadingTest ot = new OverloadingTest();
		ot.m1(1f);
		int x = 0;
		for (int i = 0; i < 0; i++)
			System.out.println();

		do{ x = 3; } while(true);
	}

	private static String sM1(String s) {
		int i = 0;
		int[] iA = { 10, 20 };
		iA[i] = i;
		iA[i] = 30;
		System.out.println("" + iA[0] + " " + iA[1] + "  " + i);
		// System.out.println(s);
		return s;
	}
}
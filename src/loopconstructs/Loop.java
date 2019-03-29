package loopconstructs;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("a"+63);
		System.out.println('a'+ "asd"+ 234);
		System.out.println(1  +2 + "3");
		System.out.println(4 + 1.0); 
		int asdasd = 'a' + 1;
		System.out.println(asdasd );
	}

	void loop() {
		int c = 0;
		JACK: while (c < 8) {
			JILL: if (c > 3)
				break JILL;
			else
				c++;

		}

		//if (c == 0)
			//break JILL; // compile error

	}

	public void method1(int i) {
		int j = (i * 30 - 2) / 100;

		POINT1: for (; j < 10; j++) {
			boolean flag = false;
			while (!flag) {
				if (Math.random() > 0.5)
					break POINT1;
			}
		}
		while (j > 0) {
			System.out.println(j--);
			//if (j == 4)
				//break POINT1; // compile error
		}
	}

}

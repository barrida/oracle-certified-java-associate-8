package classDesign;

/**
 * 
 * @author suleyman.yildirim
 *
 */
public class OverloadvsOverriding {

	public int setVar(int a, int b, float c) {
		return 0;
	}

	// won't compile
	// public float setVar(int a, int b, float c) {
	// return 0.0;
	// }

	//order of parameter is different, so it compliles
	public int setVar(int a, float b, int c) {
		return this.setVar(a, c, b);
	}

	// return type doesn't matter
	public float setVar(int a) {
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

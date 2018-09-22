package basics;

public class GlobalVsLocalVariable {

	String global = "111";
	
	public int parse(String arg) {
		int value = 0;
		try {
			String global = arg;
			value = Integer.parseInt(global);
		} catch (Exception e) {
			System.out.println(e.getClass());
		}
		System.out.print(global + " " + value + " ");
		return value;
	}

	public static void main(String[] args) {
		GlobalVsLocalVariable ct = new GlobalVsLocalVariable();
		//ct.parse("333");
		System.out.print(ct.parse("333"));
	}

}

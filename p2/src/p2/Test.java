package p2;

public class Test {
	
	public static void main(String[] args) {
		
		String x = "a"+"a";
		String y = x + "a";
		String z = "aa";
		// String y = new StringBuilder(x).append("a").toString();
		
		System.out.println(x==y);
		System.out.println(x==z);
		//第一次修改
		//第二次修改
		
	}

}

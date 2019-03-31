package cn.com.timbrian;

public class StaticClassA {
	
	static {
		i = 1;
	}
	
	static { 
		@SuppressWarnings("unused")
		int i = 3;
	}
	
	static int i;
	
	public static void main(String[] args) {
		new StaticClassA();
	}
}

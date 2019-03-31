package cn.com.timbrian;

public class StaticClassA {
	
	static {
		i = 1;
	}
	
	static { 
		int i = 3;
	}
	
	static int i;
	
	public static void main(String[] args) {
		new StaticClassA();
	}
}

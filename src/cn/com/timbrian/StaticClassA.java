package cn.com.timbrian;

import java.math.BigDecimal;

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
		//new StaticClassA();
		System.out.println(2.00 - 1.10);
		System.out.println(new BigDecimal(2.00).subtract(new BigDecimal(1.10)));
		System.out.println(String.format("%.2f", 2.00 - 1.10));
		System.out.printf("%.2f%n", 2.00 - 1.10);
		System.out.println((200 - 110) + "cents");
	}
}

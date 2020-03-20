package cn.com.timbrian;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test{
	
	public static void main(String[] args) {
		
		//listTest();
		
	}
	
	public static List<Integer> show(Integer i){
		List<Integer> list = new ArrayList<Integer>();
		return list;
	}

	public static void listTest() {
		String str[] = {"aa","bb","cc","dd","ee","ff"};
		List<String[]> list1 = new ArrayList<String[]>();
		List<String[]> list2 = new LinkedList<String[]>();
		List<String[]> list3 = new ArrayList<String[]>();
		List<String[]> list4 = new LinkedList<String[]>();
		
		long startTime1 = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			list1.add(str);
		}
		System.out.println((Long)System.currentTimeMillis() - startTime1);
		long startTime2 = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			list2.add(str);
		}
		System.out.println((Long)System.currentTimeMillis() - startTime2);
		
		long startTime3 = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			list3.add(0,str);
		}
		System.out.println((Long)System.currentTimeMillis() - startTime3);
		long startTime4 = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			list4.add(0,str);
		}
		System.out.println((Long)System.currentTimeMillis() - startTime4);
	}

}
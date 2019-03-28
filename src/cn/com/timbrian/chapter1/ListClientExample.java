package cn.com.timbrian.chapter1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Tim Brian
 * @since 2019年3月28日下午7:54:55
 * @description TODO
 */
public class ListClientExample {
	
	private List<Object> list;

	public List<Object> getLinkedList() {
		this.list = new LinkedList<>();
		return list;
	}
	
	public List<Object> getArrayList() {
		this.list = new ArrayList<>();
		return list;
	}
	
	public static void main(String strs[]) {
		ListClientExample clientExample = new ListClientExample();
		List<Object> linkedList = clientExample.getLinkedList();
		List<Object> arrayList = clientExample.getArrayList();
		List<Object> linkedListLast = clientExample.getLinkedList();
	
		System.out.println(getArrayListTime(arrayList));
		System.out.println(getArrayListTime(linkedList));
		System.out.println(getLinkedListLastTime(linkedListLast));
	}
	
	/**
	 * @author Tim Brian
	 * @since 2019年3月28日下午8:17:58
	 * @description ArrayList从开始添加元素
	 * @param arrayList
	 * @return
	 */
	public static Long getArrayListTime(List<Object> arrayList) {
		Long startTime = System.currentTimeMillis();
		int i = 0;
		do {
			arrayList.add(i);
			i++;
		} while (i <= 1000000);
		return System.currentTimeMillis() - startTime;
	}
	
	/**
	 * @author Tim Brian
	 * @since 2019年3月28日下午8:16:48
	 * @description ArrayList从开始添加元素
	 * @param linkedList
	 * @return
	 */
	public static Long getLinkedListTime(List<Object> linkedList) {
		Long startTime = System.currentTimeMillis();
		int i = 0;
		do {
			linkedList.add(i);
			i++;
		} while (i <= 1000000);
		return System.currentTimeMillis() - startTime;
	}
	
	/**
	 * @author Tim Brian
	 * @since 2019年3月28日下午8:23:47
	 * @description ArrayList从尾部添加数据，发现效率和ArrayList从开始添加数据的时间复杂度是一样的
	 * @param linkedList
	 * @return
	 */
	public static Long getLinkedListLastTime(List<Object> linkedList) {
		Long startTime = System.currentTimeMillis();
		int i = 0;
		do {
			linkedList.add(linkedList.size(),i);
			i++;
		} while (i <= 1000000);
		return System.currentTimeMillis() - startTime;
	}
}

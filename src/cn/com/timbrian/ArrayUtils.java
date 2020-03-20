package cn.com.timbrian;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @ClassName: ArrayUtils
 * @Description: TODO
 * @author: TimBrian
 * @date: Mar 6, 2020 2:17:47 PM
 */
public class ArrayUtils {
	
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
	    list1.add("A");
	    list1.add("B");

	    List<String> list2 = new ArrayList<String>();
	    list2.add("B");
	    list2.add("C");
		//交集
	    System.out.println(list1.retainAll(list2));
	    System.out.println(list1);
	    //差集
		//System.out.println(test());
	}
	
	public static boolean test(){
		List<String> list1 = new ArrayList<String>();
	    list1.add("A");
	    list1.add("B");

	    List<String> list2 = new ArrayList<String>();
	    list2.add("B");
	    list2.add("C");
	    
	    //差集 求List1中有的但是List2中没有的元素
	    boolean removeAll = list1.removeAll(list2);
	    
	    return  removeAll;
	}
	
	/**
	 * 
	 * @Title: ArrayUtils
	 * @Description: 两个数组比较，求交集 
	 * @author TimBrian
	 * @since 2019年11月26日下午4:58:05
	 * @param strOne
	 * @param strTwo
	 * @return
	 * @throws
	 */
	public static Object[] intersection(Object[] strOne, Object[] strTwo) {
		if (ArrayUtils.isEmpty(strOne) || ArrayUtils.isEmpty(strTwo)) {
			return new Object[0];
		}
		HashSet<Object> set = new HashSet<>(Arrays.asList(strOne));
		set.retainAll(Arrays.asList(strTwo));
		return set.toArray();
	}

	/**
	 * @Title: ArrayUtils
	 * @Description:  两个数组比较，求差集
	 * @author TimBrian
	 * @since 2019年11月26日下午4:58:11
	 * @param strOne
	 * @param strTwo
	 * @return
	 * @throws
	 */
	public static Object[] differenceSet(Object[] strOne, Object[] strTwo) {
		if (ArrayUtils.isEmpty(strOne) || ArrayUtils.isEmpty(strTwo)) {
			return new Object[0];
		}
		HashSet<Object> set = new HashSet<>(Arrays.asList(strOne));
		set.removeAll(new HashSet<>(Arrays.asList(strTwo)));
		return set.toArray();
	}

	/**
	 * @Title: ArrayUtils
	 * @Description: 两个数组比较，求并集（去重）
	 * @author TimBrian
	 * @since 2019年11月26日下午4:58:18
	 * @param strOne
	 * @param strTwo
	 * @return
	 * @throws
	 */
	public static Object[] union(Object[] strOne, Object[] strTwo) {
		if (ArrayUtils.isEmpty(strOne) && ArrayUtils.isEmpty(strTwo)) {
			return new Object[0];
		} else if (!ArrayUtils.isEmpty(strOne) && ArrayUtils.isEmpty(strTwo)) {
			return strOne;
		} else if (ArrayUtils.isEmpty(strOne) && !ArrayUtils.isEmpty(strTwo)) {
			return strTwo;
		}
		HashSet<Object> set = new HashSet<>(Arrays.asList(strOne));
		set.addAll(new HashSet<>(Arrays.asList(strTwo)));
		return set.toArray();
	}
	
	/**
	 * @Title: ArrayUtils
	 * @Description: true为空，false不为空
	 * @author TimBrian
	 * @since 2019年11月26日下午5:00:49
	 * @param obj
	 * @return
	 * @throws
	 */
	public static boolean isEmpty(Object[] obj) {
		if (obj == null || obj.length == 0) {
			return true;
		}
		return false;
	}

}

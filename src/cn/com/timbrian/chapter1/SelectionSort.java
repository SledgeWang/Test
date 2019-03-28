package cn.com.timbrian.chapter1;

import java.util.Arrays;

/**
 * @author Tim Brian
 * @since 2019年3月28日下午8:29:07
 * @description TODO
 */
public class SelectionSort {

	/**
	 * 交换下标i和下标j处的元素
	 */
	public static void swapElements(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	/**
	 * @author Tim Brian
	 * @since 2019年3月28日下午8:44:35
	 * @description 找到最小值的下标，从开始下标开始到数组的最后位置
	 * @param array
	 * @param start
	 * @return
	 */
	public static int indexLowest(int[] array, int start) {
		int lowestIndex = start;
		for (int i = start; i < array.length; i++) {
			if (array[i] < array[lowestIndex]) {
				lowestIndex = i;
			}
		}
		return lowestIndex;
	}
	
	/**
	 * 用选择排序对元素排序
	 */
	public static void selectionSort(int array[]) {
		for (int i = 0; i < array.length; i++) {
			int j = indexLowest(array, i);
			swapElements(array, i, j);
		}
	}
	public static void main(String[] args) {
		int sum[] = {1,2,5,2,1};
		selectionSort(sum);
		System.out.println(Arrays.toString(sum));
	}

}

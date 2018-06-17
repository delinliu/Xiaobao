package sort;

import gui.tools.MyArray;

/**
 * @author xiaobao
 */
public class MergeSort_xiaobao {
	public static void sort(MyArray array, int startindex, int endindex) {
		if (startindex >= endindex) {
			return;
		}
		int midindex = (startindex + endindex) / 2;
		sort(array, startindex, midindex);
		MyArray temp = new MyArray(endindex - startindex + 1);
		int j = midindex + 1;
		for (int i = startindex; i <= midindex; i++) {
			if (i <= midindex && j <= endindex) {
				if (array.get(i) > array.get(j)) {
					temp.set(i, array.get(i));
				} else {
					temp.set(i, array.get(j));
					j++;
				}
			} else if (i > midindex) {
				temp.set(i, array.get(j));
				j++;
			} else if (j > endindex) {
				temp.set(i, array.get(i));
			}
		}
		for (int x = startindex; x <= endindex; x++) {
			array.set(x, temp.get(x));
		}
	}
}

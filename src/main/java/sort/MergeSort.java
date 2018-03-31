package sort;

import gui.tools.MyArray;

/**
 * @author delin
 */
public class MergeSort implements Sort {

    public void sort(MyArray arr) {
        sort(arr, 0, arr.length() - 1);
    }

    private void sort(MyArray arr, int startIndex, int endIndex) {
        if (startIndex == endIndex) {
            return;
        }
        int midIndex = (startIndex + endIndex) / 2;
        sort(arr, startIndex, midIndex);
        sort(arr, midIndex + 1, endIndex);
        int[] tmpArr = new int[endIndex - startIndex + 1];
        int index = 0;
        int i = startIndex;
        int j = midIndex + 1;
        while (i <= midIndex || j <= endIndex) {
            if (i <= midIndex && j <= endIndex) {
                int n1 = arr.get(i);
                int n2 = arr.get(j);
                if (n1 > n2) {
                    tmpArr[index++] = n1;
                    i++;
                } else {
                    tmpArr[index++] = n2;
                    j++;
                }
            } else if (i <= midIndex) {
                tmpArr[index++] = arr.get(i++);
            } else {
                tmpArr[index++] = arr.get(j++);
            }
        }
        for (i = 0; i < index; i++) {
            arr.set(startIndex + i, tmpArr[i]);
        }
    }
}

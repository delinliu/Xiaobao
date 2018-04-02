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
        merge(arr, startIndex, midIndex, endIndex);
    }

    static void merge(MyArray arr, int startIndex, int midIndex, int endIndex) {
        int[] tmpArr = new int[endIndex - startIndex + 1];
        int index = 0;
        int i = startIndex;
        int j = midIndex + 1;
        while (i <= midIndex || j <= endIndex) {
            if (i <= midIndex && j <= endIndex) {
                // Compare two largest number in queue 1 and queue 2.
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
                // Queue 2 is empty. Copy queue 1 to tempArr.
                tmpArr[index++] = arr.get(i++);
            } else {
                // Queue 1 is empty. Copy queue 2 to temparr.
                tmpArr[index++] = arr.get(j++);
            }
        }

        // Copy tempArr numbers to MyArray
        for (i = 0; i < index; i++) {
            arr.set(startIndex + i, tmpArr[i]);
        }
    }
}

package sort;

import gui.tools.MyArray;

public class MergeSortNoRec implements Sort {

    @Override
    public void sort(MyArray myArr) {
        int length = myArr.length();
        int currChildLength = 1;
        while (currChildLength < length) {
            for (int i = 0; i < length; i += currChildLength * 2) {
                int startIndex = i;
                int midIndex = i + currChildLength - 1;
                int endIndex = i + currChildLength * 2 - 1;
                if (midIndex + 1 < length) {
                    if (endIndex >= length) {
                        endIndex = length - 1;
                    }
                    MergeSort.merge(myArr, startIndex, midIndex, endIndex);
                }
            }
            currChildLength *= 2;
        }
    }

}

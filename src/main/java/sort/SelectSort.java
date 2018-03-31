package sort;

import gui.tools.MyArray;

/**
 * @author xiaobao
 */
public class SelectSort {

    public static void sort(MyArray myArr) {
        for (int i = 0; i < myArr.length(); i++) {
            int max = indexOfMaxNumber(myArr, i);
            exchange(i, max, myArr);
        }
    }

    /**
     * 不修改myArr里的数，找到从下标为startIndex到最后一个数之间的最大值的下标，返回 
     */
    public static int indexOfMaxNumber(MyArray myArr, int startIndex) {
        int index = startIndex;
        for (int i = startIndex + 1; i < myArr.length(); i++) {
            if (myArr.get(i) > myArr.get(index)) {
                index = i;
            }
        }
        return index;
    }

    /**
     * 交换数组里的两个数
     */
    public static void exchange(int index1, int index2, MyArray myArr) {
        int numberOfIndex1 = myArr.get(index1);
        int numberOfIndex2 = myArr.get(index2);
        myArr.set(index1, numberOfIndex2);
        myArr.set(index2, numberOfIndex1);
    }

}

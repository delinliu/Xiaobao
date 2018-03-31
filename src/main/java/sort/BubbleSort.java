package sort;

import gui.tools.MyArray;

/**
 * @author delin
 */
public class BubbleSort {

    public static void sort(MyArray myArr) {

        for (int j = myArr.length() - 1; j >= 0; j--) {
            for (int i = 0; i < j; i++) {
                int number1 = myArr.get(i);
                int number2 = myArr.get(i + 1);
                if (number1 < number2) {
                    myArr.set(i, number2);
                    myArr.set(i + 1, number1);
                }
            }
        }
    }
}

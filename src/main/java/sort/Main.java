package sort;

import gui.tools.MyArray;

public class Main {

    public static void main(String[] arg) {
        MyArray myArr = new MyArray(500);
        MyArray myArr2 = new MyArray(200);
        new Thread() {
            @Override
            public void run() {
                SelectSort.sort(myArr);
            }
        }.start();
        BubbleSort.sort(myArr2);
    }
}

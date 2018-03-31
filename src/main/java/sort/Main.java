package sort;

import gui.tools.MyArray;

public class Main {

    public static void main(String[] arg) {
        int amount = 500;
        startSort(amount, new SelectSort());
        startSort(amount, new BubbleSort());
        startSort(amount, new MergeSort());
    }

    private static void startSort(int amount, Sort sort) {
        MyArray myArr = new MyArray(amount, sort.getClass().getSimpleName());
        new Thread() {
            @Override
            public void run() {
                sort.sort(myArr);
            }
        }.start();
    }
}

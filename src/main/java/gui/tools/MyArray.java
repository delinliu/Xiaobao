package gui.tools;

/**
 * @author delin
 */
public class MyArray {

    private int[] arr;

    public MyArray(int n) {
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        new ArrayGUI(arr);
    }

    public int length() {
        return arr.length;
    }

    public void set(int i, int val) {
        sleep(1);
        arr[i] = val;
    }

    public int get(int i) {
        sleep(1);
        return arr[i];
    }

    private void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {

        }

    }
}

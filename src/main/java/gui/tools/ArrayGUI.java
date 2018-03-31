package gui.tools;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author delin
 */
class ArrayGUI {

    private int[] arr;
    private int min;
    private int max;
    private Map<Integer, Color> colorMap;

    public ArrayGUI(int[] arr) {
        this.arr = arr;
        min = max = arr[0];
        Set<Integer> set = new HashSet<>();
        for (int a : arr) {
            min = Math.min(min, a);
            max = Math.max(max, a);
            set.add(a);
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        int red = 160;
        int green = 90;
        int blue = 60;
        int dRed = -10;
        int dGreen = 15;
        int dBlue = 20;
        colorMap = new HashMap<>();
        for (int number : list) {
            if (!colorMap.containsKey(number)) {
                colorMap.put(number, new Color(red, green, blue));
                red += dRed;
                if (red < 0 || red >= 256) {
                    red -= 2 * dRed;
                    dRed = -dRed;
                }
                green += dGreen;
                if (green < 0 || green >= 256) {
                    green -= 2 * dGreen;
                    dGreen = -dGreen;
                }
                blue += dBlue;
                if (blue < 0 || blue >= 256) {
                    blue -= 2 * dBlue;
                    dBlue = -dBlue;
                }
            }
        }

        ArrayPanel arrayPanel = new ArrayPanel();
        JFrame frame = new JFrame("Array Panel");
        frame.setSize(3000, 300);
        frame.setBackground(Color.white);
        frame.setContentPane(arrayPanel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(10);
                        arrayPanel.repaint();
                        arrayPanel.updateUI();
                    } catch (Exception e) {

                    }
                }
            }
        }.start();
    }

    class ArrayPanel extends JPanel {
        private static final long serialVersionUID = 1L;

        public ArrayPanel() {
            setBackground(Color.white);
            setVisible(true);
        }

        private Color color = new Color(100, 150, 100);

        @Override
        public void paintComponent(Graphics g) {
            int TOP_SPACE = 50;
            int BOTTOM_SPACE = 5;
            int EVERY_SPACE = 1;
            int MAX_EVERY_WIDTH = 50;
            int MIN_EVERY_WIDTH = 1;

            int w = this.getWidth();
            int h = this.getHeight() - TOP_SPACE - BOTTOM_SPACE;
            double everyW = (double) w / arr.length;
            double everyH = (double) h / max;

            everyW = Math.min(everyW, MAX_EVERY_WIDTH);
            everyW = Math.max(everyW, MIN_EVERY_WIDTH);
            g.clearRect(0, 0, getWidth(), getHeight());

            g.fillRect(0, h + TOP_SPACE, w, BOTTOM_SPACE);

            g.setColor(color);
            for (int i = 0; i < arr.length; i++) {
                int startX = (int) (i * everyW);
                int height = (int) (everyH * arr[i]);
                g.setColor(colorMap.get(arr[i]));
                g.fillRect(startX, h - height + TOP_SPACE, (int) everyW - EVERY_SPACE, height);
            }
        }
    }
}

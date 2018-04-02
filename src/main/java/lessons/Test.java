package lessons;

public class Test {

    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 0);
        Point p3 = new Point(0, 1);
        Triangle triangle = new Triangle(p1, p2, p3);
        System.out.println(Triangle.getAmountOfPoints());
        System.out.println(triangle.zhouchangpingfang());
        p1.setX(-1);
        System.out.println(triangle.zhouchangpingfang());
    }
}

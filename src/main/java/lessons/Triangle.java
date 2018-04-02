package lessons;

public class Triangle {

    static int AMOUNT_OF_POINTS = 3;

    Point p1;
    Point p2;
    Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public int zhouchangpingfang() {
        double result = Math.pow((p1.getX() - p2.getX()), 2) + Math.pow((p1.getY() - p2.getY()), 2)
                + Math.pow((p1.getX() - p3.getX()), 2) + Math.pow((p1.getY() - p3.getY()), 2)
                + Math.pow((p3.getX() - p2.getX()), 2) + Math.pow((p3.getY() - p2.getY()), 2);
        return (int) result;
    }

    public static int getAmountOfPoints() {
        return AMOUNT_OF_POINTS;
    }
}

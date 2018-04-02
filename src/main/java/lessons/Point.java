package lessons;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        setPoint(x, y);
    }

    public void setPoint(int x, int y) {
        setX(x);
        setY(y);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

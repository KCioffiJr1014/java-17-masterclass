package section3.point;

public class Point {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt((double) (-x) * (-x) + (-y) * (-y));
    }

    public double distance(int x, int y) {
        return Math.sqrt((double) (x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    public double distance(Point point) {
        return Math.sqrt((double) (point.getX() - this.x) * (point.getX() - this.x) + (point.getY() - this.y) * (point.getY() - this.y));
    }
}

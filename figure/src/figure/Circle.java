package figure;

public class Circle extends Figure {
    private final double RADIUS;
    private double center_x;
    private double center_y;

    public Circle(double radius, double center_x, double center_y) {
        RADIUS = radius;
        this.center_x = center_x;
        this.center_y = center_y;
    }

    public double getCenter_x() {
        return center_x;
    }

    public void setCenter_x(double center_x) {
        this.center_x = center_x;
    }

    public double getCenter_y() {
        return center_y;
    }

    public void setCenter_y(double center_y) {
        this.center_y = center_y;
    }

    public double getRadius() {
        return RADIUS;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "RADIUS=" + RADIUS +
                ", center_x=" + center_x +
                ", center_y=" + center_y +
                '}';
    }

    @Override
    public double getSquare() {
        return Math.PI*Math.pow(RADIUS,2);
    }
}

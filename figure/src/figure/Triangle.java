package figure;

public class Triangle extends Figure {

    private double angle_x;
    private double angle_y;
    private final double HEIGHT_LEG;
    private final double BASE_LEG;

    public Triangle(double angle_x, double angle_y, double height_leg, double base_leg) {
        this.angle_x = angle_x;
        this.angle_y = angle_y;
        HEIGHT_LEG = height_leg;
        BASE_LEG = base_leg;
    }

    public double getAngle_x() {
        return angle_x;
    }

    public void setAngle_x(double angle_x) {
        this.angle_x = angle_x;
    }

    public double getAngle_y() {
        return angle_y;
    }

    public void setAngle_y(double angle_y) {
        this.angle_y = angle_y;
    }

    public double getHEIGHT_LEG() {
        return HEIGHT_LEG;
    }

    public double getBASE_LEG() {
        return BASE_LEG;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "angle_x=" + angle_x +
                ", angle_y=" + angle_y +
                ", HEIGHT_LEG=" + HEIGHT_LEG +
                ", BASE_LEG=" + BASE_LEG +
                '}';
    }

    @Override
    public double getSquare() {
        return 0.5*HEIGHT_LEG*BASE_LEG;
    }
}

package figure;

public class Rectangle extends Figure {
    private double left_x;
    private double top_y;

    private final double LEN_X;
    private final double LEN_Y;

    public Rectangle(double left_x, double top_y,
                     double len_x, double len_y) {
        this.left_x = left_x;
        this.top_y = top_y;
        LEN_X = len_x;
        LEN_Y = len_y;
    }

    public double getLeft_x() {
        return left_x;
    }

    public void setLeft_x(double left_x) {
        this.left_x = left_x;
    }

    public double getTop_y() {
        return top_y;
    }

    public void setTop_y(double top_y) {
        this.top_y = top_y;
    }

    @Override
    public double getSquare() {
        return LEN_X*LEN_Y;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "left_x=" + left_x +
                ", top_y=" + top_y +
                ", LEN_X=" + LEN_X +
                ", LEN_Y=" + LEN_Y +
                '}';
    }
}

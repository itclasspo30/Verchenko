package triangle;

public class Triangle {

    private double x_one;
    private double y_one;

    private double x_two;
    private double y_two;

    private double x_three;
    private double y_three;

    public Triangle(double x_one, double y_one, double x_two, double y_two, double x_three, double y_three) {
        this.x_one = x_one;
        this.y_one = y_one;
        this.x_two = x_two;
        this.y_two = y_two;
        this.x_three = x_three;
        this.y_three = y_three;
    }

    public double getX_one() {
        return x_one;
    }

    public void setX_one(double x_one) {
        this.x_one = x_one;
    }

    public double getY_one() {
        return y_one;
    }

    public void setY_one(double y_one) {
        this.y_one = y_one;
    }

    public double getX_two() {
        return x_two;
    }

    public void setX_two(double x_two) {
        this.x_two = x_two;
    }

    public double getY_two() {
        return y_two;
    }

    public void setY_two(double y_two) {
        this.y_two = y_two;
    }

    public double getX_three() {
        return x_three;
    }

    public void setX_three(double x_three) {
        this.x_three = x_three;
    }

    public double getY_three() {
        return y_three;
    }

    public void setY_three(double y_three) {
        this.y_three = y_three;
    }

    public double getSideA(){
        return (Math.sqrt(Math.pow(x_one-x_two,2)+Math.pow(y_one-y_two,2)));
    }

    public double getSideB(){
        return(Math.sqrt(Math.pow(x_two-x_three,2)+Math.pow(y_two-y_three,2)));
    }

    public double getSideC(){
        return(Math.sqrt(Math.pow(x_one-x_three,2)+Math.pow(y_one-y_three,2)));
    }

    public boolean existTriangle(){

        if(getSideA()>=getSideB()+getSideC()||getSideB()>=getSideA()+getSideC()||
                getSideC()>=getSideA()+getSideB()){
            return false;
        }
        else{
            return true;
        }
    }

    public double squareTriangle(){
        return (0.5*(x_one-x_three)*(y_two-y_three)-0.5*(x_two-x_three)*(y_one-y_three));
    }

    public double perimeterTriangle(){
        return (getSideA()+getSideB()+getSideC());
    }

}

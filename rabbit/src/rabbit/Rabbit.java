package rabbit;

import java.util.Objects;

public class Rabbit {

    private String name;
    private double weight;
    private String eyeColor;
    private String woolColor;

    public Rabbit(String name, double weight, String eyeColor, String woolColor) {
        this.name = name;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.woolColor = woolColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getWoolColor() {
        return woolColor;
    }

    public void setWoolColor(String woolColor) {
        this.woolColor = woolColor;
    }

    public Rabbit(Rabbit rabbit){
        this(rabbit.getName(),rabbit.getWeight(),rabbit.getEyeColor(),rabbit.getWoolColor());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rabbit rabbit = (Rabbit) o;
        return Double.compare(rabbit.weight, weight) == 0 &&
                Objects.equals(name, rabbit.name) &&
                Objects.equals(eyeColor, rabbit.eyeColor) &&
                Objects.equals(woolColor, rabbit.woolColor);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, weight, eyeColor, woolColor);
    }

    @Override
    public String toString() {
        return "Rabbit{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", eyeColor='" + eyeColor + '\'' +
                ", woolColor='" + woolColor + '\'' +
                '}';
    }

    public static double getAverageWeight(Rabbit a,Rabbit b){
        return ((a.getWeight()+b.getWeight())/2);
    }
}

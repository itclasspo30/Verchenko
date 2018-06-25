package thing_package;

import java.util.Objects;

public class Thing {
    private TypeMaterial material;
    private TypeSize size;
    private String color;
    private Producer producer;
    private double cost;

    public Thing(TypeMaterial material, TypeSize size, String color, String nameProducer, double cost) {
        this.material = material;
        this.size = size;
        this.color = color;
        this.producer = new Producer(nameProducer);
        this.cost = cost;
    }

    public static class Producer{
        private String name;

        public Producer(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Producer{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public enum TypeMaterial{
        COTTON, WOOL, ELASTAN, SYNTHETICS;
    }

    public enum TypeSize{
        XS,S,L,XL,XXL,XXXL;
    }

    public TypeMaterial getMaterial() {
        return material;
    }

    public void setMaterial(TypeMaterial material) {
        this.material = material;
    }

    public TypeSize getSize() {
        return size;
    }

    public void setSize(TypeSize size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void costRed(){
        setCost(getCost()/2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Thing thing = (Thing) o;
        return Double.compare(thing.cost, cost) == 0 &&
                material == thing.material &&
                size == thing.size &&
                Objects.equals(color, thing.color) &&
                Objects.equals(producer, thing.producer);
    }

    @Override
    public int hashCode() {

        return Objects.hash(material, size, color, producer, cost);
    }

    @Override
    public String toString() {
        return "Thing{" +
                "material=" + material +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", producer=" + producer +
                ", cost=" + cost +
                '}';
    }
}

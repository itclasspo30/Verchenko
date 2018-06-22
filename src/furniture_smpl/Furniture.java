package furniture_smpl;

import java.util.Objects;

public abstract class Furniture implements ColorFurniture {

    private String name;

    public Furniture(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Furniture furniture = (Furniture) o;
        return Objects.equals(name, furniture.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "name='" + name + '\'' +
                '}';
    }

    public abstract double getCostWithDiscount();
}

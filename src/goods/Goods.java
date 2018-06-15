package goods;

public abstract class Goods {

    private String name;
    private double cost;
    private int discount;

    public Goods(String name, double cost, int discount) {
        this.name = name;
        this.cost = cost;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public abstract double discountPrice();
}

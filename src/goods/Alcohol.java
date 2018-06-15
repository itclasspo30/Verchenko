package goods;

public class Alcohol extends Goods {

    public Alcohol(String name, double cost, int discount) {
        super(name, cost, discount);
    }

    @Override
    public double discountPrice() {
        return (getCost()-getCost()*getDiscount()/100);
    }
}

package goods;

public class Cosmetics extends Goods {

    public Cosmetics(String name, double cost, int discount) {
        super(name, cost, discount);
    }

    @Override
    public double discountPrice() {
        return (getCost()-getCost()*getDiscount()/100);
    }
}

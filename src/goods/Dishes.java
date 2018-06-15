package goods;

public class Dishes extends Goods {

    public Dishes(String name, double cost, int discount) {
        super(name, cost, discount);
    }

    @Override
    public double discountPrice() {
        return (getCost()-getCost()*getDiscount()/100);
    }
}

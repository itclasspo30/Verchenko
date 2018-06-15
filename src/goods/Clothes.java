package goods;

public class Clothes extends Goods {

    public Clothes(String name, double cost, int discount) {
        super(name, cost, discount);
    }

    @Override
    public double discountPrice() {
        return (getCost()-getCost()*getDiscount()/100);
    }
}

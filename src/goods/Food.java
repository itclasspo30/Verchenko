package goods;

public class Food extends Goods {

    public Food(String name, double cost, int discount) {
        super(name, cost, discount);
    }

    @Override
    public double discountPrice() {
        return (getCost()-getCost()*getDiscount()/100);
    }
}

package furniture_smpl;

public class ChairFurniture extends Furniture implements ColorFurniture {

    private static final double COST_CHAIR_FURNITURE=100;

    public ChairFurniture(String name) {
        super(name);
    }

    @Override
    public double getCostWithDiscount() {
        return COST_CHAIR_FURNITURE*0.9;
    }

    @Override
    public String getColor() {
        return "red";
    }
}

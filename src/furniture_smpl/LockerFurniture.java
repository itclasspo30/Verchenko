package furniture_smpl;

public class LockerFurniture extends Furniture implements ColorFurniture {

    private static final double COST_LOCKER_FURNITURE=300;

    public LockerFurniture(String name) {
        super(name);
    }

    @Override
    public double getCostWithDiscount() {
        return COST_LOCKER_FURNITURE*0.7;
    }

    @Override
    public String getColor() {
        return "yellow";
    }
}

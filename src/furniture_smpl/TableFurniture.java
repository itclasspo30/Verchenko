package furniture_smpl;

public class TableFurniture extends Furniture implements ColorFurniture{

    private static final double COST_TABLE_FURNITURE=200;

    public TableFurniture(String name) {
        super(name);
    }

    @Override
    public double getCostWithDiscount() {
        return COST_TABLE_FURNITURE*0.8;
    }

    @Override
    public String getColor() {
        return "black";
    }
}

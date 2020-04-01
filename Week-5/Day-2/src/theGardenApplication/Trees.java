package theGardenApplication;

public class Trees extends Plant {
    public Trees(String color, double water) {
        super(color, water);
        this.needsWater = getNeedsWater();
    }

    @Override
    public boolean getNeedsWater() {
        if (super.water < 10) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void setWater(double water) {
        double waterAmount = this.getWater();
        this.water = waterAmount + (water * 0.4);
    }
}

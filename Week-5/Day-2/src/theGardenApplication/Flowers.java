package theGardenApplication;

public class Flowers extends Plant {
    public Flowers(String color, double water) {
        super(color, water);
        this.needsWater = getNeedsWater();
    }

    @Override
    public boolean getNeedsWater() {
        if (super.water < 5) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void setWater(double water) {
        double waterAmount = this.getWater();
        this.water = waterAmount + (water * 0.75);
    }
}

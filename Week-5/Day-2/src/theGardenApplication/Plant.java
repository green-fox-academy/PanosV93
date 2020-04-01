package theGardenApplication;

public class Plant {
    protected String color;
    protected boolean needsWater;
    protected double water;

    public Plant(String color, double water) {
        this.color = color;
        this.water = water;
        this.needsWater = getNeedsWater();
    }

    public boolean getNeedsWater() {
        if (water > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void setWater(double water) {
        this.water = water;
    }

    public double getWater() {
        return water;
    }
}

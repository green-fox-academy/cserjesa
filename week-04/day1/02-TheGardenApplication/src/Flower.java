public class Flower extends Plants {
    private static double absorbtion = 0.75;
    private static double needsWater = 5;

    public Flower(String color) {
        super(color);
        this.needsWater = needsWater;
    }

    public double getNeedsWater() {
        return needsWater;
    }

    public double getAbsorbtion() {
        return absorbtion;
    }
}

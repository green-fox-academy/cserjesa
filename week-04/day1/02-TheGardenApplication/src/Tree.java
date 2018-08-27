public class Tree extends Plants {
    private static double absorbtion = 0.4;
    private static double needsWater = 10;

    public Tree(String color) {
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

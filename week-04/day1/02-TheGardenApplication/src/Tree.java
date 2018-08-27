public class Tree extends Plants {
    private static double absorption = 0.4;
    private static double sufficientLevel = 10;

    Tree(String color) {
        super(color);
    }

    @Override
    public double sufficientLevel() {
        return sufficientLevel;
    }

    @Override
    public double getAbsorption() {
        return absorption;
    }
}

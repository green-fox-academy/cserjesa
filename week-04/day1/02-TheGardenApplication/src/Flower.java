public class Flower extends Plants {
    private static double absorption = 0.75;
    private static double sufficientLevel = 5;

    Flower(String color) {
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

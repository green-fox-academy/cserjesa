abstract class Plants {
    private String color;
    private double waterLevel;

    Plants(String color) {
        this.color = color;
        this.waterLevel = 0;
    }

    abstract double sufficientLevel();
    abstract double getAbsorption();

    boolean needsWater() {
        return (this.waterLevel < this.sufficientLevel());
    }

    void plantWatering(double waterAmount) {
        if (this.needsWater()) {
            this.waterLevel = this.waterLevel + waterAmount * this.getAbsorption();
        }
    }

    String getPlantStatus() {
        if (this.needsWater()) {
            return "The " + this.color + " " + this.getClass().getSimpleName() + " needs water";
        }
        return "The " + this.color + " " + this.getClass().getSimpleName() + " doesn't need water";
    }
}
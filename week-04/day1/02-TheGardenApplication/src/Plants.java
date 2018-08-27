public abstract class Plants {
    private String color;
    private double waterLevel;


    public Plants(String color) {
        this.color = color;
        this.waterLevel = 0;
    }

    public abstract double getNeedsWater();
    public abstract double getAbsorbtion();

    public void watering(double waterAmount) {
        this.waterLevel = this.waterLevel + waterAmount * this.getAbsorbtion();
    }

    public String getStatus() {
        String need = "";
        if (this.waterLevel < this.getNeedsWater()) {
            need = " needs water";
        } else {
            need = " doesn't need water";
        }
        return "The " + this.color + " " + this.getClass().getSimpleName() + need;
    }
}

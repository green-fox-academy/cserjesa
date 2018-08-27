public class plants {
    private String color;
    private double absorbtion;
    private double waterLevel;

    public plants(String color) {
        this.color = color;
        this.absorbtion = absorbtion;
        this.waterLevel = 0;
    }

    void watering(double waterAmount) {
        this.waterLevel = this.waterLevel + waterAmount * absorbtion;

    }
}

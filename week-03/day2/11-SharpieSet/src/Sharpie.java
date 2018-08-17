public class Sharpie {

    String color;
    float width;
    int inkAmount;
    boolean usable;

    Sharpie(String color, float width,boolean usable) {
        this.color = color;
        this.width = width;
        this.inkAmount = 100;
        this.usable = usable;
    }

    void use() {
        this.inkAmount--;
    }
}
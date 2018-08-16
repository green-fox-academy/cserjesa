public class main {

    public static void main(String args[]) {
        Sharpie sharpie1 = new Sharpie("blue", 10);
        Sharpie sharpie2 = new Sharpie("black", 20);
        Sharpie sharpie3 = new Sharpie("red", 999);

        System.out.println(sharpie1.color + ", " + sharpie1.width + ", " + sharpie1.inkAmount);
        sharpie1.use();
        sharpie1.use();
        sharpie1.use();
        System.out.println(sharpie1.color + ", " + sharpie1.width + ", " + sharpie1.inkAmount);
        System.out.println(sharpie2.color + ", " + sharpie2.width + ", " + sharpie2.inkAmount);
    }
}

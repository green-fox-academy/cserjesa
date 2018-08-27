public class Main {
    public static void main(String[] args) {
        Flower f1 = new Flower("yellow");
        Flower f2 = new Flower("blue");
        Tree t1 = new Tree("purple");
        Tree t2 = new Tree("orange");

        System.out.println(f1.getStatus());
        System.out.println(f2.getStatus());
        System.out.println(t1.getStatus());
        System.out.println(t2.getStatus());

        f1.watering(40);
        f2.watering(40);
        t1.watering(40);
        t2.watering(40);

        System.out.println(f1.getStatus());
        System.out.println(f2.getStatus());
        System.out.println(t1.getStatus());
        System.out.println(t2.getStatus());

    }
}

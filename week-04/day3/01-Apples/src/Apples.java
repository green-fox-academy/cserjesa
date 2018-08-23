public class Apples {
    private String fruit;

    public Apples() {
        this.fruit = "apple";
    }

    public String getApple() {
        return fruit;
    }

    public static void main(String[] args) {
        Apples a = new Apples();
        System.out.println(a.getApple());
    }
}
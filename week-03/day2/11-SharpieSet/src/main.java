/*
Sharpie Set
    Reuse your Sharpie class
    Create SharpieSet class
        it contains a list of Sharpie
        countUsable() -> sharpie is usable if it has ink in it
        removeTrash() -> removes all unusable sharpies
 */
public class main {
    public static void main(String args[]) {
        Sharpie sharpie1 = new Sharpie("blue", 10, true);
        Sharpie sharpie2 = new Sharpie("black", 20, true);
        Sharpie sharpie3 = new Sharpie("red", 999, false);

        SharpieSet sharpieSet1 = new SharpieSet(sharpie1);
        sharpieSet1.add(sharpie1);
        sharpieSet1.add(sharpie2);
        sharpieSet1.add(sharpie3);

        System.out.println(sharpieSet1.countUsable());
    }
}


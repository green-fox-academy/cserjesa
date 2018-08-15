
public class Domino {
    int[] values;

    Domino(int valueA, int valueB) {
        this.values = new int[]{valueA, valueB};

    }

    @Override
    public String toString() {
        return "[" + values[0] + ", " + values[1] + "]";
    }
}
import java.util.ArrayList;

public class Summer {
    public void main(String[] args) {
    }

    public static int sum(ArrayList<Integer> list) {
        if (list == null) {
            throw new NullPointerException("param cannot be null.");
        }

        int summa = 0;
        for (Integer i : list) {
            summa = summa + list.get(i - 1);
        }
        return summa;
    }
}
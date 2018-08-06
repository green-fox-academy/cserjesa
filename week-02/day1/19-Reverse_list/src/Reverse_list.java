// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`

import java.util.Arrays;

public class Reverse_list {
    public static void main(String[] args) {
        int[] aj = {3, 4, 5, 6, 7};
        int[] ai = new int[(aj.length)];
        for (int i = aj.length - 1; i >= 0; i--) {
            ai[aj.length - i - 1] = aj[i];
        }
        aj = ai.clone();
        System.out.println(Arrays.toString(aj));
    }
}

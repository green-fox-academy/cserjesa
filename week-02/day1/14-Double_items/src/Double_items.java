// - Create an array variable named `numList`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Double all the values in the array

public class Double_items {
    public static void main(String[] args) {
        int[] numList = {3, 4, 5, 6, 7};

        for (int j = 0; j < numList.length; j++) {
            numList[j] *= 2;
            System.out.print(numList[j] + " ");
        }
    }
}

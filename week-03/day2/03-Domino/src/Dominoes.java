/*Dominoes
        You have the list of Dominoes
        Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        eg: [2, 4], [4, 3], [3, 5] ...
*/

import java.util.ArrayList;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        System.out.println(dominoes);
        List<Domino> ordered = new ArrayList<>();
        ordered.add(new Domino(dominoes.get(0).values[0], dominoes.get(0).values[1]));
        for (int second = 0; second < dominoes.size(); second++) {
            for (int first = 1; first < dominoes.size()-1; first++) {
                if (second == first) {
                    ordered.add(new Domino(dominoes.get(first).values[second], dominoes.get(first).values[second]));
                }
            }
        }
        System.out.println(ordered);
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
}
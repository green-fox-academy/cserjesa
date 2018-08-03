// Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %

public class DrawChessTable {
    public static void main(String[] args) {
/*
        for (int i = 0; i <= 31; i++) {
            if (i % 4 == 0) {
                System.out.println("");
                if ((i % 8 == 0)) {
                    System.out.print(" ");
                }
            }
            System.out.print("%");
            System.out.print(" ");
        }
This code prints blacks and whites in the right order (A1 is black).
However in the description there is wrong one, but this is the task.
So let's do it*/

        for (int j = 1; j <= 4; j++) {
            for (int i = 1; i <= 4; i++) {
                System.out.print("% ");
            }
            System.out.println("");
            for (int i = 1; i <= 4; i++) {
                System.out.print(" %");
            }
            System.out.println("");
        }
    }
}

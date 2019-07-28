package hyperskils.projects.tic_tac;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String BORDER = "---------";
        char[][] field = new char[3][3];
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        Main main = new Main();
        main.fillFeild(field, str.replace("\"", ""));
        System.out.println(BORDER);
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(field[i][j]+" ");
            }
            System.out.print("|"  + "\n");
        }
        char[] array = new char[-1];
        System.out.println(BORDER);
    }

    private void fillFeild(char[][] field, String input) {
        char[] src = input.toCharArray();

        field[0] = Arrays.copyOfRange(src, 0, 3);
        field[1] = Arrays.copyOfRange(src, 3, 6);
        field[2] = Arrays.copyOfRange(src, 6, 9);
//        System.arraycopy(src, 1, field[0], 0, 2);
//        System.arraycopy(src, 4, field[1], 0, 2);
//        System.arraycopy(src, 7, field[2], 0, 2);
    }
}

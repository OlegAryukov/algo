package hyperskils.strings;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean res  = input.length()>4 ? input.endsWith("burg") : false;
        System.out.println(res);
    }
}

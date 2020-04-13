package encryptdecrypt;

import java.util.Scanner;

public class Main {

    /**
     * ASCII:
     *  a = 97
     *  z = 122
     *
     *  w + 5 = xyzab
     *  e + 5 = fghij
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String message =  scanner.nextLine();
        char shift = (char) scanner.nextInt();

        char start = 'a';
        char end = 'z';
        int alpLength = 26;

        for (char c : message.toCharArray()) {
            if (c >= start && c <= end) {
                c = (char) (start + (c + shift - start) % alpLength);
            }
            System.out.print(c);
        }
    }
}

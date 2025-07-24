//1930 Beecrownd

import java.util.Scanner;

public class Tomadas {
    static Scanner Reader;

    public static void main(String[] args) {

        Reader = new Scanner(System.in);

        int N = 4;

        int[] array = new int[N];

        for (int i = 0; i < array.length; i++) {
            array[i] = Reader.nextInt();
        }
        int resultado = 0;
        for (int x : array) resultado = resultado + x;
        System.out.println(resultado - 3);
    }
}

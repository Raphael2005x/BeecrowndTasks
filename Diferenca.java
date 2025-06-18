//1007 Beecrownd

import java.io.IOException;
import java.util.Scanner;

public class Diferenca {

    public static void main(String[] args) throws IOException {
        Scanner src = new Scanner(System.in);

        int valorA;
        int valorB;
        int valorC;
        int valorD;
        int diferenca;

        valorA = src.nextInt();
        valorB = src.nextInt();
        valorC = src.nextInt();
        valorD = src.nextInt();

        diferenca = valorA * valorB - valorC * valorD;
        System.out.println("DIFERENCA = " + diferenca);

    }

}
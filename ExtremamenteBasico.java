//1001 Beecrownd

import java.io.IOException;
import java.util.Scanner;

public class ExtremamenteBasico {

    public static void main(String[] args) throws IOException {

        Scanner src = new Scanner(System.in);

        int a;
        int b;
        a = src.nextInt();
        b = src.nextInt();

        int soma = a + b;
        System.out.printf("X = " + soma);

    }
}
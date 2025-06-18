//1006 Beecrownd

import java.io.IOException;
import java.util.Scanner;
 
public class Media2 {
 
    public static void main(String[] args) throws IOException {
        Scanner src = new Scanner(System.in);
        double A;
        double B;
        double C;
        double soma;
        double media;

        A = src.nextDouble();
        B = src.nextDouble();
        C = src.nextDouble();

        soma = (A * 2 + B * 3 + C * 5);
        media = soma / 10.0;

        System.out.printf("MEDIA = %.1f\n", media);
    }
 
}
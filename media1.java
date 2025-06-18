//1005 Beecrown

import java.util.Scanner;

public class Media1 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        double pesoA = 3.5;
        double pesoB = 7.5;
        double numA;
        double numB;
        double media;
        double soma;

        numA = src.nextDouble();
        numB = src.nextDouble();

        soma = (numA * pesoA + numB * pesoB);
        media = soma / 11;

        System.out.printf("MEDIA = %.5f\n", media);
        src.close();
    }
}
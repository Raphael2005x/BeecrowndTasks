//1014 Beecrownd

import java.io.IOException;
import java.util.Scanner;

public class Consumo {

    public static void main(String[] args) throws IOException {
        Scanner src = new Scanner(System.in);

        int distancia;
        double combustivel;

        distancia = src.nextInt();
        combustivel = src.nextDouble();

        double resultado = distancia / combustivel;
        System.out.printf("%.3f km/l%n", resultado);
    }

}
//1016 Beecrownd

import java.util.Scanner;

public class Distancia {
    static Scanner reader;
    static int N;

    public static void ReceberEntrada() {
        reader = new Scanner(System.in);
        N = reader.nextInt();
    }

    public static void TempoNecessario() {
        int resposta = (N * 2);
        System.out.println(resposta + " minutos");
    }

    public static void main(String[] args) {
        Distancia.ReceberEntrada();
        Distancia.TempoNecessario();
    }
}

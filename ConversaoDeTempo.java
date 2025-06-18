//1019 Beecrownd

import java.util.Scanner;

public class ConversaoDeTempo {
    static Scanner reader;
    static int N;

    public static void receberEntrada() {
        reader = new Scanner(System.in);
        N = reader.nextInt();
    }

    public static void resolvendo() {
        int hora = N / 3600; // N (140153) dividindo por 3600 segundo (uma hora) = 38.931... (pega so o
                             // inteiro)

        int minutos = (N / 60) % 60; // N inteiro (140153) divide por 60 = 2.335, 2335 divide por 60 = 38(pega so o
                                     // inteiro), 38 * 60 = 2280, agora 2335 - 2280 = 55.
        System.out.println(minutos);

        int segundos = N % 60; // N (140153) dividido por 60 resultado (2.335) * 60 = (140100), 140153 - 140100
                               // = 53

        System.out.printf("%d horas %d minutos %d segundos em %d segundos\n", hora, minutos, segundos, N);

        System.out.printf(String.format("%d:%d:%d", hora, minutos, segundos));
    }

    public static void main(String[] args) {
        ConversaoDeTempo.receberEntrada();
        ConversaoDeTempo.resolvendo();
    }
}

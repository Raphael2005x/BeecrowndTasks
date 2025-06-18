//1018 Beecrownd

import java.util.Scanner;

public class Cedulas {
    static Scanner reader;
    static int array[];
    static int N;
    static int qaantidade;

    public static void receberEntrada() {
        reader = new Scanner(System.in);
        N = reader.nextInt();
        array = new int[] { 100, 50, 20, 10, 5, 2, 1 };
    }

    public static void AcharQuantidadeMinima() {
        System.out.println(N);
        for (int i = 0; i < array.length; i++) {
            qaantidade = N / array[i]; // pega o total do N no caso o numero digitado ex: 575 dividido por 100 = 5. 5
            // nota de 100
            System.out.println(qaantidade + " nota(s) de R$ " + array[i] + ",00");
            N = N % array[i]; // atualiza no array o valor restante da divisão usando o memo exemplo de cima
            // do 575 ja que dividiu por 100 e sobrou 75 ele vai dividir de novo e atualizar
            // no N o reto da divisao.
        }
    }

    public static void main(String[] args) {
        Cedulas.receberEntrada();
        Cedulas.AcharQuantidadeMinima();
    }
}
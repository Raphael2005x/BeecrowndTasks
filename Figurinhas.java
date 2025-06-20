//Beecrownd 1028 

import java.util.Scanner;

public class Figurinhas {
    static Scanner Reader;
    static int N;
    static int f1;
    static int f2;
    static int resultado[];

    public static void ReceberEntrada() {
        Reader = new Scanner(System.in);
        N = Reader.nextInt();
        int[] resultado = new int[N];
        for (int i = 0; i < N; i++) {
            f1 = Reader.nextInt();
            f2 = Reader.nextInt();

            resultado[i] = calcularMdc(f1, f2);
        }

        for (int i = 0; i < N; i++) {
            System.out.println(resultado[i]);
        }
        Reader.close();
    }

    public static int calcularMdc(int a, int b) {
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }

    public static void main(String[] args) {
        ReceberEntrada();
    }
}

import java.util.Scanner;

public class Fibonnaci {
    static int contador;

    static public int FibonnaciResolve(int n) {
        contador++;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return FibonnaciResolve(n - 1) + FibonnaciResolve(n - 2);
    }

    public static void main(String[] args) {
        Scanner Reader = new Scanner(System.in);

        int N = Reader.nextInt();

        for (int i = 0; i < N; i++) {
            int qtd = Reader.nextInt();
            contador = -1;

            int resultado = FibonnaciResolve(qtd);
            System.out.printf("fib(%d) = %d calls = %d%n", qtd, contador, resultado);
        }
        Reader.close();
    }
}

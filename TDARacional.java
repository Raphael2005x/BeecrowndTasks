//1022 Beecrownd

import java.util.Scanner;

public class TDARacional {

    public static int mdc(int a, int b) {
        if (b == 0)
            return a;
        return mdc(b, a % b);
    }

    public static void main(String[] args) {
        TDARacional.ReceberEntrada();
    }

    public static void ReceberEntrada() {
        Scanner ler = new Scanner(System.in);

        int N = ler.nextInt();
        for (int i = 0; i < N; i++) {

            int N1 = ler.nextInt();
            ler.next();
            int D1 = ler.nextInt();
            String Sinal = ler.next();
            int N2 = ler.nextInt();
            ler.next();
            int D2 = ler.nextInt();
            int num = 0, den = 0;

            switch (Sinal) {
                case "+":
                    num = (N1 * D2 + N2 * D1);
                    den = (D1 * D2);
                    break;
                case "-":
                    num = (N1 * D2 - N2 * D1);
                    den = (D1 * D2);
                    break;
                case "*":
                    num = N1 * N2;
                    den = D1 * D2;
                    break;
                case "/":
                    num = N1 * D2;
                    den = D1 * N2;
                    break;

                default:
                    break;
            }
            int mdc = mdc(Math.abs(num), Math.abs(den));
            int numSimp = num / mdc;
            int denSimp = den / mdc;

            System.out.println(num + "/" + den + " = " + numSimp + "/" + denSimp);
            ler.close();

        }
    }
}
import java.util.Scanner;

public class maior {
    static Scanner reader;
    static int primeiroValor;
    static int segundoValor;
    static int terceiroValor;
    static int[] array;

    public static void LerEntrada() {
        reader = new Scanner(System.in);
        int N = 3;
        array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.nextInt();
        }
    }

    public static void AcharMaior(int array[]) {
        int maiorValor = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (maiorValor < array[i]) {
                maiorValor = array[i];
            }
        }
        System.out.println(maiorValor + " eh o maior");
    }

    public static void main(String[] args) {
        maior.LerEntrada();
        maior.AcharMaior(array);
    }
}

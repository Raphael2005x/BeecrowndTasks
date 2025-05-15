import java.util.Scanner;

public class somaSimples {

    public static void main(String[] args) {
        int A;
        int B;
        int resultado;

        Scanner src = new Scanner(System.in);
        A = src.nextInt();
        B = src.nextInt();
        resultado = A + B;
        System.out.println("SOMA = " + resultado);
    }
} 
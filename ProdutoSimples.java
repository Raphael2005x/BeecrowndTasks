import java.util.Scanner;

public class ProdutoSimples {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int A;
        int B;
        int prod;
        A = src.nextInt();
        B = src.nextInt();
        prod = (A * B);
        System.out.println("PROD = "+ prod);
    }
}

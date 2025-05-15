import java.util.Scanner;

public class areacirculo {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        double area;
        double n = 3.14159;
        double resultado;
        area = src.nextDouble();
        resultado = Math.pow(area, 2);
        System.out.printf("A=%.4f\n", resultado * n);
    }
}
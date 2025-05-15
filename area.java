import java.util.Scanner;

public class area {
    static Scanner reader;
    static double A;
    static double B;
    static double C;
    static double pi = 3.14159;

    public static void lerValores() {
        reader = new Scanner(System.in);
        A = reader.nextDouble();
        B = reader.nextDouble();
        C = reader.nextDouble();
    }

    public static void AcharTriangulo() {
        double resultado = (A * C) / 2;
        System.out.printf("TRIANGULO: %.3f\n", resultado);

        // area base * altura / 2
    }

    public static void AcharAreaDoCirculo() {
        double resultado = (C * C) * pi;
        System.out.printf("CIRCULO: %.3f\n", resultado);
        // area = raio * raio * pi
    }

    public static void AcharAreaTrapezio() {
        double resultado = (A + B) * C / 2;
        System.out.printf("TRAPEZIO: %.3f\n", resultado);

        // area = base * base * altura / 2
    }

    public static void AcharAreaQuadrado() {
        double resultado = B * B;
        System.out.printf("QUADRADO: %.3f\n", resultado);
    }

    public static void AcharAreaRetangulo() {
        double resultado = A * B;
        System.out.printf("RETANGULO: %.3f\n", resultado);

    }

    public static void main(String[] args) {
        area.lerValores();
        area.AcharTriangulo();
        area.AcharAreaDoCirculo();
        area.AcharAreaTrapezio();
        area.AcharAreaQuadrado();
        area.AcharAreaRetangulo();
        
    }
}

//1015 Beecrownd

import java.io.IOException;
import java.util.Scanner;

public class DistanciaDeDoisPontos {
 
    public static void main(String[] args) throws IOException {
        Scanner src = new Scanner(System.in);

        double x1;
        double x2;
        double x3;
        double x4;
        
        x1 = src.nextDouble();
        x2 = src.nextDouble();
        x3 = src.nextDouble();
        x4 = src.nextDouble();

        double raiz = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(x2 - x4, 2));
        
        System.out.printf("%.4f\n", raiz);
    }
 
}
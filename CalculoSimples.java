import java.util.Scanner;

public class CalculoSimples {

    Scanner Reader;
    static int Peca1;
    static int Peca2;
    static int Peca1A;
    static double Peca1B;
    static int Peca2A;
    static double Peca2B;


    public void ReceberEntrada() {
        Reader = new Scanner(System.in);
        Peca1 = Reader.nextInt();
        Peca1A = Reader.nextInt();
        Peca1B = Reader.nextDouble();

        Peca2 = Reader.nextInt();
        Peca2A = Reader.nextInt();
        Peca2B = Reader.nextDouble();

    }
    public void FazerCalculo() {
        double resultadoA = (Peca1A * Peca1B);
        double resultadoB = (Peca2A * Peca2B);
        

        System.out.printf("VALOR A PAGAR: R$ " + "%.2f\n" ,resultadoA + resultadoB);
    }

    public static void main(String[] args) {
        CalculoSimples run = new CalculoSimples();
        run.ReceberEntrada();
        run.FazerCalculo();
    }
}

//1021 Beecrownd

import java.util.Scanner;

public class NotasEMoedas {
    Scanner Reader;
    float N;
    int notas[];
    double moedas[];
    static int quantidadeNotas;
    static int quantidadeMoedas;

    public void receberEntrada() {
        Reader = new Scanner(System.in);
        System.out.println("Escreva um numero: ");
        N = Reader.nextFloat();
        notas = new int[] { 100, 50, 20, 10, 5, 2 };
        moedas = new double[] { 1, 0.50, 0.25, 0.10, 0.05, 0.01 };
    }

    public float notas(float N, int notas[]) {
        System.out.println("NOTAS:");
        for (int i = 0; i < notas.length; i++) {
            quantidadeNotas = (int) (N / notas[i]); // Calcula a quantidade de notas
            N = N % notas[i]; // Atualiza o valor de N com o restante depois a divisao pelas notas
            System.out.println((int) quantidadeNotas + " nota(s) de R$ " + notas[i] + ".00");
        }
        return N; // Retorna o valor restante (em centavos) depois do calculo
    }

    public void moedas(double N, double moedas[]) {
        System.out.println("MOEDAS:");
        int centavo = (int) Math.round(N * 100); // Converte o valor para centavos (int)
        for (int i = 0; i < moedas.length; i++) {
            int valorMoeda = (int) Math.round(moedas[i] * 100); // Converte o valor da moeda para centavos (int)
            
            int quantidadeMoedas = centavo / valorMoeda; // Calcula a quantidade de moedas
            centavo = centavo % valorMoeda; // Atualiza o valor de centavo com o restante depois a divisao
            System.out.printf("%d moeda(s) de R$ %.2f\n", quantidadeMoedas, valorMoeda / 100.0); // Exibe a quantidade de cada moeda
        }
    }

    public static void main(String[] args) {
        NotasEMoedas run = new NotasEMoedas();
        run.receberEntrada();
        float restante = run.notas(run.N, run.notas);
        run.moedas(restante, run.moedas);
    }
}

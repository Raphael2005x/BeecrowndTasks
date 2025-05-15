import java.util.Scanner;

public class NotasEMoedas {
    Scanner Reader; // Criação do objeto Scanner para leitura de entrada
    float N; // Variável para armazenar o valor informado pelo usuário
    int notas[]; // Array que armazena os valores das notas
    double moedas[]; // Array que armazena os valores das moedas
    static int quantidadeNotas; // Variável para armazenar a quantidade de cada nota
    static int quantidadeMoedas; // Variável para armazenar a quantidade de cada moeda

    // Método para receber a entrada do usuário
    public void receberEntrada() {
        Reader = new Scanner(System.in); // Inicializa o scanner para ler a entrada do usuário
        System.out.println("Escreva um numero: "); // Exibe a mensagem para o usuário
        N = Reader.nextFloat(); // Lê o valor informado pelo usuário e armazena em N
        notas = new int[] { 100, 50, 20, 10, 5, 2 }; // Array com os valores das notas
        moedas = new double[] { 1, 0.50, 0.25, 0.10, 0.05, 0.01 }; // Array com os valores das moedas
    }

    // Método para calcular e imprimir as notas
    public float notas(float N, int notas[]) {
        System.out.println("NOTAS:"); // Exibe a mensagem indicando que está mostrando as notas
        for (int i = 0; i < notas.length; i++) { // Laço para percorrer todas as notas
            quantidadeNotas = (int) (N / notas[i]); // Calcula a quantidade de notas
            N = N % notas[i]; // Atualiza o valor de N com o restante após a divisão pelas notas
            System.out.println((int) quantidadeNotas + " nota(s) de R$ " + notas[i] + ".00"); // Exibe a quantidade de cada nota
        }
        return N; // Retorna o valor restante (em centavos) após o cálculo das notas
    }

    // Método para calcular e imprimir as moedas
    public void moedas(double N, double moedas[]) {
        System.out.println("MOEDAS:"); // Exibe a mensagem indicando que está mostrando as moedas
        int centavo = (int) Math.round(N * 100); // Converte o valor para centavos (int)
        for (int i = 0; i < moedas.length; i++) { // Laço para percorrer todas as moedas
            int valorMoeda = (int) Math.round(moedas[i] * 100); // Converte o valor da moeda para centavos (int)
            
            int quantidadeMoedas = centavo / valorMoeda; // Calcula a quantidade de moedas
            centavo = centavo % valorMoeda; // Atualiza o valor de centavo com o restante após a divisão
            System.out.printf("%d moeda(s) de R$ %.2f\n", quantidadeMoedas, valorMoeda / 100.0); // Exibe a quantidade de cada moeda
        }
    }

    // Método principal que inicia o programa
    public static void main(String[] args) {
        NotasEMoedas run = new NotasEMoedas(); // Cria uma instância da classe NotasEMoedas
        run.receberEntrada(); // Chama o método para receber a entrada do usuário
        float restante = run.notas(run.N, run.notas); // Calcula e imprime as notas, retornando o valor restante
        run.moedas(restante, run.moedas); // Calcula e imprime as moedas a partir do valor restante
    }
}

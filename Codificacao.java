import java.util.Scanner;

public class Codificacao {

    static Scanner Reader;
    static int QuantidadeTextos;
    static String[] textos;
    static char[] ascii = new char[127];
    static StringBuilder codificado = new StringBuilder(); 	//StringBuilder serve Pra montar ou mudar um texto aos poucos

    public static void ReceberEntrada() {
        Reader = new Scanner(System.in);
        QuantidadeTextos = Reader.nextInt();
        Reader.nextLine();

        textos = new String[QuantidadeTextos];

        for (int i = 0; i < QuantidadeTextos; i++) {
            textos[i] = Reader.nextLine();
        }
    }

    public static void Ascii() {
        for (int i = 32; i < 127; i++) {
            ascii[i] = (char) i;
        }
    }

    public static void PrimeiroProcessamento() {
        for (int i = 0; i < QuantidadeTextos; i++) {
            codificado.setLength(0);
            String linha = textos[i];

            for (int j = 0; j < linha.length(); j++) {
                char letra = linha.charAt(j); // verifica letras uma por uma
                if (Character.isLetter(letra)) { // verifica se é letra
                    codificado.append((char) (letra + 3)); // Tranforma Numero pra letra de volta e incrementa 3
                } else
                    codificado.append(letra); // append serve para acrescentar letra por letra no final ex: Palavra BOLA .append('B') = B; .append('O') = BO..
            }
            SegundoPasso();
            TerceiroPasso();
        }
    }

    public static void SegundoPasso() {
        codificado.reverse();
    }
    
    public static void TerceiroPasso(){
        int metade = codificado.length() / 2;
        for (int i = metade; i < codificado.length(); i++) {
            char letra = codificado.charAt(i);
            codificado.setCharAt(i, (char) (letra - 1));
        }

        System.out.println(codificado.toString());
    }

    public static void main(String[] args) {
        ReceberEntrada();
        Ascii();
        PrimeiroProcessamento();
    }
}

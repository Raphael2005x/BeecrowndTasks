//1017 Beecrownd

import java.util.Scanner;

public class GastoDeGasolina {
    static Scanner reader;
    static int[] array;
    static double horas;
    static double kilometrosHoras;

    public static void ReceberEntradas() {
        reader = new Scanner(System.in);
        int N = 2;
        array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.nextInt();
        }
    }

    public static void SetarHorasKmporh(int array[]) {
        horas = array[0];
        kilometrosHoras = array[1];
    }

    public static void calcular() {
        double resposta = (horas * kilometrosHoras) / 12;
        System.out.printf("%.3f\n" ,resposta);
    }

    public static void main(String[] args) {
        GastoDeGasolina.ReceberEntradas();
        GastoDeGasolina.SetarHorasKmporh(array);
        GastoDeGasolina.calcular();
    }
}

import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;


class CollectionsandSort {
    public static void main(String[] args) {
        System.out.println("Digite um numero:");

        Scanner teclado = new Scanner(System.in);
        int tam = teclado.nextInt();

        ArrayList<Integer> array = new ArrayList<>();
        Random ram = new Random();

        for (int i = 0; i < tam; i++){
            int num  = ram.nextInt(0,100);
            array.add(num);
        }

        System.out.println("Lista completa: " + array);
        System.out.println();
        Collections.sort(array);
        System.out.println("Lista ordenada: " + array);
        System.out.println();

        System.out.println("Testando ordenar com vetor...");
        System.out.println();

        int[] vetor = new int[tam];

        for (int i = 0; i < tam; i++){
            int num  = ram.nextInt(0,100);
            vetor[i] = num;
        }

        System.out.println("Os valores do vetor sao: ");
        for (int i = 0; i < tam; i++){
            System.out.println(vetor[i]);
        }

        Arrays.sort(vetor);
        System.out.println("Os valores do vetor ordenados sao: ");
        for (int i = 0; i < tam; i++){
            System.out.println(vetor[i]);
        }
    }
}
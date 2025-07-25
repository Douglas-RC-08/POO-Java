import java.util.Scanner;
import java.util.Random;

class PBL03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o numero 1:");
        int num1 = teclado.nextInt();
        System.out.println("Digite o numero 2:");
        int num2 = teclado.nextInt();

        double[][] vet = new double[num1][num2];
        Random ram = new Random();

        for (int i = 0; i < num1; i++){
            for (int x = 0; x < num2; x++){
                double numero = ram.nextDouble(0,100);
                vet[i][x] = numero;
            }
        }

        System.out.println("Matriz gerada:");
        for (int i = 0; i < num1; i++) {
            for (int x = 0; x < num2; x++) {
                System.out.printf("%.2f\t", vet[i][x]);
            }
            System.out.println();
        }

        System.out.println("Qual linha voce deseja somar:");
        int linha = teclado.nextInt();
        if (linha > num1){
            System.out.println("Linha invalida!");
            return;
        }
        linha -= 1;
        double soma = 0;

        for (int i = 0; i < num2; i++){
            soma += vet[linha][i];
        }
        System.out.printf("A soma da linha %d e: %.2f\n", (linha+1), soma);
        System.out.println();

        System.out.println("Qual coluna voce deseja somar:");
        int coluna = teclado.nextInt();
        if (coluna > num2){
            System.out.println("coluna invalida!");
            return;
        }
        coluna -= 1;
        soma = 0;

        for (int i = 0; i < num1; i++){
            soma += vet[i][coluna];
        }
        System.out.printf("A soma da linha %d e: %.2f\n", (coluna+1), soma);
        System.out.println();



        System.out.println("A soma da diagonal da matrix (canto superior esquerdo ate o inferior direito)");
        System.out.println("A matrix precisa ser quadrada.");
        System.out.println();

        if (num1 != num2){
            System.out.println("A matrix não é quadrada");
            return;
        }
        int y = 0;
        double soma3 = 0;

        for (int i = 0; i < num1; i++) {
            soma3 += vet[i][y];
            y += 1;
        }

        System.out.printf("A soma da diagonal: %.2f\n", soma3);

    }
}
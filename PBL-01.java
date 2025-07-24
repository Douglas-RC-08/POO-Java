import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        System.out.println("Digite um numero:");
        Scanner teclado = new Scanner(System.in);
        int tam = teclado.nextInt();
        
        //int vet[] = new int[tam];
        ArrayList<Integer> vet = new ArrayList<Integer>();
        Random num = new Random();
        
        System.out.println("RESULTADO:");
        for (int i = 0; i < tam; i++){
            vet.add(num.nextInt(0,100));
            
            int ve = vet.get(i); 
            if (ve % 2 == 0) {
                System.out.println(ve + " - numero par");
            } else if (ve % 3 == 0){
                System.out.println(ve + " - numero multiplo de 3");
            }else {
                System.out.println(ve + " - numero impar");
            }
        }
        System.out.println("lista completa: " + vet);
    }
}
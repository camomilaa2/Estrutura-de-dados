import java.util.Random;
import java.util.Scanner;

public class teste {
    public static void main(String args[]){
        int[] vetor = new int[10];
        Random numerosRandomicos = new Random();
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = numerosRandomicos.nextInt(999);
        }

        for(int i = 0; i < vetor.length; i++){
            if(minValue > vetor[i]){
                minValue = vetor[i];
            }
            if(maxValue < vetor[i]){
                maxValue = vetor[i];
            }
        }

        System.out.printf("Maior valor: %d", maxValue);
        System.out.printf("\nMenor valor: %d\n", minValue);

        for(int i = 0; i< vetor.length; i++){
            System.out.println(vetor[i]);
        }


    }
}

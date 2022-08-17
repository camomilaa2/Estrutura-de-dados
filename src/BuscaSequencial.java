import java.util.Random;
import java.util.Scanner;

public class BuscaSequencial {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        Random aleatorio = new Random();
        int[] vetor = new int[10];

        System.out.println("Mostrando o vetor");
        for(int i = 0; i<vetor.length; i++){
            vetor[i] = aleatorio.nextInt(999);
            System.out.println(vetor[i]);
        }

        System.out.println("Digite o número que deseja pesquisar: ");
        int num = ent.nextInt();

        for(int i = 0; i<vetor.length; i++){
            if(num == vetor[i]){
                System.out.println("Número " + num + "encontrado na posição " + i);
            }
        }


    }
}

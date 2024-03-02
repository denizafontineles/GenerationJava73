package vetores_matrizes;
import java.util.Scanner;

public class VetoresEx02 {

	public static void main(String[] args) {
		
		int vetor[] = new int[10];
		float soma = 0, media = 0;
        Scanner leia = new Scanner(System.in);
        
        for(int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = leia.nextInt();
        }

        System.out.println("\nElementos nos índices ímpares: ");
        for(int i = 0; i < vetor.length; i++) {
        	if(i % 2 == 1) System.out.print(vetor[i] + " ");
        }
        
        System.out.println("\n\nElementos pares: ");
        for(int i = 0; i < vetor.length; i++) {
        	if(vetor[i] % 2 == 0) System.out.print(vetor[i] + " ");
        	soma += vetor[i];
        	media = soma/vetor.length;
        }
        System.out.printf("\n\nSoma: %.0f", soma);
        System.out.printf("\nMédia: %.2f", media);
	}
}

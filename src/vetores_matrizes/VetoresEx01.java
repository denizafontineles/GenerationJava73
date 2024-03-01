package vetores_matrizes;

import java.util.Scanner;

public class VetoresEx01 {

	public static void main(String[] args) {
		
		int vetor[] = {2,5,1,3,4,9,7,8,10,6};
		int numUsuario, posicao = 0;
        
        Scanner read = new Scanner(System.in);
        
        System.out.print("Digite número: ");
        numUsuario = read.nextInt();
        
        for(int i = 0; i < vetor.length; i++) {
        	posicao = i;
        	if(vetor[i] == numUsuario) {
            	System.out.println("\nO número " + numUsuario + " está localizado na posição: " + posicao);
            }
        }
        System.out.println("pos " + posicao);
        if(posicao == numUsuario) {
        	System.out.println("\nO número " + numUsuario + " não foi encontrado!");
        }
	}
}

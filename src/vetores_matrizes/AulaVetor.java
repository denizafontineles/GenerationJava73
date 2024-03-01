package vetores_matrizes;

import java.util.Scanner;

public class AulaVetor {

	public static void main(String[] args) {
		String vetor[] = new String[3];
        Scanner leia = new Scanner(System.in);
        
        for(int i = 0; i < 3; i++) {
            System.out.print("Digite o nome: ");
            vetor[i] = leia.nextLine();
        }
        
        for(int i = 0; i < vetor.length; i++) {
            System.out.println("\nanimais " + i + "   " + vetor[i]);
        }
	}

}

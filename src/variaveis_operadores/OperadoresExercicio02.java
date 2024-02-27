package variaveis_operadores;

import java.util.Scanner;

public class OperadoresExercicio02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// variaveis
		float valor[] = new float[4];
		float media = 0;
		
		// entrada de dados
        Scanner leia = new Scanner(System.in);
        
        for (int i=0; i<4; i=i+1) {
        	System.out.print("Digite sua " + (i+1) + "° nota: ");
        	valor[i]= leia.nextFloat();
        }
  
        // saída de dados
        System.out.println("\nAs notas informadas foram:");
        
        for(int i=0; i<4; i=i+1) {
        	System.out.println((i+1) + "° nota = " + valor[i]);
        	media = media+valor[i]/4;
        }

        System.out.printf("\n-> Sua média é: %.1f" , media);
	}
}

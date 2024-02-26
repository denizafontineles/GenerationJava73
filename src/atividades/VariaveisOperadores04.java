package atividades;

import java.util.Scanner;

public class VariaveisOperadores04 {
	public static void main(String[] args) {
		// variaveis
		float vetor[] = new float[4];
		float conta1, conta2;
		float diferenca = 0;

		// entrada de dados
        Scanner leia = new Scanner(System.in);
        for (int i=0; i<4; i=i+1) {
        	System.out.print("Digite o " + (i+1) + "° número: ");
        	vetor[i]= leia.nextFloat();
        }
        leia.close();
        // saída de dados
        System.out.println("\nOs números informados foram:");
        for(int i=0; i<4; i=i+1) {
        	System.out.println((i+1) + "° número = " + vetor[i]);
        	conta1 = vetor[0] * vetor[1];
        	conta2 = vetor[2] * vetor[3];
        	diferenca = conta1 - conta2;
        }

        System.out.printf("\n-> A diferença é: %.1f" , diferenca);
	}
}

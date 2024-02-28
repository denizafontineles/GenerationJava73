package lacos_repeticao;

import java.util.Scanner;

public class RepeticaoForExercicio01 {

	public static void main(String[] args) {
		
        int n1, n2;
        Scanner read = new Scanner(System.in);

        System.out.println("\nUsuário, digite 2 números, onde "
        		+ "o primeiro número deve ser maior que o segundo número.");
        
        System.out.print("\nDigite o primeiro número: ");
        n1 = read.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = read.nextInt();

        if(n1 < n2) {
            System.out.println("\nResultado: \n");
            for (int i = n1; i < n2; i++) {
            	if((i % 3 == 0) && (i % 5 == 0)) 
            		System.out.println(i + " é múltiplo de 3 e 5.");
            }
        }else {
            System.out.println("\nERROR! Intervalo inválido");
        }
	}

}

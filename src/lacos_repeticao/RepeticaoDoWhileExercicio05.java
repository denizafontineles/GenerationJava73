package lacos_repeticao;

import java.util.Scanner;

public class RepeticaoDoWhileExercicio05 {

	public static void main(String[] args) {
		
		int num, soma=0;
        Scanner read = new Scanner(System.in);

        do {
            System.out.print("Digite um número inteiro: ");
            num = read.nextInt();
            
            if (num > 0) {
            	soma+=num;
    		}
        } 
        while (num != 0);
		System.out.println("\nA soma dos números positivos é: " + soma);
	}

}

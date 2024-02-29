package lacos_repeticao;

import java.util.Scanner;

public class RepeticaoWhileExercicio03 {
	public static void main(String[] args) {
		
		int idade, cont1=0, cont2=0, cont3=0;
        Scanner read = new Scanner(System.in);
        
        System.out.print("Digite sua idade: ");
        idade = read.nextInt();
        		
        while (idade > 0){
           
        	if(idade < 21) {
        		cont1++;
        	}else if(idade > 50) {
        		cont2++;
        	}else {
        		cont3++;
        	}
            System.out.print("Digite sua idade: ");
            idade = read.nextInt();
        }
        System.out.println("\nTotal de pessoas menores de 21 anos: " + cont1);
        System.out.println("Total de pessoas maiores de 50 anos: " + cont2);
        System.out.println("Total de pessoas entre 21 e 50 anos: " + cont3);
	}
}

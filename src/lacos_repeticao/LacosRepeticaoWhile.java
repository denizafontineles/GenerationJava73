package lacos_repeticao;

import java.util.Scanner;

public class LacosRepeticaoWhile {

	public static void main(String[] args) {
		
		String continua = "s";
		int n1, n2, resultado;
        Scanner read = new Scanner(System.in);

        while (!continua.equals("não")){
            System.out.print("\nDigite o primeiro número:  ");
            n1 = read.nextInt();
            System.out.print("Digite o segundo número:  ");
            n2 = read.nextInt();

            resultado = n1 + n2;
            
            System.out.println("\nresultado da soma:  " + resultado + "\n");

            System.out.println("\t * MENU * \n");
            System.out.println("Deseja somar mais? (Digite sim ou não) ");
            continua = read.next();
        }
        System.out.println("\t\n * Fim do programa *");
	}

}

package lacos_condicionais;

import java.util.Scanner;

public class CondicionaisIfEx02 {
	public static void main(String[] args) {
		
		int a;
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite um valor inteiro de A: ");
		a = read.nextInt();
				
		if (a % 2 == 0 && a > 0) {
			System.out.println("\nO valor " + a + " é Par e Positivo");
		}else if(a % 2 == 0 && a < 0) {
			System.out.println("\nO valor " + a + " é Par e Negativo");
		}else if(a % 2 != 0 && a > 0) {
			System.out.println("\nO valor " + a + " é Impar e Positivo");
		}else if(a % 2 != 0 && a < 0) {
			System.out.println("\nO valor " + a + " é Impar e Negativo");
		}
	}
}

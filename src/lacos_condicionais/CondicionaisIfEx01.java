package lacos_condicionais;

import java.util.Scanner;

public class CondicionaisIfEx01 {

	public static void main(String[] args) {
		
		int a, b, c, soma;
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite um valor inteiro de A: ");
		a = read.nextInt();
		System.out.print("Digite um valor inteiro de B: ");
		b = read.nextInt();
		System.out.print("Digite um valor inteiro de C: ");
		c = read.nextInt();
		
		soma = a + b;
		
		if (soma >= c) {
			System.out.println("\nA soma entre A + B é maior do que C");
			System.out.println("\nValor de C = " + c +" -> Resultado da soma: " + soma);
		}else {
			System.out.println("\nA soma entre A + B NÃO é maior do que C");
			System.out.println("\nValor de C = " + c + " -> Resultado da soma: " + soma);
		}
	}
}

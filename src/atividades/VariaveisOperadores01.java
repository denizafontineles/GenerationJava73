package atividades;

import java.util.Scanner;

public class VariaveisOperadores01 {
	
	public static void main(String[] args) {
		
		// variaveis
		float salario, abono, novoSalario;
		
		// entrada de dados
		Scanner leia = new Scanner(System.in);
		System.out.print("Insira o seu salário: ");
		salario = leia.nextFloat();
		System.out.print("Insira a seu abono: ");
		abono = leia.nextFloat();
				
		novoSalario = salario + abono;
		// saída de dados
		System.out.println("Seu novo salário é: " + novoSalario);
	}

}

package variaveis_operadores;

import java.util.Scanner;

public class OperadoresExercicio03 {

	public static void main(String[] args) {
		// variaveis
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		Scanner leia = new Scanner(System.in);
		
		// entrada de dados
		System.out.print("Insira o seu salário bruto: ");
		salarioBruto = leia.nextFloat();
		System.out.print("Insira a seu adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		System.out.print("Insira o suas horas extras: ");
		horasExtras = leia.nextFloat();
		System.out.print("Insira a seus descontos: ");
		descontos = leia.nextFloat();
		
	//	leia.close();
				
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras*5) - descontos;
		// saída de dados
		System.out.println("\nSeu salário líquido é: " + salarioLiquido);

	}
}

package introducao;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		// sysout com ctrl+espaço
		// classes (arquivos) já estão prontas - todas lógicas
		// objeto é uma forma de utilizar essas classes (arquivos) que já estão prontas
				
		// variáveis
		String nome;
		int idade;
		
		// entrada de dados
		Scanner leia = new Scanner(System.in);
		System.out.print("Insira o seu nome: ");
		nome = leia.next(); // next é para ler string
		System.out.print("Insira a sua idade: ");
		idade = leia.nextInt();
				
		// saída de dados
		System.out.println("Seu nome é: " + nome.toLowerCase());
		System.out.println("Sua idade é: " + idade + " anos.");
	}
}

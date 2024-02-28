package lacos_condicionais;

import java.util.Scanner;

public class CondicionaisExercicio03 {
	public static void main(String[] args) {
		
		int idade;
		String nome;
		boolean primeiraDoacao;
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		nome = read.next();
		
		System.out.print("Digite sua idade: ");
		idade = read.nextInt();
		
		if (idade >= 18 && idade <= 69) {
			if (idade >= 60 && idade <= 69){
				System.out.print("Primeira vez doando sangue? - Responda com true ou false: ");
				primeiraDoacao = read.nextBoolean();
				if(primeiraDoacao == true) {
					System.out.println(nome + " não está apte para doar sangue");
				}else {
					System.out.println(nome + " está apte para doar sangue");
				}
			}else {
				System.out.println(nome + " está apte para doar sangue");
			}
		}else {
			System.out.println(nome + " não está apte para doar sangue");
		}
		read.close();
	}

}

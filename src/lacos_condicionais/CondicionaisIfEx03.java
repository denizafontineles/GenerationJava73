package lacos_condicionais;

import java.util.Scanner;

public class CondicionaisIfEx03 {
	public static void main(String[] args) {
		
		int idade;
		String nome;
		boolean primeiraDoacao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.print("Digite sua idade: ");
		idade = leia.nextInt();
		
		if (idade >= 18 && idade <= 69) {
			if (idade >= 60 && idade <= 69){
				System.out.println("Primeira vez doando sangue? - true ou false: ");
				primeiraDoacao = leia.nextBoolean();
				if(primeiraDoacao == true) {
					System.out.println("\n" + nome + " não está apte para doar sangue");
				}else {
					System.out.println("\n" + nome + " está apte para doar sangue");
				}
			}else {
				System.out.println("\n" + nome + " está apte para doar sangue");
			}
		}else {
			System.out.println("\n" + nome + " não está apte para doar sangue");
		}
		leia.close();
	}

}

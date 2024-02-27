package lacos_condicionais;

import java.util.Scanner;

public class LacosCondicionais {

	public static void main(String[] args) {
		
		int idade;
		boolean carteira;
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		idade = read.nextInt();
		
		System.out.println("Você tem carteira? (true ou false) ");
		carteira = read.nextBoolean();
		
		if (idade >= 18 && carteira == true) {
			System.out.println("Pode dirigir");
		}else {
			System.out.println("Não pode dirigir :(");
		}
		read.close();
	}

}

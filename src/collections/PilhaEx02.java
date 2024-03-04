package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PilhaEx02 {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();

		int op;
		String nome;
		Scanner leia = new Scanner(System.in);
	
		while(true){
			System.out.println("\n\n******************************************************");
			System.out.println("1 - Adicionar livro na Pilha");
			System.out.println("2 - Listar todos os livros");
			System.out.println("3 - Retirar livro da Pilha");
			System.out.println("0 - Sair");
			System.out.println("*******************************************************");
			System.out.print("\n\tEntre com a opção desejada: ");
			op = leia.nextInt();
			
			if (op == 0) {
				System.out.println("\n\tPrograma Finalizado. Até logo!");
                leia.close();
				System.exit(0);
			}
			
			switch (op) {
			case 1:
				System.out.print("\nDigite o nome do livro: ");
				leia.skip("\\R?");
				nome = leia.nextLine();
				pilha.push(nome);
				System.out.print("\n\tLivro adicionado com sucesso!");
				System.out.println("\n\nPilha: ");
				Iterator<String> x = pilha.iterator();
				while(x.hasNext()) {
					System.out.println(x.next());
				}
				break;
			case 2:
				
				if(pilha.isEmpty()) {
					System.out.println("\n\tA Pilha está vazia!");
				}else {
					System.out.println("\nLista de livros na Pilha: ");
					Iterator<String> y = pilha.iterator();
					while(y.hasNext()) {
						System.out.println(y.next());
					}
				}
				break;
			case 3:
				if(pilha.isEmpty()) {
					System.out.println("\n\tA Pilha está vazia!");
				}else {
					System.out.println("\nO livro " + pilha.peek() + " foi retirado da Pilha!");
					pilha.pop();
					if(pilha.isEmpty()) {
						System.out.println("\n\tA Pilha atual está vazia!");
					}else {
						System.out.println("\nLista atual de livros na Pilha: ");
						Iterator<String> y = pilha.iterator();
						while(y.hasNext()) {
							System.out.println(y.next());
						}
					}
				}
				break;
			default:
				System.out.println("\n\tERROR! Opção inválida!");
			}
		}
	}

}

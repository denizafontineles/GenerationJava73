package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaEx01 {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		String op = "3";
		String nome;
		Scanner leia = new Scanner(System.in);
	
		while(!op.equals("0")){
			System.out.println("\n\n******************************************************");
			System.out.println("1 - Adicionar cliente na Fila");
			System.out.println("2 - Listar todos os clientes");
			System.out.println("3 - Retirar cliente da Fila");
			System.out.println("0 - Sair");
			System.out.println("*******************************************************");
			System.out.print("\n\tEntre com a opção desejada: ");
			op = leia.nextLine();
			
			switch (op) {
			case "1":
				System.out.print("\nDigite o nome do cliente: ");
				nome = leia.nextLine();
				fila.add(nome);
				System.out.print("\n\tCliente adicionado com sucesso!");
				System.out.println("\n\nFila: ");
				Iterator<String> x = fila.iterator();
				while(x.hasNext()) {
					System.out.println(x.next());
				}
				break;
			case "2":
				
				if(fila.isEmpty()) {
					System.out.println("\n\tA Fila está vazia!");
				}else {
					System.out.println("\nLista de clientes na Fila: ");
					Iterator<String> y = fila.iterator();
					while(y.hasNext()) {
						System.out.println(y.next());
					}
				}
				break;
			case "3":
				if(fila.isEmpty()) {
					System.out.println("\n\tA Fila está vazia!");
				}else {
					System.out.println("\nO cliente " + fila.peek() + " foi chamado!");
					fila.remove();
					if(fila.isEmpty()) {
						System.out.println("\n\tA Fila atual está vazia!");
					}else {
						System.out.println("\nLista atual de clientes na Fila: ");
						Iterator<String> y = fila.iterator();
						while(y.hasNext()) {
							System.out.println(y.next());
						}
					}
				}
				break;
			default:
				if(!op.equals("0")) {
					System.out.println("\n\tERROR! Opção inválida!");
				}
			}
		}
		System.out.println("\n\tPrograma Finalizado. Até logo!");
	}
}

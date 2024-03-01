package lacos_condicionais;

import java.util.Scanner;

public class CondicionaisSwithEx05 {

	public static void main(String[] args) {
		int codigo, quantidade;
		float valorUnitario, valorTotal;
		Scanner leia = new Scanner(System.in);

		System.out.print("\nDigite um número de 1 ao 6 para o código do produto: ");
		codigo = leia.nextInt();

		switch (codigo) {
		case 1:
			System.out.print("Digite a quantidade de itens você deseja: ");
			quantidade = leia.nextInt();
			System.out.println("\nProduto: Cachorro Quente");
			valorUnitario = 10.00f;
			valorTotal = quantidade * valorUnitario;
			System.out.printf("Valor Unitário: R$%.2f", valorUnitario);
			System.out.printf("\n\nValor Total: R$%.2f", valorTotal);
			break;
		case 2:
			System.out.print("Digite a quantidade de itens você deseja: ");
			quantidade = leia.nextInt();
			System.out.println("\nProduto: X-Salada");
			valorUnitario = 15.00f;
			valorTotal = quantidade * valorUnitario;
			System.out.printf("Valor Unitário: R$%.2f", valorUnitario);
			System.out.printf("\n\nValor Total: R$%.2f", valorTotal);
			break;
		case 3:
			System.out.print("Digite a quantidade de itens você deseja: ");
			quantidade = leia.nextInt();
			System.out.println("\nProduto: X-Bacon");
			valorUnitario = 18.00f;
			valorTotal = quantidade * valorUnitario;
			System.out.printf("Valor Unitário: R$%.2f", valorUnitario);
			System.out.printf("\n\nValor Total: R$%.2f", valorTotal);
			break;
		case 4:
			System.out.print("Digite a quantidade de itens você deseja: ");
			quantidade = leia.nextInt();
			System.out.println("\nProduto: Bauru");
			valorUnitario = 12.00f;
			valorTotal = quantidade * valorUnitario;
			System.out.printf("Valor Unitário: R$%.2f", valorUnitario);
			System.out.printf("\n\nValor Total: R$%.2f", valorTotal);
			break;
		case 5:
			System.out.print("Digite a quantidade de itens você deseja: ");
			quantidade = leia.nextInt();
			System.out.println("\nProduto: Refrigerante");
			valorUnitario = 8.00f;
			valorTotal = quantidade * valorUnitario;
			System.out.printf("Valor Unitário: R$%.2f", valorUnitario);
			System.out.printf("\n\nValor Total: R$%.2f", valorTotal);
			break;
		case 6:
			System.out.print("Digite a quantidade de itens você deseja: ");
			quantidade = leia.nextInt();
			System.out.println("\nProduto: Suco de laranja");
			valorUnitario = 13.00f;
			valorTotal = quantidade * valorUnitario;
			System.out.printf("Valor Unitário: R$%.2f", valorUnitario);
			System.out.printf("\n\nValor Total: R$%.2f", valorTotal);
			break;
		default:
			System.out.println("\nERROR! Opção inválida!");
		}

	}

}

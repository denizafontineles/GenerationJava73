package vetores_matrizes;

public class MatrizesEx03 {

	public static void main(String[] args) {

        int numeros[][] = {
        		{ 1, 2, 3 }, 
        		{ 4, 5, 6 }, 
        		{ 7, 8, 9 } 
        };
        int somaP = 0, somaS = 0, linha, coluna;
        System.out.println("Elementos da Diagonal Principal: ");
        for(linha = 0; linha < 3; linha++) {
        	for(coluna = 0; coluna < 3; coluna++ ) {
        		if(linha == coluna) {
        			somaP+= numeros[linha][coluna];
        			System.out.print(numeros[linha][coluna] + " ");
        		}
      		}
        }
        System.out.println("\nElementos da Diagonal Secundária: ");
        for(linha = 0; linha < 3; linha++) {
        	for(coluna = 0; coluna < 3; coluna++ ) {
        		if(coluna + linha == 3 - 1) {
        			somaS += numeros[linha][coluna];
        			System.out.print(numeros[linha][coluna] + " ");
        		}
      		}
        }
        System.out.println("\nSoma dos Elementos da Diagonal Principal: ");
        System.out.println(somaP);
        System.out.println("Soma dos Elementos da Diagonal Secundária: ");
        System.out.println(somaS);
	}
}
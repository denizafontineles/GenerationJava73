package vetores_matrizes;

public class MatrizesEx03 {

	public static void main(String[] args) {

        int numeros[][] = {
        		{ 10, 15, 35 }, 
        		{ 70, 120, 140 }, 
        		{ 50, 100, 150 } 
        };
                
        System.out.println("\nElementos da Diagonal Principal: ");
  //    System.out.println("\nElementos da Diagonal Secundária: ");
  //    System.out.println("\nSoma dos Elementos da Diagonal Principal: ");
  //    System.out.println("\nSoma dos Elementos da Diagonal Secundária: ");
        
        //percorrer as colunas da Matriz
        for(int linha = 0; linha < 3; linha++) {
        	// Percorrer as colunas da Matriz
        	for(int coluna = 0; coluna < 3; coluna++ ) {
        		System.out.println("[" + linha + "] " 
        				+ "[" + coluna + "] " + numeros[linha][coluna]);
        	}
        }
	}

}

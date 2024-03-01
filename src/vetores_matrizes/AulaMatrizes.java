package vetores_matrizes;

public class AulaMatrizes {

	public static void main(String[] args) {
		
	    // int[][] matriz = new int [3][3];

        int numeros[][] = {
        		{ 10, 15, 35 }, 
        		{ 70, 120, 140 }, 
        		{ 50, 100, 150 } 
        };
        
        //percorrer as colunas da Matriz
        for(int linha = 0; linha < 3; linha++) {
        	
        	// Percorrer as colunas da Matriz
        	for(int coluna = 0; coluna < 3; coluna++ ) {
        		System.out.println("Numeros [" + linha + "] " 
        				+ "[" + coluna + "] " + numeros[linha][coluna]);
        	}
        }


	}

}

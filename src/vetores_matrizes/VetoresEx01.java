package vetores_matrizes;

import java.util.Scanner;

public class VetoresEx01 {

	public static void main(String[] args) {
		
		int vetor[] = {2,5,1,3,4,9,7,8,10,6};
		int num;
        
        Scanner read = new Scanner(System.in);
        
        System.out.print("Digite número: ");
        num = read.nextInt();
        
        for(int i = 0; i < vetor.length; i++) {

            if(vetor[i] == num) {
            	System.out.println("O número " + num + 
            			" está localizado na posição: " + i);
            }else if(vetor[i] != num){
            	System.out.println("d");
            }
        }
	}

}

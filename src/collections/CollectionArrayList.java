package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionArrayList {

	public static void main(String[] args) {
	
//      Float inicia com letra maiúscula pois a collection não aceita tipo 
//		primitivo, ao colocar Float utiliza o wraper para tranformar em não primitivo
		
		ArrayList<Double> notas = new ArrayList<Double>();
		Scanner leia = new Scanner(System.in);
		Double numero;
		
		notas.add(7.0);
		notas.add(5.0);
		notas.add(4.0);
		notas.add(10.0);
		notas.add(4.0);
		
		System.out.println("\nNotas cadastradas: " + notas);
		System.out.print("\nDigite um numero para encontrar: ");
		numero = leia.nextDouble();
		
		if(notas.contains(numero)) {
			System.out.println("\nA posição da nota é: " + notas.indexOf(numero));
		}else {
			System.out.println("\nO número " + numero + " não foi encontrado!");
		}
	}

}

package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetEx03 {

	public static void main(String[] args) {
		Set<Integer> setNumeros = new HashSet<Integer>();

		Scanner leia = new Scanner(System.in);
		int num;
		
		for (int i = 1; i <= 10; i=i+1) {
			System.out.print("Digite o " + i + "° número inteiro: ");
			num = leia.nextInt();
			setNumeros.add(num);
		}
		
		Iterator<Integer> x = setNumeros.iterator();
		
		System.out.print("\n");
	
		while(x.hasNext()) {
			System.out.println(x.next());
		}
	}
}


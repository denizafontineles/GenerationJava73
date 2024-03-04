package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListEx01 {

	public static void main(String[] args) {
		
		ArrayList<String> cores = new ArrayList<String>();
		Scanner leia = new Scanner(System.in);
		String nomeCor;
		
        for (int i = 1; i <= 5; i=i+1) {
        	System.out.print("Digite a " + i + "° cor de sua preferência: ");
    		nomeCor = leia.nextLine();
            cores.add(nomeCor);
        }
        
		System.out.print("\nListar todas as cores: " + cores);
		
		cores.sort(Comparator.naturalOrder());
		
		System.out.print("\n\nOrdenar as cores: " + cores);
	}
}



package collections;

public class MainGenFila {

	public static void main(String[] args) {
		GenFila fila = new GenFila(3);
		
		fila.enqueue(10);
		System.out.println("Item adicionado na fila: " + fila.pegarFim());
		
		fila.enqueue(20);
		System.out.println("Item adicionado na fila: " + fila.pegarFim());
		
		fila.enqueue(30);
		System.out.println("Item adicionado na fila: " + fila.pegarFim());
		
		fila.enqueue(40);
		
		fila.denqueue();
	}

}

package collections;

public class MainGenPilha {

	public static void main(String[] args) {
		GenPilha pilha = new GenPilha(3);
		
		pilha.push(10);
		System.out.println("Elemento adicionado ao topo: " + pilha.peek());
		
		pilha.push(20);
		System.out.println("Elemento adicionado ao topo: " + pilha.peek());
		
		pilha.push(30);
		System.out.println("Elemento adicionado ao topo: " + pilha.peek());
		
		pilha.push(40);
		
		pilha.pop();
		
	}

}

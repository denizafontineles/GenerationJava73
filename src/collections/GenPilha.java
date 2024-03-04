package collections;

public class GenPilha {
	private int tamanhoMaximo;
	private int[] pilha;
	private int topo;
	
	public GenPilha(int s) {
		tamanhoMaximo = s;
		pilha = new int[s];
		topo = -1;
	}
	
	public void push(int item) {
		if(topo == tamanhoMaximo - 1) {
			System.out.println("A pilha está cheia, não pode adicionar mais nada!");
		}else {
			topo++;
			pilha[topo] = item;
		}
	}
	
	public void pop() {
		if( topo == -1) {
			System.out.println("A pilha está vazia, não tem mais o que tirar");
		}else {
			System.out.println("Elemento retirado da pilha: " + pilha[topo]);
			topo--;
		}
	}
	
	public int peek() {
		return pilha[topo];
	}

}

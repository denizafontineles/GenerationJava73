package metodos;

public class AulaMetodo {

	public static void main(String[] args) {
		int res = somar(2,5);
		System.out.println("O resultado: " + res);
		BoxMetodos.mensagem(); // está no arquivo BoxMetodos
		msg2("Bom dia!!");
	}
		
	public static int somar(int n1, int n2) {
		return n1 + n2;
	}
	
	public static void mensagem() {
		System.out.println("Hello World!");
	}
	
	public static void msg2(String msg) {
		System.out.println(msg);
	}
	
}

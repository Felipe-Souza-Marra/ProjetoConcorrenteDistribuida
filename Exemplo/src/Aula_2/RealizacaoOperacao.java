package Aula_2;

public class RealizacaoOperacao {
	
	public void realizaOperacao(Operacao tipo) {
		
		int x = 3;
		int y = 3;
		
		
		switch (tipo) {
		case SOMA:
			System.out.println("Resultado: " + (x + y));
			break;
		case SUBTRACAO:
			System.out.println("Resultado: " + (x - y));
			break;
		case DIVICAO:
			System.out.println("Resultado: " + (x / y));
			break;
		case MUTIPLICACAO:
			System.out.println("Resultado: " + (x * y));
			break;
		}
		
		Thread t = Thread.currentThread();
		System.out.println("Nome da thread: " + t.getName());
		
	}
	
}

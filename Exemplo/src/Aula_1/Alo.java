package Aula_1;

public class Alo implements Runnable {

	public void dizer() {
		System.out.println("Alo Mundo!");
	}
	
	@Override
	public void run() {
		this.dizer();
	}

}

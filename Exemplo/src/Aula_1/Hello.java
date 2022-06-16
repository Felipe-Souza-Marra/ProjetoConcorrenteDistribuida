package Aula_1;

public class Hello implements Runnable {
	
	public void dizer() {
		System.out.println("Hello World!");
	}
	
	@Override
	public void run() {
		this.dizer();
	}

}

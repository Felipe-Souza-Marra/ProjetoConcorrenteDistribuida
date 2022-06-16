package Aula_1;

public class HelloThread extends Thread {
	
	private Hello hello = new Hello();
	
	public void run() {
		this.hello.run();
	}

}

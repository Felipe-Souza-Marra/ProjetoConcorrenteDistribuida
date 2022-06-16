package Aula_3;

public class Principal_3 {

	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread thread = new Thread(myRunnable);
		thread.start();
		try {
			System.out.println("Intervalo");
			Thread.sleep(1000L);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		myRunnable.doStop();
	}

}

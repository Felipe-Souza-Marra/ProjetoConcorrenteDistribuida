package Aula_3;

public class MyRunnable implements Runnable {
	
	private boolean doStop = false;
	
	public synchronized void  doStop() {
		this.doStop = true;
	}
	
	public synchronized boolean  keepRunning() {
		return this.doStop == false;
	}
	
	public void run() {
		
		while (keepRunning()) {
			System.out.println("Running");
			try {
				Thread.sleep(3L * 1000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
}

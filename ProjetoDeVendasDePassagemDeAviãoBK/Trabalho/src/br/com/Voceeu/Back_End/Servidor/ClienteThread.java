package br.com.Voceeu.Back_End.Servidor;

import java.net.Socket;
import java.io.*;

public class ClienteThread extends Thread {
	
	private Socket cliente;
	private String fromServer;
	private String fromUser;
	private DataInputStream din;
	private DataOutputStream dout;
	
	public ClienteThread(Socket cliente) {
		this.cliente = cliente;
		this.fromServer = null;
		try {
			this.din = new DataInputStream(this.cliente.getInputStream());
			this.dout = new DataOutputStream(this.cliente.getOutputStream());
			System.out.println("Foi.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void run() {
		
		
		
	}

}


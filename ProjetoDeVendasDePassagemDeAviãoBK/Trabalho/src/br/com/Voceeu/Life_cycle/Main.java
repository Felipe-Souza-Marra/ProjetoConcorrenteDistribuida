package br.com.Voceeu.Life_cycle;

import java.awt.EventQueue;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
import javax.swing.JFrame;

import br.com.Voceeu.Back_End.Servidor.ServidorLocal;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*
	 * Create the application.
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public Main() throws Exception {
		try (Socket socket = new Socket("localhost", ServidorLocal.port)) {
			
		System.out.println("Cliente: conectado ao servidor");
		
		int valor = 5;
		
		OutputStream socketOut =  socket.getOutputStream();
		DataOutputStream dout = new DataOutputStream(socketOut);
		System.out.println("Cliente: valor enviado " + valor);
		dout.writeInt(valor);
		InputStream socketIn = socket.getInputStream();
		DataInputStream din = new DataInputStream(socketIn);
		
		int valorIncrementado = din.readInt();
		System.out.println("Cliente: valor enviado " + valor);
		System.out.println(valorIncrementado);
		System.out.println("Cliente: valor recebido " + valorIncrementado);
		
		initialize();
		
		}
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
	}

}

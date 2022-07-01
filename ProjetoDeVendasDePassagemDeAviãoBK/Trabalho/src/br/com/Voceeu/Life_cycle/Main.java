package br.com.Voceeu.Life_cycle;

import java.awt.EventQueue;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
import javax.swing.JFrame;
import br.com.Voceeu.Back_End.Servidor.ServidorLocal;
import br.com.Voceeu.Front_End.TelaAdicionarVoo.AdicionarVooView;

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

	/**
	 * Create the application.
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public Main() throws Exception {
		try (Socket socket = new Socket("localhost", ServidorLocal.port)) {
			System.out.println("Cliente: conectado ao servidor");
			DataInputStream din;
			DataOutputStream dout;
			String value;
			din = new DataInputStream(socket.getInputStream());
			value = din.readUTF();
			System.out.println(value);
			System.out.println("Cliente: recebe");
			
			dout = new DataOutputStream(socket.getOutputStream());
			dout.writeUTF(value);
			System.out.println("Cliente: manda");
			System.out.println(value);
			
			value = din.readUTF();
			System.out.println(value);
			System.out.println("Cliente: recebe");
			
			
			initialize();
			frame = new AdicionarVooView().frame;
		}

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

	}

}

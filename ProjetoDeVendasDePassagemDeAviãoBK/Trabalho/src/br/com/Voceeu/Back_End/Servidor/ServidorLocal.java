package br.com.Voceeu.Back_End.Servidor;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

public class ServidorLocal {

	private String nome;
	static public int port = 1090;
	private ServerSocket serverSocket;
	private List<ClienteThread> clientes;


	public ServidorLocal() {

		this.nome = "Servidor1";
		this.clientes = new ArrayList<ClienteThread>();

	}

	public void criarServerSocket() throws IOException {

		this.serverSocket = new ServerSocket(ServidorLocal.port);

	}
	
	public void fecharServer() {
		
		try {
			this.serverSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void conectarCliente() {
		try {
			int idCliente = this.clientes.size();
			Socket clientSocket =  this.serverSocket.accept();
			OutputStream socketOut =  clientSocket.getOutputStream();
			DataOutputStream dout = new DataOutputStream(socketOut);
			InputStream socketIn =  clientSocket.getInputStream();
			DataInputStream din = new DataInputStream(socketIn);
			ClienteThread cliente = new ClienteThread(clientSocket);
			cliente.start();
			this.clientes.add(cliente);
			
//			dout.writeInt(idCliente);
			System.out.println("Conectou cliente " + idCliente);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getNome() {
		return nome;
	}

	public List<ClienteThread> getClientes() {
		return clientes;
	}

}


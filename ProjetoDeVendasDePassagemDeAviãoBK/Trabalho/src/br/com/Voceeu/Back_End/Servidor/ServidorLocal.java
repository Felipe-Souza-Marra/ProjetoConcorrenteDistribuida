package br.com.Voceeu.Back_End.Servidor;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ServidorLocal {

	private String nome;
	static public int port = 1090;
	private List<Socket> clientes;
	private ServerSocket serverSocket;


	public ServidorLocal() {

		this.nome = "Servidor1";
		this.setClientes(new ArrayList<Socket>());

	}

	private void criarServerSocket() throws IOException {

		this.serverSocket = new ServerSocket(ServidorLocal.port);

	}

	public void conectarCliente() {
		try {
			int idCliente = this.clientes.size();
			Socket clientSocket =  this.serverSocket.accept();
			this.clientes.add(clientSocket);
			OutputStream socketOut =  clientSocket.getOutputStream();
			DataOutputStream dout = new DataOutputStream(socketOut);
			dout.writeInt(idCliente);
			System.out.println("Conectou cliente" + idCliente);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		ServidorLocal server = new ServidorLocal();

		try {
			server.criarServerSocket();
			System.out.println("Servidor: Aguardando requisições...");
			while (true) {

			}
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

	public String getNome() {
		return nome;
	}

	public List<Socket> getClientes() {
		return clientes;
	}

	public void setClientes(List<Socket> clientes) {
		this.clientes = clientes;
	}

}

//InputStream socketIn = clientSocket.getInputStream();
//DataInputStream din = new DataInputStream(socketIn);
//int valor = din.readInt();

package br.com.Voceeu.Back_End.Servidor;

import java.io.*;
import java.net.*;
import java.util.Random;

public class ServidorLocal {
	
	private String nome;
	static public int port = 1090;
	
	public ServidorLocal() {
		
		this.nome = "Servidor1";
		
	}
    
	public static void main(String[] args) throws Exception {
		
		try (ServerSocket serverSocket = new ServerSocket(ServidorLocal.port)) {
			
			System.out.println("Servidor: Aguardando requisições...");
			Socket clientSocket =  serverSocket.accept();
			System.out.println("Opa");
			InputStream socketIn = clientSocket.getInputStream();
			System.out.println("Opa");
			DataInputStream din = new DataInputStream(socketIn);
			System.out.println("Opa");
			
			int valor = din.readInt();
			System.out.println("Opa");
			System.out.println("Servidor: recebeu o valor " + valor);
			valor++;
			
			OutputStream socketOut =  clientSocket.getOutputStream();
			DataOutputStream dout = new DataOutputStream(socketOut);
			dout.writeInt(valor);
			System.out.println("Servidor: enviou o valor " + valor);
			
		}
	}

	public String getNome() {
		return nome;
	}
    
}

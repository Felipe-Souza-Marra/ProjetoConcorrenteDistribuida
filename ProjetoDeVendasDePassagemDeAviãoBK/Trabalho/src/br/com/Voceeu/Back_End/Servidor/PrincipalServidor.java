package br.com.Voceeu.Back_End.Servidor;

import java.io.IOException;

public class PrincipalServidor {

	public static void main(String[] args) throws Exception {
		ServidorLocal server = new ServidorLocal();

		try {
			server.criarServerSocket();
			while (true) {
				System.out.println("Servidor: Aguardando cliente...");
				server.conectarCliente();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

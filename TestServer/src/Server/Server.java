package Server;

//Java implementation of Server side
//It contains two classes : Server and ClientHandler
//Save file as Server.java

import java.io.*;

//Server class
public class Server
{
	public static void main(String[] args) throws IOException
	{
		// server is listening on port 5056
		ServerLocal server = new ServerLocal();
		
		server.criarServerSocket();
		// running infinite loop for getting
		// client request
		while (true)
		{
			

			try
			{
				server.conectarCliente();

			}
			catch (Exception e){
				server.fecharServer();
				e.printStackTrace();
			}
		}
	}
}

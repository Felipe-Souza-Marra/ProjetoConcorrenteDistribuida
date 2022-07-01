package Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

//ClientHandler class
public class ClientHandler extends Thread
{
	
	final DataInputStream dis;
	final DataOutputStream dos;
	final Socket s;


	// Constructor
	public ClientHandler(Socket s, DataInputStream dis, DataOutputStream dos)
	{
		this.s = s;
		this.dis = dis;
		this.dos = dos;
	}

	@Override
	public void run()
	{
		String received;
		String toReturn;
		while (true)
		{
			try {

				// Ask user what he wants
				dos.writeUTF("What do you want?[Date | Time]..\n"+
						"Type Exit to terminate connection.");

				// receive the answer from client
				received = dis.readUTF();
				
				System.out.println("Prefix: " + received.startsWith("GET"));
				
				if(received.equals("Exit"))
				{
					System.out.println("Client " + this.s + " sends exit...");
					System.out.println("Closing this connection.");
					this.s.close();
					System.out.println("Connection closed");
					break;
				}

				toReturn = "Opa servidor foi.";

				// write on output stream based on the
				// answer from the client
				switch (received) {

				case "GET":
					//Servidor manda recurso para cliente
					dos.writeUTF(toReturn);
					break;

				case "POST":
					//Servidor recebe recurso para alterar Data base
					dos.writeUTF(toReturn);
					break;
					
				case "PUT":
					//Servidor recebe recursos para representações do Data Base
					dos.writeUTF(toReturn);
					break;
					
				case "DELETE":
					//Servidor recebe recurso para remover do Data base
					dos.writeUTF(toReturn);
					break;
					
				case "OPTIONS":
					//Servidor mostra as opções para o cliente
					dos.writeUTF(toReturn);
					break;
					
				case "TRACE":
					//Executa um teste de loop-back
					dos.writeUTF(toReturn);
					break;
					
				case "PATCH":
					//Servidor recebe recurso para alterar parcialmente o Data base
					dos.writeUTF(toReturn);
					break;

				default:
					dos.writeUTF("Invalid input");
					break;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try
		{
			// closing resources
			this.dis.close();
			this.dos.close();

		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
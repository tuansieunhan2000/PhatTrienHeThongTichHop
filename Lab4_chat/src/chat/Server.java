package chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket server = new ServerSocket(1022);
			System.out.println("Server created");
			Socket socket =server.accept();
			System.out.println("Client connect to server");
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			DataInputStream in = new DataInputStream(socket.getInputStream());
			Scanner input = new Scanner(System.in);
			while(true) {
				String str =in.readUTF();
				if(str.equalsIgnoreCase("q")) {	
					break;
				}else {
					System.out.println("Client: " + str);
				}
				System.out.println("\n");
				out.writeUTF(input.nextLine());
				out.flush();
			}
			System.out.println("END");
			input.close();
			in.close();
			out.close();
			socket.close();
			server.close();
		} catch (IOException e) {
			System.out.println("END");
		}

	}

}

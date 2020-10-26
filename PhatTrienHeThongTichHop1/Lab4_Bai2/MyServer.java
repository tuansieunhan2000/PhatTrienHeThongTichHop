package Client_Server;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServer {
	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			ServerSocket server = new ServerSocket(1099);
			System.out.println("Server da duoc tao");
			Socket client = server.accept();
			System.out.println("Client da ket noi den server");
			Scanner inFromClient = new Scanner(client.getInputStream());
			PrintStream outToClient = new PrintStream(client.getOutputStream());
			outToClient.println("Nhap gì đó gửi qua server");
			String ten = inFromClient.nextLine();
			System.out.println("clien: " + ten);
			outToClient.println("Dòng vua nhap gui lai tu server " + ten);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

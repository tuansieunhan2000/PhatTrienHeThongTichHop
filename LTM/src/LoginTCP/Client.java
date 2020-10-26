package LoginTCP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;
public class Client {
	//1 server phải biết host, phải biết host của server là gì
	private InetAddress host; 
	private int port;
	public Client(InetAddress host, int port) {
		this.host = host;
		this.port = port;
	}
	private void execute() throws IOException {
		Socket client = new Socket(host, port);
		// Luồng đi dữ liệu
		DataInputStream dis= new DataInputStream(client.getInputStream());
		DataOutputStream dos= new DataOutputStream(client.getOutputStream());
		Scanner scanner = new Scanner(System.in);
		int id=0;
		String pass="";
		boolean flag= true;
		do {
			System.out.println("Nhập vào id: ");
			id=Integer.parseInt(scanner.nextLine());
			System.out.println("Nhập vào password");
			pass= scanner.nextLine();
			dos.write(id);
			dos.writeUTF(pass);
		} while (flag);
	}
	
}

package LoginTCP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private int port;

	public Server(int port) {
		super();
		this.port = port;
	}
	private void execute() throws IOException {
		ServerSocket server= new ServerSocket(port);
		Socket socket= server.accept();
		DataInputStream dis= new DataInputStream(socket.getInputStream());
		DataOutputStream dos= new DataOutputStream(socket.getOutputStream());
		int id=0;
		String pass="";
		boolean flag= true;
		do {
			id=dis.readInt();
			pass=dis.readUTF();
		} while (flag);
	}
}

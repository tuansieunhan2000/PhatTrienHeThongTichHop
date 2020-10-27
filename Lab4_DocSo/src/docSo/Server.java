package docSo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket server = new ServerSocket(1023);
			System.out.println("Server da duoc tao");
			Socket socket =server.accept();
			System.out.println("Client da ket noi den server");
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			DataInputStream in = new DataInputStream(socket.getInputStream());
			while(true) {
				String str =in.readUTF();
				System.out.println("Client: " + str);
				if(str.equalsIgnoreCase("q")) {	
					break;
				}else {
					switch (str) {
					case "0":
						out.writeUTF("Khong");
						break;
					case "1":
						out.writeUTF("Mot");
						break;
					case "2":
						out.writeUTF("Hai");
						break;
					case "3":
						out.writeUTF("Ba");
						break;
					case "4":
						out.writeUTF("Bon");
						break;
					case "5":
						out.writeUTF("Nam");
						break;
					case "6":
						out.writeUTF("Sau");
						break;
					case "7":
						out.writeUTF("Bay");
						break;
					case "8":
						out.writeUTF("Tam");
						break;
					case "9":
						out.writeUTF("Chin");
						break;
					default :
						out.writeUTF("Khong phai la so nguyen");
						break;
					}
				}
				out.flush();
			}
			in.close();
			out.close();
			socket.close();
			server.close();
		} catch (IOException e) {
			System.out.println("Ket thuc");
		}

	}

}

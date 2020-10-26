package BT2_Lab3_Socket;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static String TextSearch(String name) {
		String m = null;
		try {

			File f = new File("C:\\Users\\trana\\Desktop\\lib.txt");
			FileReader fr = new FileReader(f);
			//
			BufferedReader br = new BufferedReader(fr);
			Scanner c = new Scanner(f, "UTF-8");
			while (c.hasNextLine()) {
				String line = c.nextLine();
				if (line.contentEquals(name)) {
					m = "  ban tim co trong thu vien";
				}
			}
			if (m == null) {
				m = "  ban tim co trong thu vien";
			}
			c.close();
			fr.close();
			br.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return "Quyen sach :" + name + m;

	}

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			ServerSocket server = new ServerSocket(9540);
			Socket client = server.accept();
			Scanner inFromClient = new Scanner(client.getInputStream());
			PrintStream outToClient = new PrintStream(client.getOutputStream());
			outToClient.println("Nhap ten quyen sach can tim");
			String ten = inFromClient.nextLine();
			System.out.println(ten);
			outToClient.println(TextSearch(ten));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

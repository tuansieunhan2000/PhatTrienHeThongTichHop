package Lab3Bai2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

import com.sun.jdi.InterfaceType;

import InterfaceLab3Bai2.XuLy;

public class XuLyServer extends UnicastRemoteObject implements XuLy {
	public XuLyServer() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String TextSearch(String name) throws RemoteException {
		// TODO Auto-generated method stub
		String m = null;
		try {

			File file = new File("C:\\Users\\trana\\Desktop\\InfoPuta.txt");
			FileReader fileReader = new FileReader(file);
			//
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			Scanner scanner = new Scanner(file, "UTF-8");
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				if (line.contentEquals(name)) {
					m = " có sách trong thư viện";
				}
			}
			if (m == null) {
				m = " không có sách trong thư viện";
			}
			scanner.close();
			fileReader.close();
			bufferedReader.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		System.err.println(name + " is trying to contact!");
		return "Book name :" + name + m;
	}

}
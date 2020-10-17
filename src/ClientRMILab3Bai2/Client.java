package ClientRMILab3Bai2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

import javax.naming.NameAlreadyBoundException;
import javax.swing.JOptionPane;

import InterfaceLab3Bai2.XuLy;

public class Client {

	private static XuLy look_up;

	public static void main(String[] args) throws NotBoundException, IOException {
		// TODO Auto-generated method stub
		XuLy xuLy = (XuLy) Naming.lookup("rmi://localhost/xuLy");
		System.out.println("Nhập tên quyển sách cần tìm: ");
		Scanner scanner = new Scanner(System.in);
		String txt=scanner.nextLine();
		String response = look_up.TextSearch(txt);
		JOptionPane.showMessageDialog(null, response);
	}

}

package ClientRMILab3Bai5;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

import InterfaceLab3Bai5.InterfaceLab3Bai5;

public class client {
	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		InterfaceLab3Bai5 myInterfaceLab3Bai5= (InterfaceLab3Bai5) Naming.lookup("rmi://localhost/daoNguocChuoi");
		System.out.println("Nhập vào 1 chuỗi:");
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		myInterfaceLab3Bai5.reverseWordInMyString(str);
	}
}

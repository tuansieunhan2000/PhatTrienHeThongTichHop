package lab5;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		try {
			QuanlyCB ql = (QuanlyCB) Naming.lookup("rmi://localhost:1099/QuanlyCB");
			Scanner in = new Scanner(System.in);

			while (true) {
				System.out.println("Cac tuy chon:\n" + "1. Xem thong tin chuyen bay\n" + "2. Mua ve\n" + "3. Tra ve\n"
						+ "4.Thoat");
				switch (in.nextLine()) {
				case "1":
					System.out.println(ql.xem());
					break;
				case "2":
					System.out.println("Nhap so hieu chuyen bay: ");
					String sh = in.nextLine();
					System.out.println("Nhap so luong ve muon mua: ");
					int sl = in.nextInt();
					in.nextLine();
					if (ql.muave(sh, sl))
						System.out.println("Mua thanh cong");
					else
						System.out.println("Mua that bai");
					break;
				case "3":
					System.out.println("Nhap so hieu chuyen bay: ");
					String sht = in.nextLine();
					System.out.println("Nhap so luong ve muon tra: ");
					int slt = in.nextInt();
					in.nextLine();
					if (ql.trave(sht, slt))
						System.out.println("thanh cong");
					else
						System.out.println("that bai");
					break;
				case "4":
					in.close();
					System.exit(1);
				default:
					System.out.println("Lua chon ko phu hop");
					break;
				}

			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

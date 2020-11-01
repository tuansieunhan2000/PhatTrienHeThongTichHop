package lab5;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) {
		try {
			QuanlyCB ql = new Quanli();
			Naming.rebind("rmi://localhost:1099/QuanlyCB", ql);
			System.out.println("Server da san sang");
			Scanner in = new Scanner(System.in);
			ql.taocb();
			while (true) {
				System.out.println("Cac tuy chon:\n" 
						+ "1. Xem thong tin chuyen bay\n" 
						+ "2. Them chuyen bay\n"
						+ "3. Xoa chuyen bay\n");
				switch (in.nextLine()) {
				case "1":
					System.out.println(ql.xem());
					break;
				case "2":
					Chuyenbay cb=new Chuyenbay();
					System.out.println("Nhap so hieu chuyen bay: ");
					cb.setSoHieu(in.nextLine());
					System.out.println("Nhap ngay bay: ");
					cb.setNgayBay(in.nextLine());
					System.out.println("Nhap noi di: ");
					cb.setNoiDi(in.nextLine());
					System.out.println("Nhap noi den: ");
					cb.setNoiDen(in.nextLine());
					System.out.println("Nhap thoi gian bay: ");
					cb.setThoiGian(in.nextLine());
					System.out.println("Nhap so ghe: ");
					cb.setGhe(in.nextInt());
					in.nextLine();
					cb.setGheDaBan(0);
					cb.setGheTrong(0);
					if (ql.themcb(cb))
						System.out.println("Them thanh cong");
					else
						System.out.println("Them that bai");
					break;
				case "3":
					System.out.println("Nhap so hieu chuyen bay muon xoa: ");
					String shx = in.nextLine();
					if (ql.xoacb(shx))
						System.out.println("Xoa thanh cong");
					else
						System.out.println("Xoa that bai");
					break;
				default:
					System.out.println("Lua chon ko phu hop");
					break;
				}
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package Lab3Bai2;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server {

	public static void main(String[] args) throws RemoteException, MalformedURLException {
		// TODO Auto-generated method stub
		LocateRegistry.createRegistry(1099);

		try {
			Naming.rebind("rmi://localhost/xuLy", new XuLyServer());
            System.err.println("Kết nối thành công");
        } catch (Exception e) {

            System.err.println("Lỗi : " + e.toString());
            e.printStackTrace();

        }

	}

}

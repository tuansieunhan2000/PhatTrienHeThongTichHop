package Lab3Bai5;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server {
	public static void main(String[] args) throws RemoteException, MalformedURLException {
		LocateRegistry.createRegistry(1099);
		Naming.rebind("rmi://localhost/daoNguocChuoi", new DaoNguocChuoi());
		
	}
}

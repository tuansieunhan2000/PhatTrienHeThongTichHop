package InterfaceLab3Bai2;

import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface XuLy extends Remote {
	public String TextSearch(String name) throws RemoteException;
}

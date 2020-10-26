package InterfaceLab3Bai5;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceLab3Bai5 extends Remote{
	void reverseWordInMyString(String str) throws RemoteException;
}

package lab5;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class Quanli extends UnicastRemoteObject implements QuanlyCB {
	private static final long serialVersionUID = 1L;

	public Quanli() throws RemoteException {
		super();
		
	}

	ArrayList<Chuyenbay> data = new ArrayList<Chuyenbay>();
	
	@Override
	public ArrayList<Chuyenbay> taocb() throws RemoteException {
		data.add(new Chuyenbay("CB01", "1/11/2020", "HCM", "KG", "2h", 100, 0, 0));
		data.add(new Chuyenbay("CB02", "26/01/2020", "HCM", "DN", "3h", 100, 0, 0));
		data.add(new Chuyenbay("CB03", "2/11/2020", "HCM", "DL", "4h", 100, 0, 0));
		data.add(new Chuyenbay("CB04", "3/11/2020", "HCM", "HCM", "1h", 100, 0, 0));
		return data;
	}

	@Override
	public String xem() throws RemoteException {
		String tmp="";
		for (Chuyenbay cb : data) {
			tmp +=cb.toString()+"\n";
		}
		return tmp;

	}

	@Override
	public boolean muave(String sh, int sl) throws RemoteException {
		for (Chuyenbay cb : data) {
			if (cb.getSoHieu().equalsIgnoreCase(sh)) {
				int b = cb.getGheDaBan();
				cb.setGheDaBan(b + sl);
				cb.setGheTrong(cb.getGhe()-cb.getGheDaBan());
				return true;
			}
		}
		return false;
	}
	public boolean trave(String sh, int sl) throws RemoteException {
		for (Chuyenbay cb : data) {
			if (cb.getSoHieu().equalsIgnoreCase(sh)) {
				int b = cb.getGheDaBan();
				if(b>=sl) {
				cb.setGheDaBan(b - sl);
				cb.setGheTrong(cb.getGhe()-cb.getGheDaBan());
				return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean themcb(Chuyenbay cbt) throws RemoteException {
		for (Chuyenbay cb : data) {
			if (cb.getSoHieu().equalsIgnoreCase(cbt.getSoHieu()))
				return false;
		}
		data.add(cbt);
		return true;
	}

	@Override
	public boolean xoacb(String sh) throws RemoteException {
		Chuyenbay cb = null;
        int size = data.size();
        for (int i = 0; i < size; i++) {
            if (data.get(i).getSoHieu().equalsIgnoreCase(sh)) {
                cb = data.get(i);
                break;
            }
        }
            return data.remove(cb);
	}

	

}

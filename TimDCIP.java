package IPAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TimDCIP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress host = InetAddress.getByName("youtube.com");
//			String hostName = host.getHostName();
			System.out.println("host name : " +host.getHostName());
			System.out.println("IP : " + host.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO: handle exception
			System.out.println("khong tim thay dia chi");
			return;
		}
	}

}

import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL url= new URL("https://www.facebook.com/");
			System.out.println("Protocol: "+url.getProtocol());  
			System.out.println("Host Name: "+url.getHost());  
			System.out.println("Port Number: "+url.getPort());  
			System.out.println("File Name: "+url.getFile());  
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

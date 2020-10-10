package URLclass;

import java.net.MalformedURLException;
import java.net.URL;

public class getURLparts {
	public static void main(String[] args) {
		try {
			URL u = new URL("https://www.youtube.com/watch?v=Eb8fj-jstNo");
			System.out.println("URL is : " + u);
			System.out.println("the protocol part is : " + u.getProtocol());
			System.out.println("the host part is : " + u.getHost());
			System.out.println("the file part is : " + u.getFile());
			System.out.println("the reference paart is : " + u.getRef());
		} catch (MalformedURLException e) {
			// TODO: handle exception
			System.err.println(e);
		}
	}
}

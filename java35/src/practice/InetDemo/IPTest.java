package practice.InetDemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPTest {
	public static void main(String[] args) {
		try {
			InetAddress ip = InetAddress.getLocalHost();
			String s = ip.getHostName();
			System.out.println(s);
			String s2 = ip.getHostAddress();
			System.out.println(s2);
			ip = ip.getByName("www.baidu.com");
			System.out.println(ip.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

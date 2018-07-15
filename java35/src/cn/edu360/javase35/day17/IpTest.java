package cn.edu360.javase35.day17;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpTest {
	public static void main(String[] args) {
		InetAddress ip;
		try {
			ip = InetAddress.getLocalHost();
			System.out.println(ip.getHostName());
			System.out.println(ip.getHostAddress());
			ip=InetAddress.getByName("申深深");
			System.out.println(ip.getHostAddress());
			System.out.println(ip.getHostName());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}	

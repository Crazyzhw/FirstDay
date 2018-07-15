package practice.InetDemo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UdcClientDemo {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			String line ;
			DatagramSocket ds = new DatagramSocket();
			while((line=sc.nextLine())!=null) {
			DatagramPacket dp = new DatagramPacket(line.getBytes(), line.getBytes().length, InetAddress.getByName("192.168.6.103"), 8888);
			ds.send(dp);
			if("886".equals(line)) {
				break;
			}
			}
			
			ds.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}		

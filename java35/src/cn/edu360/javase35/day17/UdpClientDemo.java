package cn.edu360.javase35.day17;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UdpClientDemo {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			DatagramSocket ds = new DatagramSocket();
			InetAddress ip = InetAddress.getByName("192.168.6.10");
			String s ;
			while((s=sc.nextLine())!=null) {
			byte[] bs = s.getBytes();
			DatagramPacket dp = new DatagramPacket(bs, bs.length, ip, 9999);
			ds.send(dp);
			if("over".equals(s)) {
//				System.exit(0);
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

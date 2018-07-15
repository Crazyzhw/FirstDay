package cn.edu360.javase35.day17.ChatRoom;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class ChatRoomClient implements Runnable {

	@Override
	public void run() {
		try {
			Scanner sc = new Scanner(System.in);
			DatagramSocket ds = new DatagramSocket();
			InetAddress ip = InetAddress.getByName("192.168.6.255");
			String s ;
			while((s=sc.nextLine())!=null) {
			byte[] bs = s.getBytes();
			DatagramPacket dp = new DatagramPacket(bs, bs.length, ip, 7777);
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

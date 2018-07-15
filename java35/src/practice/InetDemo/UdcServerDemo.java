package practice.InetDemo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdcServerDemo {
	public static void main(String[] args) {
		try {
			DatagramSocket ds = new DatagramSocket(8888);
			DatagramPacket dp = new DatagramPacket(new byte[1024], 1024);
			while(true) {
				ds.receive(dp);
				byte[] data = dp.getData();
				int i = dp.getLength();
				InetAddress address = dp.getAddress();
				System.out.println(address.getHostAddress()+":"+new String(data,0,i));
				if ("886".equals(new String(data,0,i))) {
					break;
				}
			}
//			ds.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

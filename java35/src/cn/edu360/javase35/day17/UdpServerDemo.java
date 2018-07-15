package cn.edu360.javase35.day17;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpServerDemo {
	public static void main(String[] args) {
		try {
			DatagramSocket ds = new  DatagramSocket(9999);
			byte[] bs =new byte [64*1024];
			DatagramPacket dp = new DatagramPacket(bs, bs.length);
			while(true) {
			ds.receive(dp);
			byte[] data = dp.getData();
			InetAddress address = dp.getAddress();
			int length = dp.getLength();
			System.out.println(address+":"+new String(data,0,length));
			
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
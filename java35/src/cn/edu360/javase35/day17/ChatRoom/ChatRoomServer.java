package cn.edu360.javase35.day17.ChatRoom;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ChatRoomServer implements Runnable{
	@Override
	public void run() {
		try {
			DatagramSocket ds = new  DatagramSocket(7777);
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
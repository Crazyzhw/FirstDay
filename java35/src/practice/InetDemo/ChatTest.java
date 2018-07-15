package practice.InetDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChatTest {
	public static void main(String[] args) {
		try {
		DatagramSocket dp1=	new DatagramSocket();
		DatagramSocket dp2=	new DatagramSocket(8888);
		ExecutorService pool = Executors.newCachedThreadPool();
		pool.execute(new UdpServer(dp2));
		pool.execute(new UdpClient(dp1));
		
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
	}
}
class  UdpClient implements Runnable{
	private DatagramSocket ds;
	public UdpClient(DatagramSocket ds) {
		super();
		this.ds = ds;
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		String line;
		try {
		while((line = sc.nextLine())!=null) {
				DatagramPacket dp = new DatagramPacket(line.getBytes(), 
						line.getBytes().length,InetAddress.getLocalHost(),8888);
				ds.send(dp);
				if("over".equals(line)) {
					break;
				}
			}
		
		ds.close();
		}
		catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}
}
class UdpServer implements Runnable{
	private DatagramSocket ds;
	public UdpServer(DatagramSocket ds) {
		super();
		this.ds = ds;
	}
	public void run() {
		try {
			while(true) {
		byte [] bs = new byte[1024];
		DatagramPacket dp =new DatagramPacket(bs, bs.length);
			ds.receive(dp);
			byte[] d = dp.getData();
			String  data = new String(d,0,dp.getLength());
			String address = dp.getAddress().getHostAddress();
			System.out.println(address+":"+data);
			if("over".equals(data)) {
				System.out.println(dp.getAddress().getHostAddress()+"离开了");
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
package cn.edu360.javase35.day17;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerDemo {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(9898);
			Socket s = ss.accept();
			InputStream in = s.getInputStream();
			byte [] bs = new byte [1024];
			int len ;
			while((len =in.read(bs))!=-1) {
				if("over".equals(new String(bs,0,len))) {
					s.shutdownInput();
					break;
				}
				System.out.println(new String(bs,0,len));
			}
			OutputStream out = s.getOutputStream();
			out.write("收到".getBytes());
			s.close();
			ss.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

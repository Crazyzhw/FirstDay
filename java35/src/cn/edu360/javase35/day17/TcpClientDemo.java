package cn.edu360.javase35.day17;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClientDemo {
	public static void main(String[] args) {
		try {
			Socket  s = new Socket("192.168.6.103", 9898);
			OutputStream out = s.getOutputStream();
			out.write("over".getBytes());
			out.write("风萧萧兮易水寒".getBytes());
			s.shutdownOutput();
			InputStream in = s.getInputStream();
			byte [] bs  =new byte [1024];
			int len ;
			while((len = in.read(bs))!=-1) {
				System.out.println(new String (bs));
			}
			out.close();
			s.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

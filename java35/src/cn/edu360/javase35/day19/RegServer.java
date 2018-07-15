package cn.edu360.javase35.day19;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class RegServer {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(10000);
			Socket s = ss.accept();
			InputStream is = s.getInputStream();
			byte[] bs = new byte[1024];
			int len =is.read(bs);
			String str = new String(bs,0,len);
			System.out.println(str);
			PrintWriter pw  = new PrintWriter(s.getOutputStream(),true);
			pw.write("<font color='red' size ='8'>  注册成功 </font>");
			s.close();
			ss.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

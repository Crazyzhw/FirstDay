package practice.InetDemo;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class TcpClientDemo {
	public static void main(String[] args) {
		try {
			Socket  s = new Socket("192.168.6.103", 9000);
			OutputStream out = s.getOutputStream();
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));
			bw.write("shdda");
			bw.newLine();//不写newline的话，readerLine读取一行的话不会停止，会阻塞
			bw.flush();
			InputStream in = s.getInputStream();
			byte[] bs = new byte[1024];
			int len = in.read(bs);
			System.out.println(new String(bs,0,len));
			s.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

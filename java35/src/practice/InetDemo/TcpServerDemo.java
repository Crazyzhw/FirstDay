package practice.InetDemo;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerDemo {
public static void main(String[] args)  {
	  ServerSocket ss;
	try {
		ss = new  ServerSocket(9000);
		Socket s = ss.accept();
		InputStream in = s.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String str = br.readLine();
		System.out.println(str);
		OutputStream os =s.getOutputStream();
		os.write("收到".getBytes());
		s.close();
		ss.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

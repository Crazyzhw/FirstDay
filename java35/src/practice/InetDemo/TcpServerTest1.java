package practice.InetDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerTest1 {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(8888);
			Socket s = ss.accept();
			BufferedReader bf = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String  line;
			while((line=bf.readLine())!=null) {
				System.out.println(line);
				if("over".equals(line)) {
					break;
				}
			}
			s.close();
			ss.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

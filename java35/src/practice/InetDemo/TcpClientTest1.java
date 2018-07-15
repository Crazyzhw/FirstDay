package practice.InetDemo;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class TcpClientTest1 {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("localHost", 8888);
			Scanner sc = new Scanner(System.in);
			String  line ;
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			while((line = sc.nextLine())!=null) {
				bw.write(line);
				bw.newLine();
				bw.flush();
				if("over".equals(line)) {
					break;
				}
			}
			s.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

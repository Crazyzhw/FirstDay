package practice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class TCPClientTest {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("local Host", 9999);
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("")) ;
			BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());
			byte [] bs= new byte[1024];
			int len;
			while((len =bis.read(bs))!=-1) {
				bos.write(bs,0,len);	
			}
			bis.close();
			s.close();	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

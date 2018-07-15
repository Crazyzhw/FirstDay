package practice.InetDemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

public class UploadClient {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("localHost", 9999);
			BufferedInputStream  bis = new BufferedInputStream(new FileInputStream("F:\\b\\325 - 副本 (2).jpg")); 
			BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());
			byte [] bs= new byte[1024];
			int len;
			while((len =bis.read(bs))!=-1) {
				bos.write(bs,0,len);
			}
				
			bos.close();
			s.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}	

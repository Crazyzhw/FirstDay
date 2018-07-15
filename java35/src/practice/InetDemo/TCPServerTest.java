package practice.InetDemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerTest {
	public static void main(String[] args) {
		ServerSocket ss;
		try {
			ss = new ServerSocket(8888);
			while(true) {
				Socket s = ss.accept();
				new Thread(new UploadTask(s)).start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}


class UploadTask implements Runnable{
	Socket s;
	public UploadTask(Socket s) {
		super();
		this.s = s;
	}
	public void run() {
		try {
			BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(""));
			byte[] bs=new byte[1024];
			int len;
			while((len=bis.read(bs))!=-1) {
				bos.write(bs,0,len);
			}
			bis.close();
			s.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

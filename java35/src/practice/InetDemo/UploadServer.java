package practice.InetDemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public	 class UploadServer {
	public static void main(String[] args) throws IOException {
		
			ServerSocket ss = new ServerSocket(9999);
			while(true) {
			Socket s = ss.accept();
			new Thread(new UploadThread(s)).start();
			}
	
}
}
class UploadThread implements  Runnable{
	Socket s;
	public UploadThread(Socket s) {
		super();
		this.s = s;
	}
	public void run() {
		try {
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("e:\\"+System.currentTimeMillis()+".jpg"));
		BufferedInputStream bis = new BufferedInputStream(s.getInputStream()) ;
		byte[] bs = new byte[1024];
		int len;
		while((len = bis.read(bs))!=-1) {
			bos.write(bs,0,len);
		}
		bos.close();
		s.close();
	} catch (IOException e) {
		// TODO nAuto-generated catch block
		e.printStackTrace();
	}
		
	}
	
	
	
	
	
}

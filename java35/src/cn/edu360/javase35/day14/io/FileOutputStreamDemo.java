package cn.edu360.javase35.day14.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args) {
		FileOutputStream fos =null;
		try {
			fos= new FileOutputStream ("e:/a.txt");
			fos.write(355);
			fos.write("竟然会感慨".getBytes(),9, 6);
			fos.write("你好不好".getBytes());
			fos.write('\n');
			fos.write("只有我守着安静的沙漠等待着花开,".getBytes());
			fos.write('\n');
			fos.write("只有我等待着花开".getBytes());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(fos!=null)
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

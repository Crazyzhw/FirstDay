package cn.edu360.javase35.day14.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args)  {
		try (
				FileInputStream fis = new FileInputStream("e:/a.txt");
				){
//			int b=fis.read();
//			System.out.println(b);
			byte [] bt = new byte [1024];
			int c = fis.read(bt);
			System.out.println(c);
			String s = new String(bt,0,c);
			System.out.println(s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

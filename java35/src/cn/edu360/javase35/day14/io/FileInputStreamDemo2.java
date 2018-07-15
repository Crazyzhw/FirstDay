package cn.edu360.javase35.day14.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamDemo2 {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("F:\\JAVA资料\\day12\\资料\\知识点回顾.txt");) {
			byte []b=new byte[1024];
			int len=0;
			while(len!=-1) {
				len=fis.read(b);
				if(len!=-1)
				System.out.println(new String(b,0,len));
			}
			while((len=fis.read(b))!=-1) {
				System.out.println(new String(b,0,len));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

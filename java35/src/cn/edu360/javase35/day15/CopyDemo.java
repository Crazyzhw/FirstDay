package cn.edu360.javase35.day15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CopyDemo {
	public static void main(String[] args) {
		try (
				InputStreamReader isr = new InputStreamReader(new FileInputStream("F:\\JAVA资料\\day01\\资料\\今日总结.txt"));
				OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("e:/b.txt"));
				){
				char [] chs = new char[1024];
				int len;
				while((len =isr.read(chs))!=-1) {
					osw.write(chs, 0, len);
				}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}
}

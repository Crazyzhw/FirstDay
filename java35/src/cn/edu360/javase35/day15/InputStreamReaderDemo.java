package cn.edu360.javase35.day15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {

	public static void main(String[] args) {
			try (
					InputStreamReader isr = new InputStreamReader(new FileInputStream("e:/a.txt"));
					){
					char [] chs = new char [1024];
					int len;
					while((len= isr.read(chs))!=-1) {
						String s = new String (chs,0,len);
						System.out.println(s);
					}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}

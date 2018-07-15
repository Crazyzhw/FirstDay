package cn.edu360.javase35.day15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderDemo {

	public static void main(String[] args) {
		try (
				FileReader fr =new FileReader("e:/a.txt");
				FileWriter fw = new FileWriter("e:/a.txt",true);
				){
			char [] chs = new char[1024];
			int len;
			while((len=fr.read(chs))!=-1)
			System.out.println(new String(chs,0,len));
			fw.write("aaaa");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

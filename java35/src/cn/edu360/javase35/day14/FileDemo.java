package cn.edu360.javase35.day14;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		File f = new File ("E:/c");
		f.createNewFile();
		System.out.println(f.renameTo(new File("E:/c.jpg")));
		File f1 = new File("e:/b");
		f1.mkdirs();
	}
}

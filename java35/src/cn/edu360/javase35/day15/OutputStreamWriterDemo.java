package cn.edu360.javase35.day15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {

	public static void main(String[] args) {
		try(
				OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("e:/a.txt"));
				) {
				osw.write("今天没\r\n有球看");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

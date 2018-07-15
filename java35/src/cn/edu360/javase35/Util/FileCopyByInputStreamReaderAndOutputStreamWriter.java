package cn.edu360.javase35.Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileCopyByInputStreamReaderAndOutputStreamWriter {
	public static void FileCopyByInputStreamReaderAndOutputStreamWriter(String surPath,String destPath) {
		try (
				InputStreamReader isr = new InputStreamReader(new FileInputStream(surPath));
				OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(surPath));
				){
			char[]chs = new char[1024];
			int len ;
			while((len =isr.read(chs))!=-1) {
				osw.write(chs,0,len);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

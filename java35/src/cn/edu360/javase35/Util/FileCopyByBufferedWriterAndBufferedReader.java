package cn.edu360.javase35.Util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopyByBufferedWriterAndBufferedReader {
	public static void FileCopyByFileWriterAndFileReder(String surPath,String destPath) {
		try (
				FileReader fr = new FileReader(surPath);
				FileWriter fw = new FileWriter(destPath);
				BufferedReader br = new BufferedReader(fr);
				BufferedWriter bw = new BufferedWriter(fw);
				){
				char [] chs = new char[1024];
				int len;
				while((len=br.read(chs))!=-1) {
					bw.write(chs, 0, len);
				}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
}
}

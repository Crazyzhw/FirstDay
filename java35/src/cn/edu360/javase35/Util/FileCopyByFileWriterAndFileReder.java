package cn.edu360.javase35.Util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopyByFileWriterAndFileReder {
		public static void FileCopyByFileWriterAndFileReder(String surPath,String destPath) {
			try (
					FileReader fr = new FileReader(surPath);
					FileWriter fw = new FileWriter(destPath);
					){
					char [] chs = new char[1024];
					int len;
					while((len=fr.read(chs))!=-1) {
						fw.write(chs, 0, len);
					}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}

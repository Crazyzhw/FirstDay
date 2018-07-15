package cn.edu360.javase35.Util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyBufferedDemo {
	public static void FileCopy(String srcPath,String destPath) {
		try (
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcPath));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destPath));
				){
				byte [] bs = new byte[1024];
				int len;
				while((len=bis.read(bs))!=-1) {
					bos.write(bs,0,len);
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

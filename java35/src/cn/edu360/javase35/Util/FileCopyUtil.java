package cn.edu360.javase35.Util;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyUtil {
	public static void fileCopyByFileInputStreamAndFileOutputStream(String srcPath,String destPath) {
		try (
				FileInputStream fis  = new FileInputStream(srcPath);
				FileOutputStream fos = new FileOutputStream(destPath);
				){	
				byte [] bs = new byte[1024];
					int len;
					while((len=fis.read(bs))!=-1) {
						fos.write(bs,0,len);
					}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

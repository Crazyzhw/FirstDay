package cn.edu360.javase35.day15;
/**
 * 赋值多级文件
 * 将 F:\\b复制到f:/e下面
 */
import java.io.File;

import cn.edu360.javase35.Util.FileCopyBufferedDemo;

public class IOTest2 {
	public static void main(String[] args) {
		copyMultiFolder("F:\\b","f:/e");
	}
	public static void copyMultiFolder(String srcPath,String destPath) {
		File srcFile = new File(srcPath);
		File destFile = new File(destPath);
		if(!destFile.exists()) {
			destFile.mkdirs();
		}
		File newFile = new File(destPath,srcFile.getName());
		if(srcFile.isFile()) {
			FileCopyBufferedDemo.FileCopy(srcFile.getAbsolutePath(), newFile.getAbsolutePath());
		}else {
//			File newFile = new File(destPath,srcFile.getName());
			File[] listFiles = srcFile.listFiles();
			if(listFiles!=null&&listFiles.length>0) {
				for (File file : listFiles) {
					copyMultiFolder(file.getAbsolutePath(),newFile.getAbsolutePath());
				}
			}
		}
	}
}

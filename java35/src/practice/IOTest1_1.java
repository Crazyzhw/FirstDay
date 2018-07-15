package practice;

import java.io.File;
import java.io.FileFilter;

import cn.edu360.javase35.Util.FileCopyBufferedDemo;

/**
 * * 复制单级文件
 * 将f:/b中的以.txt结尾的文件复制到f:/e中
 *
 */
public class IOTest1_1 {
	public static void main(String[] args) {
		copy("f:/b","f:/e",".jpg");
	
	}
	public static void copy (String surpath,String destpath,String suffix) {
		File surPath = new File(surpath);
		File destPath = new File(destpath);
		File[] listFiles = surPath.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.getName().endsWith(suffix);
			}
		});
		if(!destPath.exists()) {
			destPath.mkdirs();
		}
		if(listFiles!=null&&listFiles.length>0) {
			for (File file : listFiles) {
				
				FileCopyBufferedDemo.FileCopy(file.getAbsolutePath(), destPath+"/"+System.currentTimeMillis()+suffix);
			}
		}
	}
}

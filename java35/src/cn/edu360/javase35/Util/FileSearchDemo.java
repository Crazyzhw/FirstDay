package cn.edu360.javase35.Util;

import java.io.File;
import java.io.FileFilter;

public class FileSearchDemo {
	public static void main(String[] args) {
		String path = "e:\\";
		String suf =".java";
		FileSearch(path,suf);
		
	}

	private static void FileSearch(String path, String suf) {
			File f = new File (path);
			if(!f.exists()) {
				throw new RuntimeException(path+"路径错误");
			}
			if(f.isFile()) {
				if(f.getAbsolutePath().endsWith(suf)) {
					System.out.println(f.getAbsolutePath());
				}
			}else {
				File[] list = f.listFiles();
				if(list!=null&&list.length>0){
					for (File file : list) {
						FileSearch(file.getAbsolutePath(),suf);
					}
				}
			}
	}
}

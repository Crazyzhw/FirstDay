package cn.edu360.javase35.day14.io;

import java.io.File;

public class FileSearchDemo {
	public static void main(String[] args) {
		FileSearch("e:/", ".jpg");
	}
	
	public static void FileSearch (String path ,String suf) {
		File file = new File(path);
		if(file.isFile()) {
			if(file.getName().endsWith(suf))
			System.out.println(file.getAbsolutePath());
		}else {
				File[] list = file.listFiles();
				if(list!=null&&list.length>0) {
				for (File f : list) {
					FileSearch( f.getAbsolutePath(),suf);
				}
			}
		}
	}
	
}

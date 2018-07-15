package cn.edu360.javase35.day14;

import java.io.File;

//找出文件夹下面所有的以***结尾的文件
public class Recursive2 {
	public static void main(String[] args) {
		finfAllFiles("E:\\",".java");
	}
	public static void finfAllFiles(String path,String sur){
		File f = new File(path);
		if(f.isFile()) {
			if(f.getName().endsWith(sur))
			System.out.println(f.getAbsolutePath());
		}else {
				File[] list = f.listFiles();
				if(list!=null&&list.length>0) {
				for (File file : list) {
					finfAllFiles(file.getAbsolutePath(),sur);
				}
			}
		}
			
	}
	
}

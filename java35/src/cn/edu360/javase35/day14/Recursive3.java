package cn.edu360.javase35.day14;

import java.io.File;

public class Recursive3 {
	public static void main(String[] args) {
		deleteAllFiles("E:\\a");
	}
	public static void  deleteAllFiles(String path ) {
		File f= new File(path);
		if(f.isFile()) {
			f.delete();
		}else {
			File[] files = f.listFiles();
			if(files!=null&&files.length>0){
			for (File file : files) {
					deleteAllFiles(file.getAbsolutePath());
				}
			f.delete();
			System.out.println("删除成功");
			}
		}
	}
	
}

package practice;

import java.io.File;

import cn.edu360.javase35.Util.FileCopyBufferedDemo;

public class IOTest2_1 {
	public static void main(String[] args) {
		copy("F:\\b","f:/e");

	}
	public static void copy(String sur,String dest) {
		File s = new File(sur);
		File d = new File(dest);
		if(!d.exists()) {
			d.mkdirs();
		}
		File n= new File(dest,s.getName());
		if(s.isFile()) {
			FileCopyBufferedDemo.FileCopy(s.getAbsolutePath(),n.getAbsolutePath() );
		}else {
			File[] listFiles = s.listFiles();
			if(listFiles!=null&&listFiles.length>0) {
				for (File file : listFiles) {
					copy(file.getAbsolutePath(),n.getAbsolutePath());
				}
			}
		}
	}

}

package practice;

import java.io.File;

import javax.management.RuntimeErrorException;

import cn.edu360.javase35.Util.FileCopyBufferedDemo;
//将原文件拷贝到目标文件目录下

public class MutilFileCopy {
	public static void main(String[] args) {
		File sur = new File("f:\\b");
		File  dest = new File("f:\\a");
		MutilFileCopy(sur,dest);
	}

	private static void MutilFileCopy(File sur, File dest) {
//		1.检查目标文件和源文件是否存在
		if(!sur.exists()) {
			throw new RuntimeException(sur.getAbsolutePath()+"不存在");
		}
		if(!dest.exists()) {
			dest.mkdirs();
		}
//		2.判断目标文件是否为文件,创建需要拷贝的目录
		File n = new File(dest,sur.getName());
		if(sur.isFile()) {
			FileCopyBufferedDemo.FileCopy(sur.getAbsolutePath(), n.getAbsolutePath());
		}else {
			File[] list = sur.listFiles();
			if(list!=null&&list.length>0) {
				for (File file : list) {
					MutilFileCopy(file,n);
				}
			}
		}
		
	}
}

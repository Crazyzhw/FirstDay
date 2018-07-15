package practice;

import java.io.File;

public class FileSearch {
	public static void main(String[] args) {
		String path ="e:\\";
		String suf=".java";
		fileSearch(path,suf);
	}

	public static void fileSearch(String path, String suf) {
		File f = new File(path);
		if(!f.exists()) {
			System.out.println("文件路径有误");
		}
		if(f.isFile()) {
			if( f.getName().endsWith(suf)) {
				System.out.println(f.getAbsolutePath());
			}
		}else  {
			File[] files = f.listFiles();
			if(files!=null&&files.length>0) {
			for (File file : files) {
				fileSearch(file.getAbsolutePath(),suf);
			}
			}
		}
		
	}
}

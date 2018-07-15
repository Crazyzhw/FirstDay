package cn.edu360.javase35.day14;

import java.io.File;
import java.io.FilenameFilter;

public class FileTest {
	public static void main(String[] args) {
		File f = new File("f:/b");
		f.mkdirs();
		String[] list = f.list();
		/*for (String string : list) {
			if(string.endsWith(".jpg")) {
				System.out.println(string);
			
			}*/
			String[] list2 = f.list(new FilenameFilter() {
//				判断是否为文件，而且是否满足name
				public boolean accept(File dir, String name) {
					File f= new File(dir,name);
					if(f.isFile()&&name.endsWith(".jpg")) {
					return true ;
				}
				return false;
				}
			});	
			for (String string1 : list2) {
				System.out.println(string1);
			}
	
	}
}




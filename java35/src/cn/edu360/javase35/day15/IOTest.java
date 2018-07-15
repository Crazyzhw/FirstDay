package cn.edu360.javase35.day15;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

import cn.edu360.javase35.Util.FileCopyBufferedDemo;
/**
 * 复制单级文件
 * 将f:/b中的以.txt结尾的文件复制到f:/e中
 * @author Administrator
 *
 */
public class IOTest {
	public static void main(String[] args) {
		copySingleFoder("f:/b",".txt","f:/e");
		
		
	}
	public static void copySingleFoder(String path,String suf ,String dest) {
			File f= new File(path);
			/*File[] listFiles = f.listFiles(new FilenameFilter() {
				
				@Override
				public boolean accept(File dir, String name) {
					File f= new File(dir,name);
					return f.isFile()?f.getName().endsWith(suf):false;
				}
			});*/
			File[] listFiles = f.listFiles(new FileFilter() {
				
				@Override
				public boolean accept(File pathname) {
					// TODO Auto-generated method stub
					return pathname.getAbsolutePath().endsWith(suf);
				}
			});
			File f1 =new File(dest);
			if (!f1.exists()) {
				f1.mkdirs();
			}
			if(listFiles!=null&&listFiles.length>0) {
			for (File file : listFiles) {
				/*String s =""+System.currentTimeMillis();
				FileCopyBufferedDemo.FileCopy(file.getAbsolutePath(), dest+"/"+s+suf);*/
				File f2 = new File(dest,System.currentTimeMillis()+suf);
				FileCopyBufferedDemo.FileCopy(file.getAbsolutePath(),f2.getAbsolutePath());
			}
			}
	}
	
}

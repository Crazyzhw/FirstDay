package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Comparator;
//文件合并：将已经切割的文件进行合并
public class FileConsolidationDemo {
	public static void main(String[] args) {
		File surPath = new File("E:\\temp");
		File destPath = new File("e:\\目的");
		String suf =".mp4";
		Consolidation(surPath,destPath,suf);
	}
//ListFiles中的数组顺序是按照不同操作系统的默认操作排序的
	public static void Consolidation(File surPath,File destPath,String suf) {
		try	{
			FileInputStream fis = null;
			FileOutputStream fos = new FileOutputStream(destPath.getAbsolutePath()+"/合并文件1"+suf);
			if(surPath.isDirectory()) {
				File[] listFiles = surPath.listFiles();
				Arrays.sort(listFiles, new Comparator<File>() {
					@Override
					public int compare( File o1, File o2) {
						return Integer.parseInt(o1.getName())-Integer.parseInt(o2.getName());
					}
				});
				int len;
				byte[] bs = new byte[1024*1024];
				for (File file : listFiles) {
					System.out.println(file.getName());
					fis = new FileInputStream(file);
					while((len =fis.read(bs))!=-1) {
						fos.write(bs,0,len);
					}
				}
			}
			fos.close();
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

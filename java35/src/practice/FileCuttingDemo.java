package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//文件切割：将文件进行切割
public class FileCuttingDemo {
	public static void main(String[] args)  {
		File surPath = new File("E:\\java学习视频\\day02\\视频\\4.a超链接标签.wmv");
		File destPath = new File("e:\\temp");
		Filecut(surPath,destPath);
	}

	public static void Filecut(File srcPath,File destPath){
		try (
				FileInputStream fis = new FileInputStream(srcPath);
				){
			if(!destPath.exists()) {
				destPath.mkdirs();
			}
			if(!srcPath.exists()) {
				throw new RuntimeException(srcPath.getAbsolutePath()+",源文件不存在");
			}
			FileOutputStream fos=null;
			byte [] buf = new byte[1024*1024];
			int len;
			int count =1;
			while((len=fis.read(buf))!=-1) {
				File f =new File(destPath,(count++)+""/*+"part"*/);
				 fos = new FileOutputStream(f);
				fos.write(buf,0,len);
				fos.close();
			}
//			Properties p = new Properties();
//			p.setProperty("partCount",Integer.toString(count));
//			p.setProperty("Type",srcPath.getName() );
//			fos = new FileOutputStream(destPath+"/配置文件.txt");
//			p.store(fos, "碎片文件信息");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}


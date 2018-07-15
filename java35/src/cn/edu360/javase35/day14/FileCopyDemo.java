package cn.edu360.javase35.day14;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyDemo {
	public static void main(String[] args) {
		FileCopy("F:\\JAVA资料\\day12\\视频\\5.二分查找.mp4", "e:/copy1.mp4");
		System.out.println("拷贝成功");
	}
	public static void FileCopy(String path,String path1) {
		try (
				FileInputStream fis = new FileInputStream(path);
				FileOutputStream fos= new FileOutputStream(path1);
				){
			int len;
			byte [] b = new byte[1024];
			while((len=fis.read(b))!=-1) {
				fos.write(b);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

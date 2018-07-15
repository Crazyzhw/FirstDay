package cn.edu360.javase35.day14.io;

import cn.edu360.javase35.Util.FileCopyBufferedDemo;
import cn.edu360.javase35.Util.FileCopyUtil;

public class Test {
	public static void main(String[] args) {
		Long a= System.currentTimeMillis();
		FileCopyUtil.fileCopyByFileInputStreamAndFileOutputStream("F:\\JAVA资料\\day12\\视频\\5.二分查找.mp4", "e:/copy1.mp4");
		Long b= System.currentTimeMillis();
		System.out.println(b-a);
		Long c= System.currentTimeMillis();
		FileCopyBufferedDemo.FileCopy("F:\\JAVA资料\\day12\\视频\\5.二分查找.mp4", "e:/copy2.mp4");
		Long d= System.currentTimeMillis();
		System.out.println(d-c);
		System.out.println("拷贝成功");
	}
}

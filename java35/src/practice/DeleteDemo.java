package practice;

import java.io.File;
import java.io.FileFilter;

public class DeleteDemo {
	public static void main(String[] args) {
		File f = new File("E:\\");
		File[] files = f.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File p) {
				return p.getName().endsWith(".jpg");
			}
		});
		for (File file : files) {
			file.delete();
		}
	}
}

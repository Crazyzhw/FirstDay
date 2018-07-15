package practice;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class FileListsDemo {
	public static void main(String[] args) {
		File f = new File("e:\\temp");
		File[] files = f.listFiles();
		Arrays.sort(files, new Comparator<File>() {
			@Override
			public int compare( File o1, File o2) {
				return Integer.parseInt(o1.getName())-Integer.parseInt(o2.getName());
			}
		});
//		Arrays.sort(files);
		for (File file : files) {
			System.out.println(file.getName());
		}
	}
}

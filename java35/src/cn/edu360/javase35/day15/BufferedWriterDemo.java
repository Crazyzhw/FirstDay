package cn.edu360.javase35.day15;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	public static void main(String[] args) {
		try(
				BufferedWriter bw = new BufferedWriter(new FileWriter("e:/a.txt"));
				) {
			bw.write("两岸猿声啼不住");
			bw.newLine();
			bw.write("轻舟已过万重山");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

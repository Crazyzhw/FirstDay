package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStream;

public class BufferedReaderAndBufferedWriter {
	public static void main(String[] args) {
		try (
				BufferedWriter bw= new BufferedWriter(new FileWriter("f:/a.txt"));
				BufferedReader be= new BufferedReader(new FileReader("f:/a.txt"));
				){
				bw.write("看月牙下的天空");
				bw.newLine();
				bw.write("在丝路之上被遗忘");
				bw.close();
				char []chs =new char[1024];
				int len;
				System.out.println(be.readLine());
				while((len=be.read(chs))!=-1) {
					System.out.println(new String(chs,0,len));
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

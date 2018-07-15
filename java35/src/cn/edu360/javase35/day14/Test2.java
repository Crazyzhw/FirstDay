package cn.edu360.javase35.day14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Test2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("你好");
		list.add("我好");
		list.add("大家好");
		list.add("好迪真好");
		 try (
				 BufferedWriter bw =new BufferedWriter(new FileWriter("e:/c.txt"));
				 BufferedReader br =new BufferedReader(new FileReader("e:/c.txt"))
				 ){
			 if(list!=null&&list.size()>0) {
			 for(String s:list) {
				bw.write(s); 
				bw.newLine();
			 }
			 }
			 bw.close();
			 String str;
			 while((str=br.readLine())!=null) {
				 System.out.println(str);
			 }
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}

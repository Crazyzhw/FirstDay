package day08.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class LocalData {
	public static void main(String[] args) {
		try (
	BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("F:\\JAVA资料\\案例资料\\day07-单车定位\\bikes.log"),"gbk"));
				){
			String line;
			while((line= br.readLine())!=null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}

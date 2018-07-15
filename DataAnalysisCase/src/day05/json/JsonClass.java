package day05.json;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.alibaba.fastjson.JSON;

public class JsonClass {
	public static void main(String[] args) {
		try (
				BufferedReader br = new BufferedReader(new FileReader("F:\\JAVA资料\\案例资料\\day04-电影排行\\rating.txt"));
				){
			String line =br.readLine();
//			System.out.println(line);
			JsonBean jsonBean = JSON.parseObject(line, JsonBean.class);
			System.out.println(jsonBean );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

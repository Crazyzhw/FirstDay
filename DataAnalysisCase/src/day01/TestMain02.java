package day01;

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMain02 {
	public static void main(String[] args) {
		try (
				BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\JAVA资料\\分析案例day01\\数据需求资料\\好友数量1.txt"));
				){
			Map<String, Integer> map = getMap();
			Set<Entry<String, Integer>> entrySet = map.entrySet();
			ArrayList<Entry<String, Integer>> list = new ArrayList<>(entrySet);
			Collections.sort(list, new Comparator<Entry<String, Integer>>() {
				@Override
				public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
					return o2.getValue()-o1.getValue();
				}
			});
			for (int i = 0; i < Math.min(3,list.size() ); i++) {
//				System.out.println(list.get(i));
				bw.write(list.get(i).toString());
				bw.newLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static Map<String, Integer> getMap() {
		Map<String,Integer> map = new HashMap<>();
	 try (
			 BufferedReader br = new BufferedReader(new FileReader("F:\\JAVA资料\\分析案例day01\\数据需求资料\\好友.txt"));
			 ){
		 String line ;
		 while((line =br.readLine())!=null) {
			 String[] split = line.split(":");
			 String userName = split[0];
			 int length = split[1].split(",").length;
			 map.put(userName, length);
		 }
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 return map;
		
	}
}

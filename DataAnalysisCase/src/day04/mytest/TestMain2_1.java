package day04.mytest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import day01.Average;

import java.util.Set;

public class TestMain2_1 {
	public static void main(String[] args) {
		try (
				BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\JAVA资料\\案例分析day04\\MYTEST/平均值浮点.txt"));
				){
		Map<String, List<Message>> map = Mytest01.getMap();
		Set<Entry<String, List<Message>>> entrySet = map.entrySet();
		Map<String, Double> map1 =new LinkedHashMap<>();
		for (Entry<String, List<Message>> entry : entrySet) {
			List<Message> value = entry.getValue();
			double sum=0;
			double aver;
			for (Message message : value) {
				sum+=message.getRate();
			}
//			System.out.println(entry.getKey()+"--"+sum+"--"+entry.getValue().size());
			aver =sum/value.size();
			map1.put(entry.getKey(), aver);
		}
		Set<Entry<String, Double>> entrySet2 = map1.entrySet();
		 List<Entry<String, Double>> list = new ArrayList<>(entrySet2);
		SortUtil1.sortByAver2(list);
		for (Entry<String, Double> entry : list) {
			bw.write("uid="+entry.getKey()+"--评分均值是："+entry.getValue());
			bw.newLine();
		}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package day04.mytest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//5.评价最高的3部电影id和评分均值
public class TestMain3 {
	public static void main(String[] args) {
		try(
				BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\JAVA资料\\案例分析day04\\MYTEST\\评价最高电影.txt"));
				) {
		
		Map<String, List<Message>> map = Mytest01.getMap();
		Map<String, List<Integer>> map1= new LinkedHashMap<>();
		Set<Entry<String, List<Message>>> entrySet = map.entrySet();
		for (Entry<String, List<Message>> entry : entrySet) {
			List<Message> value = entry.getValue();
				for (Message message : value) {
					List<Integer> list = map1.getOrDefault(message.getMovie(),new ArrayList<>());
					list.add(message.getRate());
					map1.put(message.getMovie(), list);
				}
		}
		Set<Entry<String, List<Integer>>> entrySet2 = map1.entrySet();
//		System.out.println(map1.size());
		Map<String, Double> map2 = new LinkedHashMap<>();
	for (Entry<String, List<Integer>> entry : entrySet2) {
//		System.out.println(entry.getKey()+"--"+entry.getValue());
		List<Integer> list = entry.getValue();
		double sum=0;
		double aver;
		for (Integer integer : list) {
			sum+=integer;
		}
		aver=sum/list.size();
		map2.put(entry.getKey(), aver);
	}	
	Set<Entry<String, Double>> entrySet3 = map2.entrySet();
	 List<Entry<String, Double>> list = new ArrayList<>(entrySet3);
	SortUtil1.sortByAver2(list);
	for (Entry<String, Double> entry : list) {
		System.out.println(entry.getKey()+"--"+entry.getValue());
		bw.write("电影名字："+entry.getKey()+"评分均值:"+entry.getValue());
		bw.newLine();
	}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

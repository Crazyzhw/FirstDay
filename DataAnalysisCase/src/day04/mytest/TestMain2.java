package day04.mytest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import day01.Average;

public class TestMain2 {
	public static void main(String[] args) {
		try(
			BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\JAVA资料\\案例分析day04\\MYTEST\\平均值BigDecimal.txt"));
				) {
		Map<String, List<Message>> map = Mytest01.getMap();
		Map<String, BigDecimal> map1 =new LinkedHashMap<>();
		List<Average> list = new ArrayList<>();
		Set<Entry<String, List<Message>>> entrySet = map.entrySet();
		for (Entry<String, List<Message>> entry : entrySet) {
			List<Message> value = entry.getValue();
			int sum=0;
			for (Message message : value) {
				sum+=message.getRate();
			}
			BigDecimal sum1 = new BigDecimal(sum);
			System.out.println(entry.getKey()+"----"+sum+"--"+entry.getValue().size());
			BigDecimal len = new BigDecimal(value.size());
			BigDecimal aver = sum1.divide(len, 3, RoundingMode.HALF_UP);
//			System.out.println(entry.getKey()+"---"+aver);
			map1.put(entry.getKey(),aver);
			Average average = new Average();
			average.set(entry.getKey(), aver);
			list.add(average);
		}
//			2.每个用户的uid和评分的平均值
		SortUtil1.sortByAver(list);
		for (Average entry : list) {
			bw.write(entry.toString());
			bw.newLine();
		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

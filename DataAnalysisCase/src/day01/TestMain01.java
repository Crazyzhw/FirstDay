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

public class TestMain01 {
	public static void main(String[] args)  {
		//获取用户和对应的好友数
		Map<String, Integer> map = getMap();
		try (
				BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\JAVA资料\\分析案例day01\\数据需求资料\\好友数量.txt"));
				){
			Set<Entry<String, Integer>> entrySet = map.entrySet();
			ArrayList<UserNameCount> list = new ArrayList<>();//将获得的set转成list，进行排序
			for (Entry<String, Integer> entry : entrySet) {
				list.add(new UserNameCount(entry.getKey(),entry.getValue()));
//			System.out.println(new UserNameCount(entry.getKey(),entry.getValue()));
			}
			//对list进行排序
			Collections.sort(list, new Comparator<UserNameCount>() {
				@Override
				public int compare(UserNameCount o1, UserNameCount o2) {
					return o2.getCount()-o1.getCount();
				}
			});
			for (int i = 0; i < Math.min(3, list.size()); i++) {
				System.out.println(list.get(i));
				bw.write(list.get(i).toString());
				bw.newLine();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static Map<String, Integer> getMap() {
		Map<String, Integer> map = new HashMap<>();
		try(
				BufferedReader  br = new BufferedReader(new FileReader("F:\\JAVA资料\\分析案例day01\\数据需求资料\\好友.txt"));
				) {
				String line;
				//读取数据
				while((line=br.readLine())!=null) {
//					System.out.println(line);
					//数据分割
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

package day04.mytest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mytest01 {
	public static void main(String[] args) {
		Map<String, List<Message>> map = getMap();
	}
	public static Map<String,List<Message>> getMap() {
		Map<String,List<Message>> map =new LinkedHashMap<>();
		
		try (
				BufferedReader br = new BufferedReader(new FileReader("F:\\JAVA资料\\案例资料\\day04-电影排行\\rating.txt"));
				){
			String line;
			while((line=br.readLine())!=null) {
				String substring = line.substring(1, line.length()-1);
				String[] split = substring.split(":");
				 String[] split2 = split[1].split(",");
				 String movie = split2[0];
				 String[] split3 = split[2].split(",");
				 char rate1 = split3[0].charAt(1);
				 String rate2=rate1+"";
				 int rate = Integer.parseInt(rate2);
				 String uid = split[4].substring(1, split[4].length()-1);
				 Message message = new Message();
				 message.set(movie, rate);
				 List<Message> list = map.getOrDefault(uid, new ArrayList<Message>());
				 list.add(message);
				 map.put(uid,list);
			}
//			System.out.println(map.size());
			Set<Entry<String, List<Message>>> entrySet = map.entrySet();
			/*for (Entry<String, List<Message>> entry : entrySet) {
				System.out.println(entry.getKey());
				List<Message> value = entry.getValue();
				for (Message message : value) {
					System.out.println(message);
				}
			}*/
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;
	}
}

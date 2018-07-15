package day01;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMain03 {
	public static void main(String[] args) {
		try (
				BufferedWriter  bw =new BufferedWriter(new FileWriter("F:\\JAVA资料\\分析案例day01\\数据需求资料\\共同好友.txt"));
				){
			Map<String, List<String>> map = getMap();
			ArrayList<String> list = new ArrayList<>(map.keySet());
			for (int i = 0; i < list.size()-1; i++) {
						String userNameI = list.get(i);
						List<String> listI= map.get(userNameI);
				for (int j = i+1; j < list.size(); j++) {
					String userNameJ = list.get(j);
					List<String> listJ= map.get(userNameJ);
					ArrayList<String> list2 = new ArrayList<>(listJ);
					list2.retainAll(listI);
					if(list2!=null&&list2.size()>0) {
					System.out.println(userNameI+"和"+userNameJ+"的共同好友是"+list2);
					bw.write(userNameI+"和"+userNameJ+"的共同好友是"+list2.toString());
					bw.newLine();
				}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public  static Map<String, List<String>> getMap() {
		Map<String,List<String>> map =new HashMap<>();
		try(
				BufferedReader br = new BufferedReader(new FileReader("F:\\JAVA资料\\分析案例day01\\数据需求资料\\好友.txt"));
				) {
			String line;
			while((line =br.readLine())!=null) {
				String[] split = line.split(":");
				String userName = split[0];
				String[] split2 = split[1].split(",");
				List<String> list =  Arrays.asList(split2);
//				ArrayList<String> fs = new ArrayList<>(list);
				map.put(userName, list);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;
	}
}
